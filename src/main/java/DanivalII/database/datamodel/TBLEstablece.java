package DanivalII.database.datamodel;

import java.io.Serializable;

public class TBLEstablece implements Serializable{
    
    private static final long serialVersionUID = 7772334217758064812L;
    
    protected String NLotePresentacion = null;
    
    protected String codproducto = null;
    
    protected String NcompraFacturaC = null;
    
    protected String RifProveedor = null;
    
    protected String Cantpedida = null;
    
    protected Double CostoCompra = null;

    public TBLEstablece( String nLotePresentacion, String codproducto, String ncompraFacturaC, String rifProveedor, String cantpedida, Double costoCompra ) {
        super();
        this.NLotePresentacion = nLotePresentacion;
        this.codproducto = codproducto;
        this.NcompraFacturaC = ncompraFacturaC;
        this.RifProveedor = rifProveedor;
        this.Cantpedida = cantpedida;
        this.CostoCompra = costoCompra;
    }

    public TBLEstablece( ) {
        super();

    }

    public String getNLotePresentacion() {
        
        return NLotePresentacion;
    }

    
    public void setNLotePresentacion( String nLotePresentacion ) {
        
        this.NLotePresentacion = nLotePresentacion;
    }

    
    public String getCodproducto() {
        
        return codproducto;
    }

    
    public void setCodproducto( String codproducto ) {
        
        this.codproducto = codproducto;
    }

    
    public String getNcompraFacturaC() {
        
        return NcompraFacturaC;
    }

    
    public void setNcompraFacturaC( String ncompraFacturaC ) {
        
        this.NcompraFacturaC = ncompraFacturaC;
    }

    
    public String getRifProveedor() {
        
        return RifProveedor;
    }

    
    public void setRifProveedor( String rifProveedor ) {
        
        this.RifProveedor = rifProveedor;
    }

    
    public String getCantpedida() {
        
        return Cantpedida;
    }

    
    public void setCantpedida( String cantpedida ) {
        
        this.Cantpedida = cantpedida;
    }

    
    public Double getCostoCompra() {
        
        return CostoCompra;
    }

    
    public void setCostoCompra( Double costoCompra ) {
        
        this.CostoCompra = costoCompra;
    }
    

    
    
}
