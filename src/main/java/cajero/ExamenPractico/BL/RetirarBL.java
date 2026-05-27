
package cajero.ExamenPractico.BL;

import cajero.ExamenPractico.ML.Cajero;
import cajero.ExamenPractico.ML.Denominacion;
import cajero.ExamenPractico.ML.Result;
import cajero.ExamenPractico.ML.Retiro;
import cajero.ExamenPractico.ML.TipoDenominacion;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
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

    @Override
    public Result GetALl() {
        Result result = new Result();
        
        
            jdbcTemplate.execute("{CALL GetAll(?)}", (CallableStatementCallback<Boolean>)callableStatement ->{
            callableStatement.registerOutParameter(1, java.sql.Types.REF_CURSOR);
            callableStatement.execute();
            
            ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
            
            result.objects = new ArrayList<>();
            
            while(resultSet.next()){
                Denominacion denominacion = new Denominacion();
                
                denominacion.setIdDenominacion(resultSet.getInt("iddenominacion"));
                denominacion.setCantidad(resultSet.getInt("cantidad"));
                denominacion.setValor(resultSet.getInt("valor"));
                denominacion.tipo = new TipoDenominacion();
                
                denominacion.tipo.setNombre(resultSet.getString("Tipo"));
                denominacion.cajero = new Cajero();
                
                denominacion.cajero.setIdCajero(resultSet.getInt("idCajero"));
                
                result.correct = true;
                
                result.objects.add(denominacion);
            }
            
            
            
            return true;
            
        
        
            });
        return result;
    

    
}
}
