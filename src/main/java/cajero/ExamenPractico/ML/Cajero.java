
package cajero.ExamenPractico.ML;

import java.util.List;


public class Cajero {
    private Integer IdCajero;
    private Integer SaldoTotal;
    public List<Banco> banco;
    
    
    public Cajero(){}

    public Integer getIdCajero() {
        return IdCajero;
    }
    

    public void setIdCajero(Integer IdCajero) {
        this.IdCajero = IdCajero;
    }

    public Integer getSaldoTotal() {
        return SaldoTotal;
    }

    public void setSaldoTotal(Integer SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }

    public List<Banco> getBanco() {
        return banco;
    }

    public void setBanco(List<Banco> banco) {
        this.banco = banco;
    }
    
    
    
    
    
}
