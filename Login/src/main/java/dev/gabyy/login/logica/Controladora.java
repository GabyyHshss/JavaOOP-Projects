package dev.gabyy.login.logica;

import dev.gabyy.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis;
    
    public Controladora(){
        controlPersis = new ControladoraPersistencia();
    }

    public String validarUsuario(String usuario, String contraseña) {
        
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario user : listaUsuarios){
            if (user.getNombreUsuario().equals(usuario)){
                if(user.getContraseña().equals(contraseña)){
                    mensaje = "Validación correcta. Datos Correctos.";
                    return mensaje;
                }else{
                    mensaje = "Validación correcta. Datos Incorrectos.";
                    return mensaje;
                }
            }else{
                mensaje = "Usuario no Encontrado";
            }

        }
        
        return mensaje;
        
    }
    
}
