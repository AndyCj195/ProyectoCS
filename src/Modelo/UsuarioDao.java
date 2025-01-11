/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Vista.*;
import BDD.conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class UsuarioDao {

     // Función para validar usuarios
    public void validarUser(String usuario, String contrasenia) {
        try (Connection con = conexion.conectar()) {
            String sql = "SELECT rol FROM usuarios WHERE usuario = ? AND contrasena = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, contrasenia);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String rol = rs.getString("rol");
                System.out.println("Rol obtenido: " + rol);  // Verifica el valor del rol
                AccesoPorRol(rol); // Redirige según el rol
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al validar usuario: " + e.getMessage());
        }
    }

    // Función para redirigir según el rol
    private void AccesoPorRol(String rol) {
        if ("administrador".equals(rol)) {
            // Redirigir a la vista de admin
            new FrmAlterno().setVisible(true);  // Mostrar interfaz de administrador
        } else if ("comprador".equals(rol)) {
            // Redirigir a la vista de comprador
            new main().setVisible(true);  // Mostrar interfaz principal
        } else if ("vendedor".equals(rol)){
            //redirigir a la vista vendedor
            new FrmAlterno().setVisible(true);// comparte interfaz con administrador
        } else{
            JOptionPane.showMessageDialog(null, "Rol no reconocido");
        }
    }

    //funcion para registrar los usuarios
    public boolean registrarUser(Usuario user) {
        try (Connection con = conexion.conectar()) {
            String sql = "INSERT INTO usuarios (nombres, apellidos, usuario, correo, contrasena, rol) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, user.getNombres());
            stmt.setString(2, user.getApellidos());
            stmt.setString(3, user.getUser());
            stmt.setString(4, user.getCorreo());
            stmt.setString(5, user.getContrasenia()); 
            stmt.setString(6, user.getRol()); // crear funcion para la validación por rol
            return stmt.executeUpdate() > 0; // Devuelve true si se insertó correctamente
        } catch (SQLException e) {
            return false;
        }
    } 
    
}
