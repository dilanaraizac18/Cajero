
package cajero.ExamenPractico.Configuration;

import cajero.ExamenPractico.Service.UserDetailsServ;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    private final UserDetailsServ userDetailJPA;
    
    public SecurityConfiguration (UserDetailsServ userDetailJPA){
        this.userDetailJPA = userDetailJPA;
    }
    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer -> configurer
//        .requestMatchers("")
//        .hasAnyRole()
//        .requestMatchers("/css/**", "/js/**", "/images/**", "/login").permitAll()
        .anyRequest().authenticated())
                
        .formLogin(form -> form.permitAll()
//         .loginPage("/login")
//        .loginProcessingUrl("/login")
//        .defaultSuccessUrl("/retirar")
//         .failureUrl("/login?error=true")
        )
        .userDetailsService((org.springframework.security.core.userdetails.UserDetailsService) userDetailJPA);
        
        return http.build();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
}
