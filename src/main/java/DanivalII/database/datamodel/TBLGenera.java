package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLGenera implements Serializable{

    private static final long serialVersionUID = 8869751673218247930L;
    
    protected String NLotePresentacion = null;
    
    protected String CodProducto = null;
    
    protected String NVentaFacturaV = null;
    
    protected Double precioVentaV = null;
    
    protected int Cantidad = 0;
    
    protected String costo = null;

    public TBLGenera( String nLotePresentacion, String codProducto, String nVentaFacturaV, Double precioVentaV, int cantidad, String costo ) {
        super();
        this.NLotePresentacion = nLotePresentacion;
        this.CodProducto = codProducto;
        this.NVentaFacturaV = nVentaFacturaV;
        this.precioVentaV = precioVentaV;
        this.Cantidad = cantidad;
        this.costo = costo;
    }
    
    public TBLGenera( ) {
        super();

    }

    
    public String getNLotePresentacion() {
        
        return NLotePresentacion;
    }

    
    public void setNLotePresentacion( String nLotePresentacion ) {
        
        this.NLotePresentacion = nLotePresentacion;
    }

    
    public String getCodProducto() {
        
        return CodProducto;
    }

    
    public void setCodProducto( String codProducto ) {
        
        this.CodProducto = codProducto;
    }

    
    public String getNVentaFacturaV() {
        
        return NVentaFacturaV;
    }

    
    public void setNVentaFacturaV( String nVentaFacturaV ) {
        
        this.NVentaFacturaV = nVentaFacturaV;
    }

    
    public Double getPrecioVentaV() {
        
        return precioVentaV;
    }

    
    public void setPrecioVentaV( Double precioVentaV ) {
        
        this.precioVentaV = precioVentaV;
    }

    
    public int getCantidad() {
        
        return Cantidad;
    }

    
    public void setCantidad( int cantidad ) {
        
        this.Cantidad = cantidad;
    }

    
    public String getCosto() {
        
        return costo;
    }

    
    public void setCosto( String costo ) {
        
        this.costo = costo;
    }
    
    



    
}
