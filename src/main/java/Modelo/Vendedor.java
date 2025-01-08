/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author Andre
 */
public class Vendedor extends Usuario {
    private Boolean vendedor = false;

    public Vendedor(String cedula, String nombre, String apellido, int edad, String direccion, String telefono, String userName, String contrasenia, Boolean vendedor) {
        super(cedula, nombre, apellido, edad, direccion, telefono, userName, contrasenia);
        this.vendedor = vendedor;
    }

    public Boolean getVendedor() {
        return vendedor;
    }

    public void setVendedor(Boolean vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "vendedor=" + vendedor + '}';
    }
    
    
    
    
}
