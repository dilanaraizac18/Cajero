///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package cajero.ExamenPractico.RestController;
//
////import cajero.ExamenPractico.Configuration.JwtService;
//import cajero.ExamenPractico.DTO.LoginRequest;
////import cajero.ExamenPractico.Service.UserDetailsServ;
//import java.util.HashMap;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
//@RestController
//@RequestMapping("/auth")
//@CrossOrigin(origins = "http://localhost:4200")
//public class AuthRestController {
//    
////    @Autowired
////    private AuthenticationManager authenticationManager;
//
////    @Autowired
////    private UserDetailsServ userDetailsService;
//
////    @Autowired
////    private JwtService jwtService;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
//        
//        if(loginRequest.getCorreo().equals("dilanaraiza18@outlook.com") && loginRequest.getPassword().equals("password1")){
//            
//            return ResponseEntity.ok("inicio de sesión correcto");
//        } 
//        
//        return ResponseEntity.badRequest().body("Credenciales incorrectas");
//    }
//}
