
package cajero.ExamenPractico.RestController;

import cajero.ExamenPractico.BL.RetirarBL;
import cajero.ExamenPractico.ML.Result;
import cajero.ExamenPractico.ML.Retiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cajero")
public class RetiroRestController {
    
    @Autowired
    private RetirarBL retirarBL;
    
    
     @PostMapping("/retirar")
    public Result Retirar( @RequestBody Retiro retiro){

        return retirarBL.Retirar(retiro);

    }
    
    
    @GetMapping("/rellenar")
    public Result Rellenar (){
        return retirarBL.Rellenar();
    }
    
    
}
