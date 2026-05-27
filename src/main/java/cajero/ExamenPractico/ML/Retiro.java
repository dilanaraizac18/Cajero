
package cajero.ExamenPractico.ML;

import java.util.List;


public class Retiro {
    private Integer IdRetiro;
    private Integer Monto;
    
    private Usuario usuario;
    private Cajero cajero;
    
    public Retiro(){}

    public Retiro(Integer IdRetiro, Integer Monto, Usuario usuario, Cajero cajero) {
        this.IdRetiro = IdRetiro;
        this.Monto = Monto;
        this.usuario = usuario;
        this.cajero = cajero;
    }

    public Integer getIdRetiro() {
        return IdRetiro;
    }

    public void setIdRetiro(Integer IdRetiro) {
        this.IdRetiro = IdRetiro;
    }

    public Integer getMonto() {
        return Monto;
    }

    public void setMonto(Integer Monto) {
        this.Monto = Monto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }
    
    
    
}
