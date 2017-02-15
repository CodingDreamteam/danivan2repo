package DanivalII.database.datamodel;

import java.io.Serializable;
import java.time.LocalDate;

public class TBLAjuste implements Serializable{

    private static final long serialVersionUID = -3367929725101385461L;
    
    protected String strNumero = null;
    
    protected LocalDate Fecha = null;
    
    protected String strObservacion = null;
    
    protected String strTipo = null;
    
    protected String Cantidad = null;

    public TBLAjuste( String strNumero, LocalDate fecha, String strObservacion, String strTipo, String cantidad ) {
        super();
        this.strNumero = strNumero;
        this.Fecha = fecha;
        this.strObservacion = strObservacion;
        this.strTipo = strTipo;
        this.Cantidad = cantidad;
    }
    
    
    
    
}
