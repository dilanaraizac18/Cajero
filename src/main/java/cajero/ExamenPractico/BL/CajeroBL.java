/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.ExamenPractico.BL;

import cajero.ExamenPractico.ML.Cajero;
import cajero.ExamenPractico.ML.Result;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.SQLErrorCodesFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CajeroBL implements ICajero {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Result VerSaldo() {
        Result result = new Result();

        try {

            jdbcTemplate.execute("{Call VerSaldo(?)}", (CallableStatementCallback<Boolean>) callableStatement -> {
                callableStatement.registerOutParameter(1, java.sql.Types.NUMERIC);

                callableStatement.execute();
                
                Cajero cajero = new Cajero();
                
                cajero.setSaldoTotal(callableStatement.getInt(1));
                
                result.object = cajero;
                    
                    result.correct = true;
                

                return true;
            });

        } catch (Exception ex) {
            result.correct = false;
            result.errorMessage = ex.getLocalizedMessage();
            result.ex = ex;
        }

        return result;
    }

    @Override
    public Result ActualizarSaldo() {
        Result result = new Result();
        
        try{
            
            jdbcTemplate.execute("{CALL SaldoCajero()}", (CallableStatementCallback<Boolean>) callableStatement ->{
                
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
