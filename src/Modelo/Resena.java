package Modelo;
import java.util.*;

public class Resena extends Usuario{
    private String comentario;
    private Date fechaCreacion;

    public Resena(String comentario, Date fechaCreacion, String nombre, String apellido) {
        super(nombre, apellido);
        this.comentario = comentario;
        this.fechaCreacion = fechaCreacion;
    }

    public String getComentario() {
        return comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
}