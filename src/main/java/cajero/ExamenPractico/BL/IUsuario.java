
package cajero.ExamenPractico.BL;

import cajero.ExamenPractico.ML.Result;
import cajero.ExamenPractico.ML.Usuario;


public interface IUsuario {
    Result Add(cajero.ExamenPractico.ML.Usuario Usuario);
    Result GetByEmail(String correo);
    Result Clientes();

    
}
