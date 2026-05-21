
package cajero.ExamenPractico.BL;

import cajero.ExamenPractico.ML.Result;
import cajero.ExamenPractico.ML.Retiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RetirarBL implements IRetiro{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Result Retirar(int IdUsuario, int idCajero, int monto) {
        Result result = new Result();
        
        Retiro retiro = new Retiro();
        try{
            jdbcTemplate.execute("{Call RetirarDinero (?,?,?)}", (CallableStatementCallback<Boolean>)callableStatement -> {
                
                callableStatement.setInt(1, retiro.getMonto());
                callableStatement.setInt(2, retiro.getUsuario().getIdUsuario());
                callableStatement.setInt(3, retiro.getCajero().getIdCajero());
                
                callableStatement.execute();
                
                result.correct = true;
                
                return true;
        });
            
            
        }catch(Exception ex){
            result.correct = false;
            result.errorMessage = ex.getLocalizedMessage();
            result.ex = ex;
        }
        
        return result;
    }
    
}
