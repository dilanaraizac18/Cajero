package cajero.ExamenPractico.BL;

import java.sql.Types;
import cajero.ExamenPractico.Configuration.DataSourceConfig;
import cajero.ExamenPractico.ML.Result;
import cajero.ExamenPractico.ML.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioBL implements IUsuario {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Result Add(cajero.ExamenPractico.ML.Usuario usuario) {

        Result result = new Result();

        try {
            jdbcTemplate.execute("{CALL UsuarioADD (?,?,?,?,?,?)}", (CallableStatementCallback<Boolean>) callableStatement -> {

                callableStatement.setString(1, usuario.getNombre());
                callableStatement.setString(2, usuario.getApellidoPaterno());
                callableStatement.setString(3, usuario.getApellidoMaterno());
                callableStatement.setString(4, usuario.getCorreo());
                callableStatement.setString(5, usuario.getPassword());
                callableStatement.setInt(6, usuario.getBanco().get(0).getIdBanco());

                int rowAffected = 0;
                rowAffected = callableStatement.executeUpdate();

                result.correct = rowAffected != 0 ? true : false;

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
    public Result GetByEmail(String correo) {
        Result result = new Result();

        try {

            jdbcTemplate.execute("{Call GetByEmail (?, ?, ?)}", (CallableStatementCallback<Boolean>) callableStatement -> {

                callableStatement.setString(1, correo);

                callableStatement.registerOutParameter(2, Types.VARCHAR);
                callableStatement.registerOutParameter(3, Types.VARCHAR);

                String nombre = callableStatement.getString(2);
                String password = callableStatement.getString(3);

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
    public Result Clientes() {
        Result result = new Result();

        try {

            jdbcTemplate.execute("{CALL clientes(?)}", (CallableStatementCallback<Boolean>) callableStatement -> {

                callableStatement.registerOutParameter(1,java.sql.Types.REF_CURSOR);
                callableStatement.execute();
                
                ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
                
                result.objects = new ArrayList<>();
                
                while(resultSet.next()){
                    Usuario usuarioSet = new Usuario();
                    
                    usuarioSet.setNombre(resultSet.getString("nombre"));
                    usuarioSet.setApellidoMaterno(resultSet.getString("apellidoMaterno"));
                    usuarioSet.setApellidoPaterno(resultSet.getString("apellidoPaterno"));
                    usuarioSet.setCorreo(resultSet.getString("correo"));
                    
                    result.correct = true;
                    
                    result.objects.add(usuarioSet);
                }
                
                
                return true;

            }
            );
        } catch (Exception ex) {

        }

        return result;

    }

}
