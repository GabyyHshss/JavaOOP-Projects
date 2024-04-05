package dev.gabyy.login.persistencia;

import dev.gabyy.login.logica.Usuario;
import java.util.List;

/**
 *
 * @author gabrielsan
 */
public class ControladoraPersistencia {
    UsuarioJpaController userJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        List<Usuario> usuarios =  userJpa.findUsuarioEntities();
        return usuarios;
    }
    
}
