package DanivalII.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Properties;

public class CDatabaseConnectionConfig implements Serializable {
    
    private static final long serialVersionUID = -4161226623772764056L;
    
    protected String Driver = null;
    
    protected String Prefix = null;
    
    protected String Host = null;
    
    protected String Port = null;
    
    protected String Database = null;
    
    protected String User = null;
    
    protected String Password = null;
    
    public CDatabaseConnectionConfig() {
        
    }
    
    public CDatabaseConnectionConfig( String lDriver, String lPrefix, String lHost, String lPort, String lDatabase, String lUser, String lPassword ) {
        this.Driver = lDriver;
        this.Prefix = lPrefix;
        this.Host = lHost;
        this.Port = lPort;
        this.Database = lDatabase;
        this.User = lUser;
        this.Password = lPassword;
        
    }
    
    public boolean LoadConfig( String ConfigPath ) {
        
        boolean bResult = false;
        
        try {
            
            File configFilePath = new File( ConfigPath );
            
            if ( configFilePath.exists() ) {
                
                Properties configData = new Properties();
                
                FileInputStream inputStream = new FileInputStream( configFilePath );
                configData.loadFromXML( inputStream );
                this.Driver = ( String ) configData.get( "driver" );
                this.Prefix = ( String ) configData.get( "prefix" );
                this.Host = ( String ) configData.get( "host" );
                this.Port = ( String ) configData.get( "port" );
                this.Database = ( String ) configData.get( "database" );
                this.User = ( String ) configData.get( "user" );
                this.Password = ( String ) configData.get( "password" );
                
                inputStream.close();
                
                bResult = true;
                
            }

            
        }
        catch ( Exception ex ) {
            
            ex.printStackTrace();
        }
        
        return bResult;
    }
    
    public String getDriver() {
        
        return Driver;
        
    }
    
    public void setDriver( String driver ) {
        
        this.Driver = driver;
        
    }
    
    public String getPrefix() {
        
        return Prefix;
        
    }
    
    public void setPrefix( String prefix ) {
        
        this.Prefix = prefix;
        
    }
    
    public String getHost() {
        
        return Host;
        
    }
    
    public void setHost( String host ) {
        
        this.Host = host;
        
    }
    
    public String getPort() {
        
        return Port;
        
    }
    
    public void setPort( String port ) {
        
        this.Port = port;
        
    }
    
    public String getDatabase() {
        
        return Database;
        
    }
    
    public void setDatabase( String database ) {
        
        this.Database = database;
        
    }
    
    public String getUser() {
        
        return User;
        
    }
    
    public void setUser( String user ) {
        
        this.User = user;
        
    }
    
    public String getPassword() {
        
        return Password;
        
    }
    
    public void setPassword( String password ) {
        
        this.Password = password;
        
    }
    
}
