package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLTipoMedicina implements Serializable{

    private static final long serialVersionUID = -1271953716664997545L;

    protected String strCodigo = null;
    
    protected String strNombre = null;

    protected String strDescripcion = null;
    
    public TBLTipoMedicina( String strCodigo, String strNombre, String strDescripcion ) {
        super();
        this.strCodigo = strCodigo;
        this.strNombre = strNombre;
        this.strDescripcion = strDescripcion;
    }

    public TBLTipoMedicina( ) {
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

    
    public String getDescripcion() {
        
        return strDescripcion;
    }

    
    public void setDescripcion( String strDescripcion ) {
        
        this.strDescripcion = strDescripcion;
    }
    
    
}
