package Controlador;
import java.util.*;
import javax.swing.*;
import java.sql.*;

import BDD.conexion;
import java.awt.BorderLayout;
public class Validacion {
   
    public JLabel limitarTexto(JLabel label, String texto, int limite){
        if(texto.length() > limite){
            label.setText(texto.substring(0, limite - 3) + "...");
        }else{
            label.setText(texto);
        }
        return label;
    }
    
    public int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min; // Generar número aleatorio entre min y max
    }
    
    public int contarFilasPorId(int idProducto) {
        int count = 0;
        try (Connection con = conexion.conectar()) {
            String query = "SELECT COUNT(*) FROM productos WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, idProducto);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1); // Obtener el conteo
            }
        } catch (SQLException e) {
            System.err.println("Error con el conteo:" + e.getMessage());
        }
        return count;
    }
   
    public void ShowJPanel(JPanel p, JPanel content, int X, int Y) {

        // Configuración para mostrar el panel en el contenedor
        p.setSize(X, Y); // Dimensiones específicas
        p.setLocation(0, 0);

        content.removeAll(); // Limpiar contenido previo
        content.add(p); // Agregar el nuevo panel
        content.revalidate(); // Actualizar el contenedor
        content.repaint(); // Repintar el contenedor
    }
}
