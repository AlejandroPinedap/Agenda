package co.edu.uniquindio.poo;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Reunion {
    private String descripcion;
    private Date fecha;
    private Time hora;
    private List<Contacto> asistentes;

    public Reunion(String descripcion, Date fecha, Time hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new ArrayList<>();
    }

    //metodos get an set

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public List<Contacto> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Contacto> asistentes) {
        this.asistentes = asistentes;
    }

    public void agregarAsistente(Contacto contacto) {
        if (!asistentes.contains(contacto)) {
            asistentes.add(contacto);
        }
    }

    public void eliminarAsistente(Contacto contacto) {
        asistentes.remove(contacto);
    }

    //se encarga de comparar los objetos junto al metodos hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reunion reunion = (Reunion) o;
        return Objects.equals(descripcion, reunion.descripcion) &&
               Objects.equals(fecha, reunion.fecha) &&
               Objects.equals(hora, reunion.hora);
    }

    //genera un valor hash para un objeto

    @Override
    public int hashCode() {
        return Objects.hash(descripcion, fecha, hora);
    }

    public void verificarDuplicado(Reunion otraReunion) {
        if (this.equals(otraReunion)) {
            throw new IllegalArgumentException("No se pueden crear dos reuniones idénticas");
        }
    }
}

