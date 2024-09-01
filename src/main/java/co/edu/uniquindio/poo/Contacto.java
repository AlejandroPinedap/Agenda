package co.edu.uniquindio.poo;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

    //asegura que la comparación no se vea afectada por espacios adicionales que puedan estar presentes en la cadena
    public Contacto(String nombre, String alias, String direccion, String telefono, String email) {
        if (nombre == null || nombre.trim().isEmpty() ||
            alias == null || alias.trim().isEmpty() ||
            direccion == null || direccion.trim().isEmpty() ||
            telefono == null || telefono.trim().isEmpty() ||
            email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Ningún campo debe estar vacío y el email debe ser válido");
        }
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // Sobreescribir equals y hashCode para evitar duplicados basados en nombre y teléfono
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Contacto contacto = (Contacto) object;
        return nombre.equals(contacto.nombre) && telefono.equals(contacto.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, telefono);
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
}