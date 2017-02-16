package DanivalII.database;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

public class CDatabaseConnection implements Serializable{

    private static final long serialVersionUID = -7409481035565831641L;
    
    protected Connection DatabaseConnection;
    
    protected CDatabaseConnectionConfig DatabaseConnectionConfig;
    
    public CDatabaseConnection() {
        
        DatabaseConnection = null;
        
        DatabaseConnectionConfig = null;
        
    }
    
    public Connection getDatabaseConnection() {
        
        return DatabaseConnection;
        
    }
    
    public CDatabaseConnectionConfig getDatabaseConnectionConfig() {
        
        return DatabaseConnectionConfig;
        
    }
    
    public void setDatabaseConnection( Connection DatabaseConnection) {
        
      
        this.DatabaseConnection = DatabaseConnection;
        
    }
    
    public void setDatabaseConnectionConfig( CDatabaseConnectionConfig DatabaseConnectionConfig ) {
               
        this.DatabaseConnectionConfig = DatabaseConnectionConfig;
        
    }
    

    public boolean makeConnectionToDatabase( CDatabaseConnectionConfig localDBConnectionConfig ) {
        
        boolean bResult = false;
        
        try {
            
            if ( this.DatabaseConnection == null ) {
                
                Class.forName( localDBConnectionConfig.Driver );
                                
                String strDatabaseURL = localDBConnectionConfig.Prefix + localDBConnectionConfig.Host + ":" + localDBConnectionConfig.Port + "/" + localDBConnectionConfig.Database;
                   
                String s="espia";
                
                s="espia";
                //error	
                Connection localDBConnection = DriverManager.getConnection( strDatabaseURL, localDBConnectionConfig.User, localDBConnectionConfig.Password );
                
                localDBConnection.setTransactionIsolation( Connection.TRANSACTION_READ_COMMITTED );
                            
                bResult = localDBConnection != null && localDBConnection.isValid( 5 );
                
                if ( bResult ) {
                    
                    localDBConnection.setAutoCommit( false );
                                        
                    this.DatabaseConnection = localDBConnection; //guarda la conecion de la database en la variable global de esta clase
                                        
                }
                else {
                    
                    localDBConnection.close();
                    
                    localDBConnection = null;
                    

                    
                }
                
            }
            else {
                
  
                
            }
            
        }
        catch ( Exception Ex ) {
            
            Ex.printStackTrace();
                
            
            
        }
        
        return bResult;
        
    }
    
    // cierra la coneccion con la base de datos
    
    public boolean closeConnectionToDB( ) {
        
        boolean bResult = false;
        
        try {
            
            
            if ( DatabaseConnection != null ) {
                
                DatabaseConnection.close();//cerramos
                
                
            }
 
            DatabaseConnection = null;
            
            bResult = true;
            
        }
        catch ( Exception Ex ) {
            
            Ex.printStackTrace();
            
        }
        
        return bResult;
        
    }
    
    public boolean isValid( ) {
        
        boolean bResult = false;
        
        try {
            
            bResult = DatabaseConnection.isValid( 5 );
            
        }
        catch ( Exception Ex ) {
            
           Ex.printStackTrace();
            
        }
        
        return bResult;
        
    }
    
    
}
