package cajero.ExamenPractico.RestController;

import cajero.ExamenPractico.ML.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/usuario")
    public class UsuarioRestController {
        
         @Autowired
    private cajero.ExamenPractico.BL.UsuarioBL usuarioBL;

        @PostMapping("/add")
        public Result Add(@RequestBody cajero.ExamenPractico.ML.Usuario usuario) {

            return usuarioBL.Add(usuario);
        }
        
        
        @GetMapping("/clientes")
        public Result GetClientes(){
            return usuarioBL.Clientes();
        }
    }

