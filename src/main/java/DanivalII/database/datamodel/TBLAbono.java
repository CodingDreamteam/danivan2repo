package DanivalII.database.datamodel;


public class TBLAbono {
   
    protected String strNumero = null;
    
    protected int intCantidad;

    public TBLAbono( String strNumero, int intCantidad ) {
        super();
        this.strNumero = strNumero;
        this.intCantidad = intCantidad;
    }
    
    public TBLAbono( ) {
        super();

    }

    
    public String getNumero() {
        
        return strNumero;
    }

    
    public void setNumero( String strNumero ) {
        
        this.strNumero = strNumero;
    }

    
    public int getCantidad() {
        
        return intCantidad;
    }

    
    public void setCantidad( int intCantidad ) {
        
        this.intCantidad = intCantidad;
    }
    
    
}
