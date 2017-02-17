package DanivalII.database.datamodel;

import java.time.LocalDate;

public class TBLFacturaVenta {
 
     protected String strNventa = null;
    
     protected int intNcaja; //1 y 2
     
     protected LocalDate Fventa = null;
     
     protected String strEstado = null;
     
     protected Double DTotal = null;
    
     protected String strDescription = null;

     protected String strIdCliente = null;
     
    public TBLFacturaVenta( String strNventa, int intNcaja, LocalDate fventa, String strEstado, Double dNventa, String strDescription, String strIdCliente ) {
        super();
        this.strNventa = strNventa;
        this.intNcaja = intNcaja;
        this.Fventa = fventa;
        this.strEstado = strEstado;
        this.DTotal = dNventa;
        this.strDescription = strDescription;
        this.strIdCliente = strIdCliente;
    }

    public TBLFacturaVenta ( )  {
        super();

    } 
   
    public Double getDTotal() {
        
        return DTotal;
    }

    
    public void setDTotal( Double dTotal ) {
        
        this.DTotal = dTotal;
    } 
    
   public String getStrIdCliente() {
       
       return strIdCliente;
   }

   
   public void setStrIdCliente( String strIdCliente ) {
       
       this.strIdCliente = strIdCliente;
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
