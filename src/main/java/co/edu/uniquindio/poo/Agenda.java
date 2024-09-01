package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private List<Grupo> grupos;
    private List<Reunion> reuniones;

    public Agenda() {
        this.contactos = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.reuniones = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        if (!contactos.contains(contacto)) {
            contactos.add(contacto);
        }
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    public void modificarContacto(Contacto contacto, String nuevoAlias, String nuevaDireccion, String nuevoTelefono, String nuevoEmail) {
        if (contactos.contains(contacto)) {
            contacto.setAlias(nuevoAlias);
            contacto.setDireccion(nuevaDireccion);
            contacto.setTelefono(nuevoTelefono);
            contacto.setEmail(nuevoEmail);
        }
    }


    // Métodos gets an set para obtener y modificar las listas
    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void setReuniones(List<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public List<Reunion> getReuniones() {
        return reuniones;
    }
}

