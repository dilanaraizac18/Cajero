package cajero.ExamenPractico.BL;

import cajero.ExamenPractico.Configuration.DataSourceConfig;
import cajero.ExamenPractico.ML.Result;
import java.sql.CallableStatement;
import java.sql.Connection;

public class Usuario {

    public static Result Add(cajero.ExamenPractico.ML.Usuario usuario) {
        Result result = new Result();

        try (Connection context = DataSourceConfig.getConecation(); CallableStatement callableStatement = context.prepareCall("{CALL UsuarioADD (?,?,?,?,?,?)}")) {

            callableStatement.setString(1, usuario.getNombre());
            callableStatement.setString(2, usuario.getApellidoPaterno());
            callableStatement.setString(3, usuario.getApellidoMaterno());
            callableStatement.setString(4, usuario.getCorreo());
            callableStatement.setString(5, usuario.getPassword());
            callableStatement.setInt(6, usuario.getBanco().get(0).getIdBanco());
            
            int data = callableStatement.executeUpdate();

            if (data != 0) {
                result.correct = true;
            } else {
                result.correct = false;
                result.errorMessage = "No se ha logrado insertar los datos dentro de la base de datos";
            }

        } catch (Exception ex) {
            result.correct = false;
            result.errorMessage = ex.getLocalizedMessage();
            result.ex = ex;

        }

        return result;
    }

}
