
package cajero.ExamenPractico.ML;

import java.util.List;


public class Cajero {
    private int IdCajero;
    private int SaldoTotal;
    public List<Banco> banco;
    
    
    public Cajero(){}
    
    public Cajero(int IdCajero, int SaldoTotal){
        this.IdCajero = IdCajero;
        this.SaldoTotal = SaldoTotal;
    }

    public int getIdCajero() {
        return IdCajero;
    }

    public void setIdCajero(int IdCajero) {
        this.IdCajero = IdCajero;
    }

    public int getSaldoTotal() {
        return SaldoTotal;
    }

    public void setSaldoTotal(int SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }

    public List<Banco> getBanco() {
        return banco;
    }

    public void setBanco(List<Banco> banco) {
        this.banco = banco;
    }
    
    
    
    
    
}
