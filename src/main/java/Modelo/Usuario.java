package Modelo;

/**
 *
 * @author andre
 */
public class Usuario {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String telefono;
    private String userName;
    private String contrasenia;

    public Usuario(String cedula, String nombre, String apellido, int edad, String direccion, String telefono, String userName, String contrasenia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.userName = userName;
        this.contrasenia = contrasenia;
    }
    
    
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUserName() {
        return userName;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
