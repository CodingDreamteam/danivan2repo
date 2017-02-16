package DanivalII.database.dao;

import java.sql.ResultSet;
import java.sql.Statement;



import DanivalII.database.CDatabaseConnection;
import DanivalII.database.datamodel.TBLPresentacion;
import DanivalII.database.datamodel.TBLProductos;
import DanivalII.database.datamodel.TBLUser;


public class DanivanIIDAO {

    public static TBLPresentacion GetPresentacion (final CDatabaseConnection dbConnection, String strId, String strCodProducto) {
        
       TBLPresentacion result = null; 
       
       try {
           if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
               
               Statement statement = dbConnection.getDatabaseConnection().createStatement();
               
               ResultSet resultSet = statement.executeQuery( "SELECT * FROM presentacion WHERE N_Lote = '" + strId + "' AND codigo_producto = '" + strCodProducto + "'" );
               
               if ( resultSet.next() ) {
                   
                   result = new TBLPresentacion(); 
                   
                   result.setNLote( resultSet.getString( "N_Lote" ) );
                   result.setCantidadExistencia( resultSet.getInt( "cant_existencia" ) );
                   result.setCosto( resultSet.getDouble( "costo" ) );
                   result.setFechaVencimiento( resultSet.getDate( "vencimiento" ).toLocalDate() );
                   result.setMedida( resultSet.getString( "medida" ) );
                   result.setNombre( resultSet.getString( "nombre_presentacion" ) );
                   result.setPrecioVenta( resultSet.getDouble( "pvp" ) );
                   result.setPrescripcion( resultSet.getBoolean( "prescripcion" ) );
                   
                   
               }
               
               resultSet.close();
               
               statement.close();
           }
       }
       catch ( Exception ex ) {
           
           ex.getStackTrace();
           
       }
       
       
       return result; 
       
    }
    
    
    public static TBLUser checkData( final CDatabaseConnection dbConnection, final String strUser, final String strPassword ) {
        
        TBLUser result = null;
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM tblUser WHERE userName = '" + strUser + "' AND Password = '" + strPassword + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLUser();
                    
                    result.setId( resultSet.getString( "ID" ) );
                    result.setUserName( resultSet.getString( "Name" ) );
                    result.setPassword( resultSet.getString( "Password" ) );
                 
                }
                
                resultSet.close();
                
                statement.close();
            }
        }
        catch ( Exception ex ) {
            

            
        }
        
        return result;
    }



    
    
  /*  public static TBLProductos GetProducto (final CDatabaseConnection dbConnection, String strCodProducto) {
        
        TBLProductos result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM producto WHERE codigo_producto = '" + strId + "' AND cod_producto = '" + strCodProducto + "'" );
                
                if ( resultSet.next() ) {
                    
                    result = new TBLProductos(); 
                    
                    result.setCodigoProducto( resultSet.getString( "codigo_producto" ) );
                    result.setCodigoAlt( resultSet.getString( "codigo_alt" ) );
                    result.setFechaCreado( resultSet.getDate( "fecha_creado" ).toLocalDate() );
                    result.setPrincipioActivo( resultSet.getString( "principio_activo" ) );
                    result.setNombre( resultSet.getString( "nombre" ) );
                    result.setModoEmpleo( resultSet.getString( "modo_empleo" ) );
                    
                    
                }
                
                resultSet.close();
                
                statement.close();
            }
        }
        catch ( Exception ex ) {
            
            ex.getStackTrace();
            
        }
        
        
        return result; 
        
     }
    */
    
}
