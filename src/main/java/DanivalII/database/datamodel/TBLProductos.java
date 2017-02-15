package DanivalII.database.datamodel;

import java.io.Serializable;
import java.time.LocalDate;

public class TBLProductos implements Serializable{

    private static final long serialVersionUID = -5697829963572034652L;
    
    protected String strCodigo = null;
    
    protected  LocalDate fechaing = null;
    
    protected String strNombre = null;
    
    protected String strMEmpleo = null;
    
    protected String strPrincipioA = null;
    
    protected String strCodigoBarras = null;

    
    
    
    
    public TBLProductos ( String strCodigo, LocalDate fechaing, String strNombre, String strMEmpleo, String strPrincipioA, String strCodigoBarras ) {
        super();
        this.strCodigo = strCodigo;
        this.fechaing = fechaing;
        this.strNombre = strNombre;
        this.strMEmpleo = strMEmpleo;
        this.strPrincipioA = strPrincipioA;
        this.strCodigoBarras = strCodigoBarras;
        
    }
    
    public TBLProductos ( ) {
        super();

        
    }

    public String getCodigo() {
        
        return strCodigo;
    }

    
    public void setCodigo( String strCodigo ) {
        
        this.strCodigo = strCodigo;
    }

    
    public LocalDate getFechaing() {
        
        return fechaing;
    }

    
    public void setFechaing( LocalDate fechaing ) {
        
        this.fechaing = fechaing;
    }

    
    public String getNombre() {
        
        return strNombre;
    }

    
    public void setNombre( String strNombre ) {
        
        this.strNombre = strNombre;
    }

    
    public String getMEmpleo() {
        
        return strMEmpleo;
    }

    
    public void setMEmpleo( String strMEmpleo ) {
        
        this.strMEmpleo = strMEmpleo;
    }

    
    public String getPrincipioA() {
        
        return strPrincipioA;
    }

    
    public void setPrincipioA( String strPrincipioA ) {
        
        this.strPrincipioA = strPrincipioA;
    }

    
    public String getCodigoBarras() {
        
        return strCodigoBarras;
    }

    
    public void setCodigoBarras( String strCodigoBarras ) {
        
        this.strCodigoBarras = strCodigoBarras;
    }
    
}
