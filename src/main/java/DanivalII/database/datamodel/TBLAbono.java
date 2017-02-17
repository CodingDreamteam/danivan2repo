package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLAbono implements Serializable{
   
    private static final long serialVersionUID = -1344700220060514048L;

    protected String strNumero = null;
    
    protected Double intCantidad = null;
    
    protected String NVentasFacturaV = null;
    
    protected String strIdCliente = null;


    
    public TBLAbono( ) {
        super();

    }

    
    public TBLAbono( String strNumero, Double intCantidad, String nVentasFacturaV, String strIdCliente ) {
        super();
        this.strNumero = strNumero;
        this.intCantidad = intCantidad;
        this.NVentasFacturaV = nVentasFacturaV;
        this.strIdCliente = strIdCliente;
    }

    
    
    
    public String getNVentasFacturaV() {
        
        return NVentasFacturaV;
    }


    
    public void setNVentasFacturaV( String nVentasFacturaV ) {
        
        this.NVentasFacturaV = nVentasFacturaV;
    }


    
    public String getIdCliente() {
        
        return strIdCliente;
    }


    
    public void setIdCliente( String strIdCliente ) {
        
        this.strIdCliente = strIdCliente;
    }


    public String getNumero() {
        
        return strNumero;
    }

    
    public void setNumero( String strNumero ) {
        
        this.strNumero = strNumero;
    }

    
    public Double getCantidad() {
        
        return intCantidad;
    }

    
    public void setCantidad( Double intCantidad ) {
        
        this.intCantidad = intCantidad;
    }
    
    
}
