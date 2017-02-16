package Danivan.controller.login;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Button;
import org.zkoss.zul.Label;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Timer;

import DanivalII.database.CDatabaseConnection;
import DanivalII.database.CDatabaseConnectionConfig;
import DanivalII.database.dao.DanivanIIDAO;
import DanivalII.database.datamodel.TBLUser;
import DanivanII.controller.home.ZKUtilities;
import DanivanII.systemconstans.SystemConstants;



public class CLoginController extends SelectorComposer<Component> {

	private static final long serialVersionUID = 5732498516787815420L;
	
	@Wire
	Textbox textboxOperator;
	
	@Wire
	Textbox textboxPassword;
	
	@Wire
	Button buttonLogin;
	
	@Wire
	Timer timerKeepAliveSession;
	
	@Wire
	Label labelMessage;

	
	@Override
    public void doAfterCompose( Component comp ) {
        
        try {
         
            super.doAfterCompose( comp );
            
            //Obtenemos el logger del objeto webApp y guardamos una referencia en la variable de clase controllerLogger
           
    
        }
        catch ( Exception ex ) {
            
// mensaje     
        }
    
    
    }    
    
    @Listen( "onChanging=#textboxOperator; onChanging=#textboxPassword" )
    public void onChangeTextbox( Event event ) {

        labelMessage.setValue( "" ); //Cuando cambie el texto en cualquiera de los dos textbox quitamos el mensaje. de error.
        
    }    
    
    @Listen( "onClick=#buttonLogin; onOK=#windowLogin" )
    public void onClickButtonLogin( Event event ) {

        try {
                        
            final String strOperator = ZKUtilities.getTextBoxValue( textboxOperator );
            
            final String strPassword = ZKUtilities.getTextBoxValue( textboxPassword );
            
            if ( strOperator.isEmpty() == false && strPassword.isEmpty() == false ) {
                
                CDatabaseConnection databaseConnection = new CDatabaseConnection();
                
                CDatabaseConnectionConfig databaseConnectionConfig = new CDatabaseConnectionConfig();
                            
                String strRunningPath = Sessions.getCurrent().getWebApp().getRealPath( SystemConstants._Web_Inf_Dir ) + File.separator;
                
                if ( databaseConnectionConfig.LoadConfig( strRunningPath + SystemConstants._Config_Dir + SystemConstants._Database_Config_File ) ) {
                    
                    if ( databaseConnection.makeConnectionToDatabase( databaseConnectionConfig ) ) {

                        TBLUser tblUsers = DanivanIIDAO.checkData( databaseConnection, strOperator, strPassword);
                        
                        if ( tblUsers != null ) {
                                            
                            labelMessage.setSclass( "" ); 
                            
                            labelMessage.setValue( "Welcome " + tblUsers.getUserName() + "!" ); 
                            
                            Session currentSession = Sessions.getCurrent();
                                                        
                            currentSession.setAttribute( SystemConstants._DB_Connection_Session_Key, databaseConnection ); 
                                                        
                            currentSession.setAttribute( SystemConstants._Operator_Credential_Session_Key, tblUsers );
                                                       
                                                      
                            List<String> loggedSessionLoggers = new LinkedList<String>();
                                                        
                            currentSession.setAttribute( SystemConstants._Logged_Session_Loggers, loggedSessionLoggers );
                                                                                  
                                                        
                            Executions.sendRedirect( "views/home/home.zul" ); 
                            
                        }
                        else {
                            
                            labelMessage.setValue( "Invalid operator name and/or password!" );
                                                                                    
                        }
                        
                    }
                    else {
                        
                        Messagebox.show( "Database connection failed" );
                        
                    }
                    
                }
                else {
                    
                    Messagebox.show( "Error when reading the database config file" );
                    
                }
                
            }
            
        }
        catch ( Exception ex ) {
            
//mensaje       
            
        }
    
    }    
    
    @Listen("onTimer=#timerKeepAliveSession" )
    public void onTimer( Event event ) {
                        
        Clients.showNotification( "Automatic renewal of the session successful", "info",  null, "before_center", 2000, true );
        
    }
    
}

