/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import BDD.conexion;
import java.sql.Connection;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class CtrlAdministrador {
    
    List<Usuario> usuarios = datosQuemadosUser();
    private conexion con = new conexion();
    
    public static List<Usuario> datosQuemadosUser(){
        List<Usuario> usuarios = new ArrayList<>();
        
        usuarios.add(new Usuario(1, "0912345678", "Andres", "Chavez", "andres_chavez@hotmail.com", "admin1", "administrador"));
        usuarios.add(new Usuario(2, "0923456789", "Maria", "Lopez", "maria_lopez@gmail.com", "mlopez", "comprador"));
        usuarios.add(new Usuario(3, "0934567890", "Carlos", "Perez", "carlos_perez@yahoo.com", "cperez", "vendedor"));
        usuarios.add(new Usuario(4, "0945678901", "Ana", "Garcia", "ana_garcia@outlook.com", "agarcia", "comprador"));
        usuarios.add(new Usuario(5, "0956789012", "Luis", "Gomez", "luis_gomez@hotmail.com", "lgomez", "administrador"));
        usuarios.add(new Usuario(6, "0967890123", "Lucia", "Martinez", "lucia_martinez@gmail.com", "lmartinez", "vendedor"));
        usuarios.add(new Usuario(7, "0978901234", "Jorge", "Hernandez", "jorge_hernandez@yahoo.com", "jhernandez", "comprador"));
        usuarios.add(new Usuario(8, "0989012345", "Sofia", "Ramirez", "sofia_ramirez@outlook.com", "sramirez", "vendedor"));
        usuarios.add(new Usuario(9, "0990123456", "Pedro", "Diaz", "pedro_diaz@gmail.com", "pdiaz", "comprador"));
        usuarios.add(new Usuario(10, "0901234567", "Elena", "Cruz", "elena_cruz@yahoo.com", "ecruz", "vendedor"));
        
        return usuarios;
    }
    
    public void MostrarDatos(JTable tabla){
        String[] nombreColumna = {"ID","Cedula", "Nombres", "Apellidos", "Correo", "Usuario", "Rol"};
        DefaultTableModel  modelo = new DefaultTableModel(nombreColumna, 0);
        
        for(Usuario usuario : usuarios){
            Object[] row ={
                usuario.getId_usuario(),
                usuario.getCedula(),
                usuario.getUser(),
                usuario.getNombres(),
                usuario.getApellidos(),
                usuario.getCorreo(),
                usuario.getRol()
            };
            modelo.addRow(row);
        }
        // Asignar el modelo al JTable proporcionado como parámetro
        tabla.setModel(modelo);
    }
    
    public void BuscarUsuario(JTable tblUsuario, String filtroPorCI){
        if (filtroPorCI == null || filtroPorCI.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, 
            "ERROR: Debe ingresar la cedula", "ERROR",JOptionPane.ERROR_MESSAGE);
        return;
        }
        DefaultTableModel modelo = (DefaultTableModel) tblUsuario.getModel();
        modelo.setRowCount(0);
        
        boolean resultFind = false;
        
        for(Usuario usuario : usuarios){
            if((filtroPorCI.isEmpty()) ||usuario.getCedula().toLowerCase().contains(filtroPorCI.toLowerCase())){
                resultFind = true;
                Object[] row = {
                    usuario.getId_usuario(),
                    usuario.getCedula(),
                    usuario.getUser(),
                    usuario.getNombres(),
                    usuario.getApellidos(),
                    usuario.getCorreo(),
                    usuario.getRol()
                };
                modelo.addRow(row);
            }
            tblUsuario.setModel(modelo);
        }
        if(!resultFind){
            JOptionPane.showMessageDialog(null,"ERROR: NO SE ENCONTRARON RESULTADOS CON EL FILTRO PROPORCIONADO.","SIN RESULTADOS",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void EliminarUsuario(Usuario user){
        Connection con = conexion.conectar();
    }
}
