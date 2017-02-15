package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLProveedor implements Serializable {

    private static final long serialVersionUID = 8660810287357882899L;
    
    protected String strRif = null;
    
    protected String strNombre = null;
    
    protected String strtelefono = null;
    
    protected String strCorreo = null;
    
    protected String strUrl = null;

    
    public TBLProveedor( String strRif, String strNombre, String strtelefono, String strCorreo, String strUrl ) {
        super();
        this.strRif = strRif;
        this.strNombre = strNombre;
        this.strtelefono = strtelefono;
        this.strCorreo = strCorreo;
        this.strUrl = strUrl;
        
    }

    public TBLProveedor(  ) {
        super();
   
        
    }
    public String getRif() {
        
        return strRif;
    }

    
    public void setRif( String strRif ) {
        
        this.strRif = strRif;
    }

    
    public String getNombre() {
        
        return strNombre;
    }

    
    public void setNombre( String strNombre ) {
        
        this.strNombre = strNombre;
    }

    
    public String gettelefono() {
        
        return strtelefono;
    }

    
    public void settelefono( String strtelefono ) {
        
        this.strtelefono = strtelefono;
    }

    
    public String getCorreo() {
        
        return strCorreo;
    }

    
    public void setCorreo( String strCorreo ) {
        
        this.strCorreo = strCorreo;
    }

    
    public String getUrl() {
        
        return strUrl;
    }

    
    public void setUrl( String strUrl ) {
        
        this.strUrl = strUrl;
    }
    
    
    
    
}
