
package cajero.ExamenPractico.ML;

import java.util.List;


public class Cajero {
    private Integer IdCajero;
    private Double SaldoTotal;
    public List<Banco> banco;
    
    
    public Cajero(){}
    
    public Cajero(Integer IdCajero, Double SaldoTotal){
        this.IdCajero = IdCajero;
        this.SaldoTotal = SaldoTotal;
    }

    public Integer getIdCajero() {
        return IdCajero;
    }

    public void setIdCajero(Integer IdCajero) {
        this.IdCajero = IdCajero;
    }

    public Double getSaldoTotal() {
        return SaldoTotal;
    }

    public void setSaldoTotal(Double SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }

    public List<Banco> getBanco() {
        return banco;
    }

    public void setBanco(List<Banco> banco) {
        this.banco = banco;
    }
    
    
    
    
    
}
