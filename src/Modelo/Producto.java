package Modelo;

public class Producto {
    // Atributos de la clase Producto
    private String codigoUnico;
    private String nombre;        // Nombre del producto
    private String descripcion;   // Descripción del producto
    private String rutaImagen;    // Ruta de la imagen del producto
    private int cantidad;         // Cantidad disponible del producto
    private double precio;        // Precio del producto

    public Producto(String codigoUnico,String nombre, String descripcion, String rutaImagen, int cantidad, double precio) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRutaiImagen() {
        return rutaImagen;
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

    public void setRutaImagen(String rutaiImagen) {
        this.rutaImagen = rutaiImagen;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
