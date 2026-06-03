
package cajero.ExamenPractico.ML;


public class Denominacion {
    
    public Integer IdDenominacion;
    public int Cantidad;
    public double Valor;
    public Cajero cajero;
    public TipoDenominacion tipo;
    
    public Denominacion(){}

    public Denominacion(Integer IdDenominacion, int Cantidad, double Valor, Cajero cajero, TipoDenominacion tipo) {
        this.IdDenominacion = IdDenominacion;
        this.Cantidad = Cantidad;
        this.Valor = Valor;
        this.cajero = cajero;
        this.tipo = tipo;
    }

    public Integer getIdDenominacion() {
        return IdDenominacion;
    }

    public void setIdDenominacion(Integer IdDenominacion) {
        this.IdDenominacion = IdDenominacion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public TipoDenominacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDenominacion tipo) {
        this.tipo = tipo;
    }
    
    
    
}
