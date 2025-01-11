package Controlador;



import BDD.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class CtrlProducto {
    public void presentNameAndPrice(String idProducto, JLabel lblNombre, JLabel lblPrecio){
        try(Connection con = conexion.conectar()){
            String query ="SELECT nombre, precio * FROM productos WHERE = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, idProducto);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                
                lblNombre.setText("nombre: " + nombre);
                lblPrecio.setText("Precio: $" + String.format("%.2f", precio)); 
            }else{
                lblNombre.setText("Producto no encontrado");
                lblPrecio.setText("");
            }
        }catch(SQLException e){
            lblNombre.setText("Error al consultar producto");
            lblPrecio.setText(e.getMessage());
        }
    }
    
}
