/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author andre
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private String rutaiImagen;
    private int cantidad;
    private double precio;

    public Producto(String nombre, String descripcion, String rutaiImagen, int cantidad, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rutaiImagen = rutaiImagen;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRutaiImagen() {
        return rutaiImagen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRutaiImagen(String rutaiImagen) {
        this.rutaiImagen = rutaiImagen;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}