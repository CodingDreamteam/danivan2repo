package DanivalII.database.datamodel;

import java.time.LocalDate;

public class TBLFacturaVenta {
 
     protected String strNventa = null;
    
     protected int intNcaja; //1 y 2
     
     protected LocalDate Fventa = null;
     
     protected String strEstado = null;
     
     protected Double DNventa = null;
     
     protected String strDescription = null;

    
     
     
    public TBLFacturaVenta( String strNventa, int intNcaja, LocalDate fventa, String strEstado, Double dNventa, String strDescription ) {
        super();
        this.strNventa = strNventa;
        this.intNcaja = intNcaja;
        this.Fventa = fventa;
        this.strEstado = strEstado;
        this.DNventa = dNventa;
        this.strDescription = strDescription;
    }

    public TBLFacturaVenta ( )  {
        super();

    }

    public String getNventa() {
        
        return strNventa;
    }

    
    public void setNventa( String strNventa ) {
        
        this.strNventa = strNventa;
    }

    
    public int getNcaja() {
        
        return intNcaja;
    }

    
    public void setNcaja( int intNcaja ) {
        
        this.intNcaja = intNcaja;
    }

    
    public LocalDate getFventa() {
        
        return Fventa;
    }

    
    public void setFventa( LocalDate fventa ) {
        
        this.Fventa = fventa;
    }

    
    public String getEstado() {
        
        return strEstado;
    }

    
    public void setEstado( String strEstado ) {
        
        this.strEstado = strEstado;
    }

    
    public String getDescription() {
        
        return strDescription;
    }

    
    public void setDescription( String strDescription ) {
        
        this.strDescription = strDescription;
    }
     
     
}
