package Modelo;

public class Usuario {

    private int id_usuario;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String user;
    private String contrasenia;
    private String rol;
    
    public Usuario (int id_usuario, String cedula, String nombres, String apellidos, String correo, String user, String contrasenia, String rol ){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.user = user;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }


    public Usuario(int id_usuario, String cedula, String nombres, String apellidos, String correo, String user, String rol) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.user = user;
        this.rol = rol;
    }
    
    public Usuario (String nombres, String apellidos){
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
      public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
        public String getCedula() {
        return cedula;
    }
 
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    @Override
    public String toString() {
        return "cedula =" + cedula +
               "\nnombres=" + nombres + 
               "\napellidos=" + apellidos + 
               "\ncorreo=" + correo + 
               "\nuser=" + user + 
               "\ncontrasenia=" + contrasenia + 
               "\nrol=" + rol;
    }
}
