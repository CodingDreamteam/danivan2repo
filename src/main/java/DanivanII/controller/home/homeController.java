package DanivanII.controller.home;

import java.io.File;
import java.util.LinkedList;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Tab;
import org.zkoss.zul.Tabbox;
import org.zkoss.zul.Tabpanel;

import DanivalII.database.datamodel.TBLProductos;
import DanivanII.systemconstans.SystemConstants;



public class homeController extends SelectorComposer<Component> {
    
    private static final long serialVersionUID = -6992273830457634170L;
       
       
    @Wire
    Tabbox tabboxMainContent;

    
    @Override
    public void doAfterCompose( Component comp ) {
        
        try {
            
            super.doAfterCompose( comp );
            
            final String strRunningPath = Sessions.getCurrent().getWebApp().getRealPath( SystemConstants._Web_Inf_Dir ) + File.separator;
            
            initView();
            
        }
        catch ( Exception ex ) {

            
        }
        
    }
    
    
public void initView() {
        

  
        Component[] components = Executions.getCurrent().createComponents( "tabs/productos.zul", null );
       
        Tab tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
            
          
            
            
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
        
        components = Executions.getCurrent().createComponents( "tabs/presentacion.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
        
        components = Executions.getCurrent().createComponents( "tabs/proveedor.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
        components = Executions.getCurrent().createComponents( "tabs/cliente.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
     components = Executions.getCurrent().createComponents( "tabs/abonos.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
     components = Executions.getCurrent().createComponents( "tabs/facturacompra.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
     components = Executions.getCurrent().createComponents( "tabs/facturasventas.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
     components = Executions.getCurrent().createComponents( "tabs/principioactivo.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
     components = Executions.getCurrent().createComponents( "tabs/ajuste.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
        
     components = Executions.getCurrent().createComponents( "tabs/marca.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
     components = Executions.getCurrent().createComponents( "tabs/tipomedi.zul", null );
        
        tab = (Tab) ZKUtilities.getComponent( components, "Tab" );  
                     
        if ( tab != null ) {
            
           
            tabboxMainContent.getTabs().appendChild( tab );
            
            
            Tabpanel tabPanel = (Tabpanel) ZKUtilities.getComponent( components, "Tabpanel" );      
       
            if ( tabPanel != null )
            	
                tabboxMainContent.getTabpanels().appendChild( tabPanel );
        
        }
        
        
}
    

    
    
    @SuppressWarnings( { "unchecked", "rawtypes" } )
    @Listen( "onClick = #includeNorthContent #buttonLogout" )  
    public void onClickbuttonLogout( Event event ) {
       
        
        Messagebox.show( "You are sure do you want logout from system?", "Logout", Messagebox.OK | Messagebox.CANCEL, Messagebox.QUESTION, new org.zkoss.zk.ui.event.EventListener() {
            
         
        	
        	public void onEvent(Event evt) throws InterruptedException {
                
                if ( evt.getName().equals( "onOK" ) ) {
                    //mensaje 
                    Sessions.getCurrent().invalidate(); //limpiar la sessión 
                    
                    Executions.sendRedirect( "/index.zul"); //Enviamos al login
                    
                }
                else {
                    
                  //mensaje
                	
                }
                
            }
            
        });         
        
       }
    
    
      
      
    	
}
