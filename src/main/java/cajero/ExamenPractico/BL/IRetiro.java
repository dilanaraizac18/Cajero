
package cajero.ExamenPractico.BL;

import cajero.ExamenPractico.ML.Result;
import cajero.ExamenPractico.ML.Retiro;


public interface IRetiro {
    Result Retirar(Retiro retiro);
    Result Rellenar();
    
}
