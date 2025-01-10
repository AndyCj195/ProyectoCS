/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import BDD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class UsuarioDao {
     public boolean validarUser(String usuario, String contrasenia) {
        try (Connection con = conexion.conectar()) {
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, contrasenia);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Devuelve true si las credenciales son correctas
        } catch (SQLException e) {
            return false;
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
            stmt.setString(5, user.getContrasenia()); // Asegúrate de hashear la contraseña en un entorno real
            stmt.setString(6, user.getRol());
            return stmt.executeUpdate() > 0; // Devuelve true si se insertó correctamente
        } catch (SQLException e) {
            return false;
        }
    }
    
}
