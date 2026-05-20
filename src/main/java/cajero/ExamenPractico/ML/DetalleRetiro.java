
package cajero.ExamenPractico.ML;


public class DetalleRetiro {
    private int IdDetalleRetiro;
    private int Cantidad;
    private int SubTotal;
    public Retiro retiro;
    public Denominacion denominacion;
    
    
    public DetalleRetiro(){}
    
    public DetalleRetiro(int IdDetalleRetiro, int Cantidad, int Subtotal, Retiro retiro, Denominacion denominacion){
        this.IdDetalleRetiro = IdDetalleRetiro;
        this.Cantidad = Cantidad;
        this.SubTotal = Subtotal;
        this.retiro = retiro;
        this.denominacion = denominacion;
    }

    public int getIdDetalleRetiro() {
        return IdDetalleRetiro;
    }

    public void setIdDetalleRetiro(int IdDetalleRetiro) {
        this.IdDetalleRetiro = IdDetalleRetiro;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(int SubTotal) {
        this.SubTotal = SubTotal;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }

    public Denominacion getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(Denominacion denominacion) {
        this.denominacion = denominacion;
    }
    
    
    
    
    
}
