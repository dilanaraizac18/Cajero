
package cajero.ExamenPractico.Service;

import cajero.ExamenPractico.BL.UsuarioBL;
import cajero.ExamenPractico.ML.Result;
import cajero.ExamenPractico.ML.Usuario;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServ implements UserDetailsService{
    
    private final UsuarioBL usuariobl;
    
    public UserDetailsServ(UsuarioBL usuarioDAOJPAImplementation){
        this.usuariobl = usuarioDAOJPAImplementation;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Result result = usuariobl.GetByEmail(username);
        
        Usuario usuario = (Usuario) result.object;
        
        return User.withUsername(usuario.getCorreo())
                .password(usuario.getPassword())
                .build();
    }
    
}
