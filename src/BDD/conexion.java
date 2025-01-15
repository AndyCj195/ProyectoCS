/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDD;
import java.sql.*;
/**
 *
 * @author Usuario
 */
public class conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/morasa";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection conectar()
    {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return con;
    }
    
}
