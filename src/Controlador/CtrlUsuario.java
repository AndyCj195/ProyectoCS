package Controlador;
import Modelo.UsuarioDao;
import Modelo.Usuario;

public class CtrlUsuario {
    private UsuarioDao userDAO;

    public CtrlUsuario() {
        this.userDAO = new UsuarioDao(); 
    }
    
    public boolean login(String usuario, String contrasenia) {
        userDAO.validarUser(usuario, contrasenia); // Llamada al método del DAO para validar el usuario
        return true; 
    }
    
    public boolean register(String cedula, String nombres, String apellidos, String correo, String user, String contrasenia, String rol) {
        // Crear un nuevo objeto usuario y registrar
        Usuario newUser = new Usuario(0,cedula, nombres, apellidos, correo, user, contrasenia, rol);
        return userDAO.registrarUser(newUser);
 
    }
}
