package DanivalII.database.dao;

import java.sql.Statement;
import DanivalII.database.CDatabaseConnection;
import DanivalII.database.datamodel.TBLFacturaVenta;
import DanivalII.database.datamodel.TBLGenera;
import DanivalII.database.datamodel.TBLPresentacion;
import DanivalII.database.datamodel.TBLProductos;
import DanivalII.database.datamodel.TBLProveedor;

public class DanivanIIinsert {
    
    public static boolean InsertPresentacion (final CDatabaseConnection dbConnection, TBLPresentacion tblPresentacion) {
        
        boolean result = false; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                statement.executeUpdate("Insert Into presentacion Values ('" + tblPresentacion.getNLote() + "', '" + tblPresentacion.getNombre() + "', " + tblPresentacion.getCantidadExistencia() + ", " + tblPresentacion.getCosto() + ", " + tblPresentacion.getPrecioVenta() + ", '" + tblPresentacion.getFechaVencimiento().toString() + "', '" + tblPresentacion.getMedida() + "', 0, '" + tblPresentacion.getCodProducto() + "')");
                
                dbConnection.getDatabaseConnection().commit();
                                
                statement.close();
                
                result = true;
            }
        }
        catch ( Exception ex ) {
            
            ex.getStackTrace();
            
        }
        
        
        return result; 
        
     }
    
    public static boolean InsertProducto (final CDatabaseConnection dbConnection, TBLProductos objinsert) {
        
        boolean result = false; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                statement.executeUpdate("Insert Into producto Values ('" + objinsert.getCodigo() + "', '" + objinsert.getCodigoBarras() + "', '" + objinsert.getNombre() + "', '" + objinsert.getFechaing().toString() + "', '" + objinsert.getMEmpleo() + "')");
                
                dbConnection.getDatabaseConnection().commit();
                                
                statement.close();
                
                result = true;
            }
        }
        catch ( Exception ex ) {
            
            ex.getStackTrace();
            
        }
        
        
        return result; 
        
     }
    
    public static boolean InsertProveedores (final CDatabaseConnection dbConnection, TBLProveedor objinsert) {
        
        boolean result = false; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                statement.executeUpdate("Insert Into proveedor Values ('" + objinsert.getRif() + "', '" + objinsert.getNombre() + "', '" + objinsert.gettelefono() + "', '" + objinsert.getCorreo() + "', '" + objinsert.getUrl() + "')");

                dbConnection.getDatabaseConnection().commit();
                                
                statement.close();
                
                result = true;
            }
        }
        catch ( Exception ex ) {
            
            ex.getStackTrace();
            
        }
        
        
        return result; 
        
     }
    
    public static boolean InsertFacturaVenta (final CDatabaseConnection dbConnection, TBLFacturaVenta objinsert) {
        
        boolean result = false; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                statement.executeUpdate("Insert Into proveedor Values ('" + objinsert.getNventa() + "', " + objinsert.getNcaja() + ", '" + objinsert.getFventa().toString() + "', '" + objinsert.getEstado() + "', " + objinsert.getDTotal() + ", '"+ objinsert.getDescription()+ "', '" + objinsert.getStrIdCliente() + "')");
                             
                dbConnection.getDatabaseConnection().commit();
                                
                statement.close();
                
                result = true;
            }
        }
        catch ( Exception ex ) {
            
            ex.getStackTrace();
            
        }
        
        
        return result; 
        
     }
    
    public static boolean InsertGenera (final CDatabaseConnection dbConnection, TBLGenera objinsert) {
        
        boolean result = false; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                statement.executeUpdate("Insert Into genera Values ('" + objinsert.getNLotePresentacion() + "', '" + objinsert.getCodProducto() + "', '" + objinsert.getNVentaFacturaV() + "', " + objinsert.getPrecioVentaV() + ", " + objinsert.getCantidad() + ", "+ objinsert.getCosto() + "')");
                  /*CREATE TABLE genera (n_lote varchar (10) REFERENCES presentacion (n_lote),codigo_producto codigo REFERENCES producto (codigo_producto) n_venta varchar (10) REFERENCES factura_venta (n_venta) pvp_variable decimal NOT NULL, cantidad numeric NOT NULL,costo numeric NOT NULL,PRIMARY KEY (n_lote, codigo_producto, n_venta));*/           
                dbConnection.getDatabaseConnection().commit();
                                
                statement.close();
                
                result = true;
            }
        }
        catch ( Exception ex ) {
            
            ex.getStackTrace();
            
        }
        
        
        return result; 
        
     }
    
}
