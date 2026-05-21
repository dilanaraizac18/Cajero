
package cajero.ExamenPractico.BL;

import cajero.ExamenPractico.ML.Result;


public interface IRetiro {
    Result Retirar(int IdUsuario, int idCajero, int monto);
    
}
