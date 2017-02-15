package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLMarca implements Serializable{

    private static final long serialVersionUID = -1576213399906566437L;
    
    protected String strCodigo = null;
    
    protected String strNombre = null;
    
    protected String strPaisOrigen = null;

    
    
    
    public TBLMarca( String strCodigo, String strNombre, String strPaisOrigen ) {
        super();
        this.strCodigo = strCodigo;
        this.strNombre = strNombre;
        this.strPaisOrigen = strPaisOrigen;
    }

    public TBLMarca( ) {
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

    
    public String getPaisOrigen() {
        
        return strPaisOrigen;
    }

    
    public void setPaisOrigen( String strPaisOrigen ) {
        
        this.strPaisOrigen = strPaisOrigen;
    }
    
    
    
    
}
