package DanivalII.database.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DanivalII.database.CDatabaseConnection;
import DanivalII.database.datamodel.TBLAbono;
import DanivalII.database.datamodel.TBLAjuste;
import DanivalII.database.datamodel.TBLCliente;
import DanivalII.database.datamodel.TBLEstablece;
import DanivalII.database.datamodel.TBLFacturaCompra;
import DanivalII.database.datamodel.TBLFacturaVenta;
import DanivalII.database.datamodel.TBLGenera;
import DanivalII.database.datamodel.TBLMarca;
import DanivalII.database.datamodel.TBLPresentacion;
import DanivalII.database.datamodel.TBLPrincipioActivo;
import DanivalII.database.datamodel.TBLProductos;
import DanivalII.database.datamodel.TBLProveedor;
import DanivalII.database.datamodel.TBLTipoMedicina;
import DanivalII.database.datamodel.TBLUser;


public class DanivanIIDAO {

    public static TBLPresentacion GetPresentacion (final CDatabaseConnection dbConnection, String strNlote, String strCodProducto) {
        
       TBLPresentacion result = null; 
       
       try {
           if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
               
               Statement statement = dbConnection.getDatabaseConnection().createStatement();
               
               ResultSet resultSet = statement.executeQuery( "SELECT * FROM presentacion WHERE N_Lote = '" + strNlote + "' AND codigo_producto = '" + strCodProducto + "'" );
               
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
                   result.setCodProducto( resultSet.getString( "codigo_producto" ) );
                   
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
    
    public static List<TBLPresentacion> GetPresentaciones (final CDatabaseConnection dbConnection) {
        
        List<TBLPresentacion> result = new ArrayList<TBLPresentacion>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM presentacion" );
                
                while ( resultSet.next() ) {
                    
                    TBLPresentacion tblPresentacion = new TBLPresentacion(); 
                    
                    tblPresentacion.setNLote( resultSet.getString( "N_Lote" ) );
                    tblPresentacion.setCantidadExistencia( resultSet.getInt( "cant_existencia" ) );
                    tblPresentacion.setCosto( resultSet.getDouble( "costo" ) );
                    tblPresentacion.setFechaVencimiento( resultSet.getDate( "vencimiento" ).toLocalDate() );
                    tblPresentacion.setMedida( resultSet.getString( "medida" ) );
                    tblPresentacion.setNombre( resultSet.getString( "nombre_presentacion" ) );
                    tblPresentacion.setPrecioVenta( resultSet.getDouble( "pvp" ) );
                    tblPresentacion.setPrescripcion( resultSet.getBoolean( "prescripcion" ) );
                    tblPresentacion.setCodProducto( resultSet.getString( "codigo_producto" ) );
                    
                    result.add( tblPresentacion );
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
    
    public static TBLPrincipioActivo GetPrincipioActivo (final CDatabaseConnection dbConnection, String strCodPrincipio) {
        
        TBLPrincipioActivo result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM principio_activo WHERE codigo_principio = '" + strCodPrincipio + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLPrincipioActivo(); 
                    
                    result.setCodigo( resultSet.getString( "codigo_principio" ) );
                    result.setNombre( resultSet.getString( "nombre_principio" ) );
                    result.setDescripcion( resultSet.getString( "descripcion" ) );
                    
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
    
    public static List<TBLPrincipioActivo> GetPrincipioActivos (final CDatabaseConnection dbConnection) {
        
        List<TBLPrincipioActivo> result = new ArrayList<TBLPrincipioActivo>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM principio_activo");
                
                while ( resultSet.next() ) {
                    
                    TBLPrincipioActivo tblPrincipioActivo = new TBLPrincipioActivo(); 
                    
                    tblPrincipioActivo.setCodigo( resultSet.getString( "codigo_principio" ) );
                    tblPrincipioActivo.setNombre( resultSet.getString( "nombre_principio" ) );
                    tblPrincipioActivo.setDescripcion( resultSet.getString( "descripcion" ) );
                    
                    result.add( tblPrincipioActivo );
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
    
    public static TBLEstablece GetEstablece (final CDatabaseConnection dbConnection, String strNLote, String strCodProducto, String strRif) {
        
        TBLEstablece result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM establece WHERE n_lote = '" + strNLote + "' And codigo_producto = '" + strCodProducto + "' AND rif = '" + strRif + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLEstablece(); 
                    
                    result.setNLotePresentacion( resultSet.getString( "n_lote" ) );
                    result.setCodproducto( resultSet.getString( "codigo_producto" ) );
                    result.setNcompraFacturaC( resultSet.getString( "n_compra" ) );
                    result.setRifProveedor( resultSet.getString( "rif" ) );
                    result.setCantpedida( resultSet.getString( "cantidad_pedida" ) );
                    result.setCostoCompra( resultSet.getDouble( "costo_compra" ) );
                    
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
    
    public static List<TBLEstablece> GetEstableces (final CDatabaseConnection dbConnection) {
        
        List<TBLEstablece> result = new ArrayList<TBLEstablece>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM establece");
                
                while ( resultSet.next() ) {
                    
                    TBLEstablece tblEstablece = new TBLEstablece(); 
                    
                    tblEstablece.setNLotePresentacion( resultSet.getString( "n_lote" ) );
                    tblEstablece.setCodproducto( resultSet.getString( "codigo_producto" ) );
                    tblEstablece.setNcompraFacturaC( resultSet.getString( "n_compra" ) );
                    tblEstablece.setRifProveedor( resultSet.getString( "rif" ) );
                    tblEstablece.setCantpedida( resultSet.getString( "cantidad_pedida" ) );
                    tblEstablece.setCostoCompra( resultSet.getDouble( "costo_compra" ) );
                    
                    result.add( tblEstablece );
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
    
    public static TBLGenera GetGenera (final CDatabaseConnection dbConnection, String strNLote, String strCodProducto, String strNventa) {
        
        TBLGenera result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM genera WHERE n_lote = '" + strNLote + "' And codigo_producto = '" + strCodProducto + "' AND n_venta = '" + strNventa + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLGenera(); 
                    
                    result.setNLotePresentacion( resultSet.getString( "n_lote" ) );
                    result.setCodProducto( resultSet.getString( "codigo_producto" ) );
                    result.setNVentaFacturaV( resultSet.getString( "n_venta" ) );
                    result.setPrecioVentaV(  resultSet.getDouble( "pvp_variable" ) );
                    result.setCantidad( resultSet.getInt( "cantidad" ) );
                    result.setCosto( resultSet.getString( "costo" ) );

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
    
    public static List<TBLGenera> GetGeneras (final CDatabaseConnection dbConnection) {
        
        List<TBLGenera> result = new ArrayList<TBLGenera>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM genera");
                
                while ( resultSet.next() ) {
                    
                    TBLGenera tblGenera = new TBLGenera(); 
                    
                    tblGenera.setNLotePresentacion( resultSet.getString( "n_lote" ) );
                    tblGenera.setCodProducto( resultSet.getString( "codigo_producto" ) );
                    tblGenera.setNVentaFacturaV( resultSet.getString( "n_venta" ) );
                    tblGenera.setPrecioVentaV(  resultSet.getDouble( "pvp_variable" ) );
                    tblGenera.setCantidad( resultSet.getInt( "cantidad" ) );
                    tblGenera.setCosto( resultSet.getString( "costo" ) );

                    result.add( tblGenera );
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
    
    public static TBLAbono GetAbono (final CDatabaseConnection dbConnection, String strNabono, String strId, String strNventa) {
        
        TBLAbono result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM abono WHERE n_abono = '" + strNabono + "' And id = '" + strId + "' AND n_venta = '" + strNventa + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLAbono(); 
                    
                    result.setNumero( resultSet.getString( "n_abono" ) );
                    result.setNVentasFacturaV( resultSet.getString( "n_venta" ) );
                    result.setIdCliente( resultSet.getString( "id" ) );
                    result.setCantidad( resultSet.getDouble( "cantidad" ) );

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
    
    public static List<TBLAbono> GetAbonos (final CDatabaseConnection dbConnection, String strNabono, String strId, String strNventa) {
        
        List<TBLAbono> result = new ArrayList<TBLAbono>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM abono");
                
                while ( resultSet.next() ) {
                    
                    TBLAbono tblAbono = new TBLAbono(); 
                    
                    tblAbono.setNumero( resultSet.getString( "n_abono" ) );
                    tblAbono.setNVentasFacturaV( resultSet.getString( "n_venta" ) );
                    tblAbono.setIdCliente( resultSet.getString( "id" ) );
                    tblAbono.setCantidad( resultSet.getDouble( "cantidad" ) );

                    result.add( tblAbono );
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
    
    public static TBLAjuste GetAjuste (final CDatabaseConnection dbConnection, String strCodProducto, int Najuste, String Nlote ) {
        
        TBLAjuste result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM ajuste  WHERE codigo_producto = '" + strCodProducto + "' AND n_ajuste = " + Najuste + " AND n_lote = '" + Nlote + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLAjuste(); 
                    
                    result.setNumero( resultSet.getInt( "codigo_principio" ) );
                    result.setFecha( resultSet.getDate( "fecha_ajuste" ).toLocalDate() );
                    result.setObservacion( resultSet.getString( "observacion_ajuste" ) );
                    result.setTipo( resultSet.getString( "tipo_ajuste" ) );
                    result.setCantidad( resultSet.getInt( "cant_ajuste" ) );
                    result.setNlotePresentacion( resultSet.getString( "n_lote" ) );
                    result.setCodproducto( resultSet.getString( "codigo_producto" ) );

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
    
    public static List<TBLAjuste> GetAjustes (final CDatabaseConnection dbConnection) {
        
        List<TBLAjuste> result = new ArrayList<TBLAjuste>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM ajuste");
                
                while ( resultSet.next() ) {
                    
                    TBLAjuste tblAjuste = new TBLAjuste(); 
                    
                    tblAjuste.setNumero( resultSet.getInt( "codigo_principio" ) );
                    tblAjuste.setFecha( resultSet.getDate( "fecha_ajuste" ).toLocalDate() );
                    tblAjuste.setObservacion( resultSet.getString( "observacion_ajuste" ) );
                    tblAjuste.setTipo( resultSet.getString( "tipo_ajuste" ) );
                    tblAjuste.setCantidad( resultSet.getInt( "cant_ajuste" ) );
                    tblAjuste.setNlotePresentacion( resultSet.getString( "n_lote" ) );
                    tblAjuste.setCodproducto( resultSet.getString( "codigo_producto" ) );

                    result.add( tblAjuste );
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
    
    public static TBLFacturaVenta GetFacturaVenta (final CDatabaseConnection dbConnection, String strNventa, String strId) {
        
        TBLFacturaVenta result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM factura_venta WHERE id = '" + strId + "' AND n_venta ='" + strNventa + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLFacturaVenta(); 
                    
                    result.setNventa( resultSet.getString( "n_venta" ) );
                    result.setStrIdCliente( resultSet.getString( "id" ) );
                    result.setDescription( resultSet.getString( "descripcion" ) );
                    result.setEstado( resultSet.getString( "estado" ) );
                    result.setFventa( resultSet.getDate( "fecha_venta" ).toLocalDate() );
                    result.setDTotal( resultSet.getDouble( "total" ) );
                    result.setNcaja( resultSet.getInt( "n_caja" ) );
 
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
    
    public static List<TBLFacturaVenta> GetFacturaVentas (final CDatabaseConnection dbConnection) {
        
        List<TBLFacturaVenta> result = new ArrayList<TBLFacturaVenta>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM factura_venta");
                
                while ( resultSet.next() ) {
                    
                    TBLFacturaVenta tblFacturaVenta = new TBLFacturaVenta(); 
                    
                    tblFacturaVenta.setNventa( resultSet.getString( "n_venta" ) );
                    tblFacturaVenta.setStrIdCliente( resultSet.getString( "id" ) );
                    tblFacturaVenta.setDescription( resultSet.getString( "descripcion" ) );
                    tblFacturaVenta.setEstado( resultSet.getString( "estado" ) );
                    tblFacturaVenta.setFventa( resultSet.getDate( "fecha_venta" ).toLocalDate() );
                    tblFacturaVenta.setDTotal( resultSet.getDouble( "total" ) );
                    tblFacturaVenta.setNcaja( resultSet.getInt( "n_caja" ) );
 
                    result.add( tblFacturaVenta );
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

    public static TBLFacturaCompra GetFacturaCompra (final CDatabaseConnection dbConnection, String strNcompra, String strRif) {
        
        TBLFacturaCompra result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM factura_compra WHERE n_compra = '" + strNcompra + "' AND rif ='" + strRif + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLFacturaCompra(); 
                    
                    result.setNFacutra( resultSet.getString( "n_compra" ) );
                    result.setFechaRecepcion( resultSet.getDate( "fecha_recepcion" ).toLocalDate() );
                    result.setEstado( resultSet.getString( "estado" ) );
                    result.setTotal( resultSet.getDouble( "total" ) );

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
    
    public static List<TBLFacturaCompra> GetFacturaCompras (final CDatabaseConnection dbConnection) {
        
        List<TBLFacturaCompra> result = new ArrayList<TBLFacturaCompra>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM factura_compra");
                
                while ( resultSet.next() ) {
                    
                    TBLFacturaCompra tblFacturaCompra = new TBLFacturaCompra(); 
                    
                    tblFacturaCompra.setNFacutra( resultSet.getString( "n_compra" ) );
                    tblFacturaCompra.setFechaRecepcion( resultSet.getDate( "fecha_recepcion" ).toLocalDate() );
                    tblFacturaCompra.setEstado( resultSet.getString( "estado" ) );
                    tblFacturaCompra.setTotal( resultSet.getDouble( "total" ) );

                    result.add( tblFacturaCompra );
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
    
    public static TBLCliente GetCliente (final CDatabaseConnection dbConnection, String strId) {
        
        TBLCliente result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM cliente WHERE id = '" + strId + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLCliente(); 
                    
                    result.setCI( resultSet.getString( "id" ) );
                    result.setNombre( resultSet.getString( "nombre" ) );
                    result.setTelefono( resultSet.getString( "telefono" ) );
                                       
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

    public static List<TBLCliente> GetClientes (final CDatabaseConnection dbConnection, String strId) {
        
        List<TBLCliente> result = new ArrayList<TBLCliente>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM cliente");
                
                while ( resultSet.next() ) {
                    
                    TBLCliente tblCliente = new TBLCliente(); 
                    
                    tblCliente.setCI( resultSet.getString( "id" ) );
                    tblCliente.setNombre( resultSet.getString( "nombre" ) );
                    tblCliente.setTelefono( resultSet.getString( "telefono" ) );
                         
                    result.add( tblCliente );
                    
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
    
    public static TBLProductos GetProducto (final CDatabaseConnection dbConnection, String strCodProducto) {
        
        TBLProductos result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM producto WHERE codigo_producto = '" + strCodProducto + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLProductos(); 
                    
                    result.setCodigo( resultSet.getString( "codigo_producto" ) );
                    result.setCodigoBarras( resultSet.getString( "codigo_alt" ) );
                    result.setNombre( resultSet.getString( "nombre" ) );
                    result.setFechaing( resultSet.getDate( "fecha_creado" ).toLocalDate() );
                    result.setMEmpleo( resultSet.getString( "modo_empleo" ) );
                                       
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
    
    public static List<TBLProductos> GetProductos (final CDatabaseConnection dbConnection) {
        
        List<TBLProductos> result = new ArrayList<TBLProductos>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM producto");
                
                while ( resultSet.next() ) {
                    
                    TBLProductos tblProductos = new TBLProductos(); 
                    
                    tblProductos.setCodigo( resultSet.getString( "codigo_producto" ) );
                    tblProductos.setCodigoBarras( resultSet.getString( "codigo_alt" ) );
                    tblProductos.setNombre( resultSet.getString( "nombre" ) );
                    tblProductos.setFechaing( resultSet.getDate( "fecha_creado" ).toLocalDate() );
                    tblProductos.setMEmpleo( resultSet.getString( "modo_empleo" ) );
                                       
                    result.add( tblProductos );
                    
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
    
    public static TBLMarca GetMarca (final CDatabaseConnection dbConnection, String strCodMarca) {
        
        TBLMarca result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM marca WHERE codigo_marca = '" + strCodMarca + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLMarca(); 
                    
                    result.setCodigo( resultSet.getString( "codigo_marca" ) );
                    result.setNombre( resultSet.getString( "nombre_marca" ) );
                    result.setPaisOrigen( resultSet.getString( "origen" ) );
            
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
    
    public static List<TBLMarca> GetMarcas (final CDatabaseConnection dbConnection) {
        
        List<TBLMarca> result = new ArrayList<TBLMarca>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM marca");
                
                while ( resultSet.next() ) {
                    
                    TBLMarca tblMarca = new TBLMarca(); 
                    
                    tblMarca.setCodigo( resultSet.getString( "codigo_marca" ) );
                    tblMarca.setNombre( resultSet.getString( "nombre_marca" ) );
                    tblMarca.setPaisOrigen( resultSet.getString( "origen" ) );
                    
                    result.add( tblMarca );
            
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
    
    public static TBLTipoMedicina GetTipoMedicina (final CDatabaseConnection dbConnection, String strCodigo) {
        
        TBLTipoMedicina result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM tipo_medicina WHERE codigo_tipo = '" + strCodigo + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLTipoMedicina(); 
                    
                    result.setCodigo( resultSet.getString( "codigo_tipo" ) );
                    result.setNombre( resultSet.getString( "nombre" ) );
                    result.setDescripcion(  resultSet.getString( "descripcion" ) );

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
    
    public static List<TBLTipoMedicina> GetTipoMedicinas (final CDatabaseConnection dbConnection) {
        
        List<TBLTipoMedicina>  result = new ArrayList<TBLTipoMedicina>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM tipo_medicina");
                
                while ( resultSet.next() ) {
                    
                    TBLTipoMedicina tblTipoMedicina = new TBLTipoMedicina(); 
                    
                    tblTipoMedicina.setCodigo( resultSet.getString( "codigo_tipo" ) );
                    tblTipoMedicina.setNombre( resultSet.getString( "nombre" ) );
                    tblTipoMedicina.setDescripcion(  resultSet.getString( "descripcion" ) );
                    
                    result.add( tblTipoMedicina );

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
    
    public static List<TBLProveedor> GetProveedores (final CDatabaseConnection dbConnection, String strRif) {
        
        List<TBLProveedor> result = new ArrayList<TBLProveedor>(); 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM proveedor");
                
                while ( resultSet.next() ) {
                    
                    TBLProveedor tblProveedor = new TBLProveedor(); 
                    
                    tblProveedor.setRif( resultSet.getString( "rif" ) );
                    tblProveedor.setNombre( resultSet.getString( "nombre_proveedor" ) );
                    tblProveedor.settelefono( resultSet.getString( "telefono_proveedor" ) );
                    tblProveedor.setCorreo( resultSet.getString( "correo_proveedor" ) );
                    tblProveedor.setUrl( resultSet.getString( "url" ) );
                    
                    result.add( tblProveedor );
                    
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
    
    public static TBLProveedor GetProveedor (final CDatabaseConnection dbConnection, String strRif) {
        
        TBLProveedor result = null; 
        
        try {
            if ( dbConnection != null && dbConnection.getDatabaseConnection()!=null ) {
                
                Statement statement = dbConnection.getDatabaseConnection().createStatement();
                
                ResultSet resultSet = statement.executeQuery( "SELECT * FROM proveedor WHERE rif = '" + strRif + "'");
                
                if ( resultSet.next() ) {
                    
                    result = new TBLProveedor(); 
                    
                    result.setRif( resultSet.getString( "rif" ) );
                    result.setNombre( resultSet.getString( "nombre_proveedor" ) );
                    result.settelefono( resultSet.getString( "telefono_proveedor" ) );
                    result.setCorreo( resultSet.getString( "correo_proveedor" ) );
                    result.setUrl( resultSet.getString( "url" ) );
                    
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
                    result.setUserName( resultSet.getString( "userName" ) );
                    result.setPassword( resultSet.getString( "Password" ) );
                 
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

    

    
    

    
    
}
