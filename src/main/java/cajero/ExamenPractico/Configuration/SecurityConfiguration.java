//package cajero.ExamenPractico.Configuration;
//
////import cajero.ExamenPractico.Component.JwtAuthenticationFilter;
////import cajero.ExamenPractico.Service.UserDetailsServ;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
//
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
////@EnableWebSecurity
//public class SecurityConfiguration {
//
//// 
////    @Autowired
////    private JwtAuthenticationFilter jwtAuth;
//
////    @Autowired
////    private UserDetailsServ userDetailsService;
//    
//    
//    @Bean
//    public UserDetailsService userDetailsService(){
//        
//        UserDetails user = User.builder()
//                .username("dilanaraiza18@outlook.com")
//                .password("{noop}password1")
//                .roles("USER")
//                .build();
//                
//        
//        return new InMemoryUserDetailsManager(user);
//    }
//
//    @Bean
//    public SecurityFilterChain securityFileChain(HttpSecurity http)
//            throws Exception {
//
//        return http
//
//                .csrf(csrf -> csrf.disable())
//
//                .authorizeHttpRequests(auth -> auth
//
//                        .requestMatchers("/auth/login")
//                        .permitAll()
//                        .anyRequest()
//                        .authenticated()
//
//                )
//
//                .build();
//
//               
//    }
//
//   
//
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////
////        return  NoOpPasswordEncoder.getInstance();
////
////    }
//
//}