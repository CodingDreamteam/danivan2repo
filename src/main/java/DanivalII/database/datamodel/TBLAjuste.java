package DanivalII.database.datamodel;

import java.io.Serializable;
import java.time.LocalDate;

public class TBLAjuste implements Serializable{

    private static final long serialVersionUID = -3367929725101385461L;
    
    protected int strNumero = 0;
    
    protected LocalDate Fecha = null;
    
    protected String strObservacion = null;
    
    protected String strTipo = null;
    
    protected int Cantidad = 0;
    
    protected String strCodproducto = null;

    protected String strNlotePresentacion = null;
    
   
    public TBLAjuste( int strNumero, LocalDate fecha, String strObservacion, String strTipo, int cantidad, String strCodproducto, String strNlotePresentacion ) {
        super();
        this.strNumero = strNumero;
        this.Fecha = fecha;
        this.strObservacion = strObservacion;
        this.strTipo = strTipo;
        this.Cantidad = cantidad;
        this.strCodproducto = strCodproducto;
        this.strNlotePresentacion = strNlotePresentacion;
    }
    
    public TBLAjuste( ) {
        super();

    }

    
    public int getNumero() {
        
        return strNumero;
    }

    
    public void setNumero( int strNumero ) {
        
        this.strNumero = strNumero;
    }

    
    public LocalDate getFecha() {
        
        return Fecha;
    }

    
    public void setFecha( LocalDate fecha ) {
        
        Fecha = fecha;
    }

    
    public String getObservacion() {
        
        return strObservacion;
    }

    
    public void setObservacion( String strObservacion ) {
        
        this.strObservacion = strObservacion;
    }

    
    public String getTipo() {
        
        return strTipo;
    }

    
    public void setTipo( String strTipo ) {
        
        this.strTipo = strTipo;
    }

    
    public int getCantidad() {
        
        return Cantidad;
    }

    
    public void setCantidad( int cantidad ) {
        
        this.Cantidad = cantidad;
    }

    
    public String getCodproducto() {
        
        return strCodproducto;
    }

    
    public void setCodproducto( String strCodproducto ) {
        
        this.strCodproducto = strCodproducto;
    }

    
    public String getNlotePresentacion() {
        
        return strNlotePresentacion;
    }

    
    public void setNlotePresentacion( String strNlotePresentacion ) {
        
        this.strNlotePresentacion = strNlotePresentacion;
    }
    
    
}
