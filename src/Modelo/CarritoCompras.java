/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Andre
 */
public class CarritoCompras extends Producto{
    private double precioTotal;
    private Date fecha;
    private boolean estado = true;

    public CarritoCompras(double precio, Date fecha, String nombre, String descripcion, String rutaImagen, int cantidad, double precioTotal) {
        super(nombre, descripcion, rutaImagen, cantidad, precio);
        this.precioTotal = precioTotal;
        this.fecha = fecha;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }
    
    
}
