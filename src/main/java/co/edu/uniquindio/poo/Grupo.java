package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    
    private String nombre;
    private Categoria categoria;
    private List<Contacto> contactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        if (!contactos.contains(contacto) && contactos.size() < 5) {
            contactos.add(contacto);
        }
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}