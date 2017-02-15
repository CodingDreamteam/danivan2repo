package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLCliente implements Serializable{

    private static final long serialVersionUID = 1897883889893664061L;
    
    protected String strCI = null;
    
    protected String strNombre = null;
    
    protected String strTelefono = null;
    
    public TBLCliente( String strCI, String strNombre, String strTelefono ) {
        super();
        this.strCI = strCI;
        this.strNombre = strNombre;
        this.strTelefono = strTelefono;
    }

    public TBLCliente( ) {
        super();

    }

    public String getCI() {
        
        return strCI;
    }

    
    public void setCI( String strCI ) {
        
        this.strCI = strCI;
    }

    
    public String getNombre() {
        
        return strNombre;
    }

    
    public void setNombre( String strNombre ) {
        
        this.strNombre = strNombre;
    }

    
    public String getTelefono() {
        
        return strTelefono;
    }

    
    public void setTelefono( String strTelefono ) {
        
        this.strTelefono = strTelefono;
    }
    
    
    
    
}
