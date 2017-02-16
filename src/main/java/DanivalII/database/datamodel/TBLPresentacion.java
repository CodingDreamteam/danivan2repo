package DanivalII.database.datamodel;

import java.io.Serializable;
import java.time.LocalDate;

public class TBLPresentacion implements Serializable{

    private static final long serialVersionUID = -2559183084918536381L;
    
    protected String strNLote = null;
    
    protected String strNombre = null; 
    
    protected int intCantidadExistencia;
    
    protected Double dCosto;
    
    protected Double PrecioVenta;
    
    protected LocalDate FechaVencimiento = null;
    
    protected String strMedida = null;
    
    protected boolean bprescripcion = false;
    
    protected String strCodProducto = null;

    public TBLPresentacion( String strNLote, String strNombre, int intCantidadExistencia, Double dCosto, Double precioVenta, LocalDate fechaVencimiento, String strMedida, boolean prescripcion, String strCodProducto ) {
        super();
        this.strNLote = strNLote;
        this.strNombre = strNombre;
        this.intCantidadExistencia = intCantidadExistencia;
        this.dCosto = dCosto;
        this.PrecioVenta = precioVenta;
        this.FechaVencimiento = fechaVencimiento;
        this.strMedida = strMedida;
        this.bprescripcion = prescripcion;
        this.strCodProducto = strCodProducto;
    }
    
    public TBLPresentacion( ) {
        super();

    }

    public String getCodProducto() {
        
        return strCodProducto;
    }

    
    public void setCodProducto( String strCodProducto ) {
        
        this.strCodProducto = strCodProducto;
    }
    
    public String getNLote() {
        
        return strNLote;
    }

    
    public void setNLote( String strNLote ) {
        
        this.strNLote = strNLote;
    }

    
    public String getNombre() {
        
        return strNombre;
    }

    
    public void setNombre( String strNombre ) {
        
        this.strNombre = strNombre;
    }

    
    public int getCantidadExistencia() {
        
        return intCantidadExistencia;
    }

    
    public void setCantidadExistencia( int intCantidadExistencia ) {
        
        this.intCantidadExistencia = intCantidadExistencia;
    }

   
    public Double getCosto() {
        
        return dCosto;
    }

    
    public void setCosto( Double dCosto ) {
        
        this.dCosto = dCosto;
    }

    
    public Double getPrecioVenta() {
        
        return PrecioVenta;
    }

    
    public void setPrecioVenta( Double precioVenta ) {
        
        this.PrecioVenta = precioVenta;
    }

    
    public LocalDate getFechaVencimiento() {
        
        return FechaVencimiento;
    }

    
    public void setFechaVencimiento( LocalDate fechaVencimiento ) {
        
        this.FechaVencimiento = fechaVencimiento;
    }

    
    public String getMedida() {
        
        return strMedida;
    }

    
    public void setMedida( String strMedida ) {
        
        this.strMedida = strMedida;
    }

    
    public boolean isPrescripcion() {
        
        return bprescripcion;
    }

    
    public void setPrescripcion( boolean prescripcion ) {
        
        this.bprescripcion = prescripcion;
    }
    
    
    
    
    
}
