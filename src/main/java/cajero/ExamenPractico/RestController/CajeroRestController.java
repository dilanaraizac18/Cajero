/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero.ExamenPractico.RestController;

import cajero.ExamenPractico.BL.CajeroBL;
import cajero.ExamenPractico.ML.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cajero")
public class CajeroRestController {
    
    @Autowired
    private CajeroBL cajeroBL;
    
    @GetMapping("/verSaldo")
    public Result VerSaldo(){
        return  cajeroBL.VerSaldo();
    }
    
    @GetMapping("/actualizarSaldo")
    public Result ActualizarSaldo(){
        return cajeroBL.ActualizarSaldo();
    }
    
}
