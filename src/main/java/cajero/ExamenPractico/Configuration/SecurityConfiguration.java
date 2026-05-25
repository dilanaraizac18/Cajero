//package cajero.ExamenPractico.Configuration;
//
//import cajero.ExamenPractico.Component.JwtAuthenticationFilter;
//import cajero.ExamenPractico.Service.UserDetailsServ;
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
//
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration {
//
//    @Autowired
//    private JwtAuthenticationFilter jwtAuth;
//
//    @Autowired
//    private UserDetailsServ userDetailsService;
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
//                        .requestMatchers("/auth/**").permitAll()
//
//                        .anyRequest().authenticated()
//
//                )
//
//                .sessionManagement(session ->
//                        session.sessionCreationPolicy(
//                                SessionCreationPolicy.STATELESS
//                        )
//                )
//
//                // IMPORTANTE
//                .authenticationProvider(authenticationProvider())
//
//                .addFilterBefore(
//                        jwtAuth,
//                        UsernamePasswordAuthenticationFilter.class
//                )
//
//                .build();
//    }
//
//    // PROVIDER
//@Bean
//public AuthenticationProvider authenticationProvider(){
//
//
//    DaoAuthenticationProvider provider =
//            new DaoAuthenticationProvider(userDetailsService);
//
//    provider.setPasswordEncoder(passwordEncoder());
//
//    return provider;
//}
//
//    @Bean
//    public AuthenticationManager authenticationManager(
//            AuthenticationConfiguration config
//    ) throws Exception {
//
//        return config.getAuthenticationManager();
//
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//
//        return new BCryptPasswordEncoder();
//
//    }
//
//}