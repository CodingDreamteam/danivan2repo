package DanivalII.database.datamodel;

import java.io.Serializable;
import java.time.LocalDate;

public class TBLFacturaCompra implements Serializable {

    private static final long serialVersionUID = 6221210110631397139L;

    protected String strNFacutra = null;
    
    protected LocalDate FechaRecepcion = null;
    
    protected Double dTotal = null;
        
    protected String strEstado = null;
 
    public TBLFacturaCompra( String strNFacutra, LocalDate fechaRecepcion, Double dTotal, String strEstado ) {
        super();
        this.strNFacutra = strNFacutra;
        this.FechaRecepcion = fechaRecepcion;
        this.dTotal = dTotal;
        this.strEstado = strEstado;
    }

    public TBLFacturaCompra(  ) {
        super();

    }

    
    public String getNFacutra() {
        
        return strNFacutra;
    }

    
    public void setNFacutra( String nFacutra ) {
        
        strNFacutra = nFacutra;
    }

    
    public LocalDate getFechaRecepcion() {
        
        return FechaRecepcion;
    }

    
    public void setFechaRecepcion( LocalDate fechaRecepcion ) {
        
        this.FechaRecepcion = fechaRecepcion;
    }

    
    public Double getTotal() {
        
        return dTotal;
    }

    
    public void setTotal( Double dTotal ) {
        
        this.dTotal = dTotal;
    }

    
    public String getEstado() {
        
        return strEstado;
    }

    
    public void setEstado( String strEstado ) {
        
        this.strEstado = strEstado;
    }
    
    
}
