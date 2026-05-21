
package cajero.ExamenPractico.BL;

import java.sql.Types;
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
    public Result Retirar(Retiro retiro) {
        Result result = new Result();
        
        try{
            jdbcTemplate.execute("{Call RetirarDinero (?,?,?,?)}", (CallableStatementCallback<Boolean>)callableStatement -> {
                
                callableStatement.setInt(1, retiro.getMonto());
                callableStatement.setInt(2, retiro.getUsuario().getIdUsuario());
                callableStatement.setInt(3, retiro.getCajero().getIdCajero());
                callableStatement.registerOutParameter(4, Types.VARCHAR);
                
                callableStatement.execute();
                
                result.correct = true;
                result.object =
                        callableStatement.getString(4);
                
                return true;
        });
            
            
        }catch(Exception ex){
            result.correct = false;
            result.errorMessage = ex.getLocalizedMessage();
            result.ex = ex;
        }
        
        return result;
    }

    @Override
    public Result Rellenar() {
        Result result = new Result();
        
        try{
            jdbcTemplate.execute("{CALL rellenar()}", (CallableStatementCallback<Boolean>) callableStatement ->{
                
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
