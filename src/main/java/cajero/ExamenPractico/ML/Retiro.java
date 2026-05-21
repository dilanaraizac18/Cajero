
package cajero.ExamenPractico.ML;

import java.util.List;


public class Retiro {
    private int IdRetiro;
    private int Monto;
    public Usuario usuario;
    public Cajero cajero;
    
    public Retiro(){}

    public Retiro(int IdRetiro, int Monto, Usuario usuario, Cajero cajero) {
        this.IdRetiro = IdRetiro;
        this.Monto = Monto;
        this.usuario = usuario;
        this.cajero = cajero;
    }

    public int getIdRetiro() {
        return IdRetiro;
    }

    public void setIdRetiro(int IdRetiro) {
        this.IdRetiro = IdRetiro;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
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
