package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLPrincipioActivo implements Serializable{

    private static final long serialVersionUID = -4061979273655788200L;
    
    protected String strCodigo = null;
    
    protected String strNombre = null;

        
    
    public TBLPrincipioActivo( String strCodigo, String strNombre ) {
        super();
        this.strCodigo = strCodigo;
        this.strNombre = strNombre;
    }

    public TBLPrincipioActivo ( )  {
        super();

    }

    public String getCodigo() {
        
        return strCodigo;
    }

    
    public void setCodigo( String strCodigo ) {
        
        this.strCodigo = strCodigo;
    }

    
    public String getNombre() {
        
        return strNombre;
    }

    
    public void setNombre( String strNombre ) {
        
        this.strNombre = strNombre;
    }
    
    
    
}
