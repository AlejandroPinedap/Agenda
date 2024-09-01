package co.edu.uniquindio.poo;

import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una agenda
        Agenda agenda = new Agenda();

        // Crear algunos contactos
        Contacto contacto1 = new Contacto("Juan Perez", "Juan", "Calle 123", "1234567890", "juan@example.com");
        Contacto contacto2 = new Contacto("Maria Gomez", "Maria", "Avenida 456", "0987654321", "maria@example.com");
        Contacto contacto3 = new Contacto("Carlos Ruiz", "Carlos", "Calle 789", "1122334455", "carlos@example.com");
        Contacto contacto4 = new Contacto("Ana Lopez", "Ana", "Avenida 789", "5566778899", "ana@example.com");
        Contacto contacto5 = new Contacto("Luis Martinez", "Luis", "Calle 101", "6677889900", "luis@example.com");

        // Agregar contactos a la agenda
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto3);
        agenda.agregarContacto(contacto4);
        agenda.agregarContacto(contacto5);

         // Mostrar información de la agenda
         System.out.println("\nContactos en la agenda:");
         for (Contacto c : agenda.getContactos()) {
             System.out.println(c.getNombre() + " - " + c.getTelefono());
         }

        // Crear un grupo y agregar contactos
        Grupo Amigos = new Grupo("Amigos", Categoria.AMIGOS);
        Amigos.agregarContacto(contacto1);
        Amigos.agregarContacto(contacto2);
        Amigos.agregarContacto(contacto3);
        Amigos.agregarContacto(contacto4);
        Amigos.agregarContacto(contacto5);

        // Imprimir detalles del grupo
        System.out.println("\nGrupo creado:");
        System.out.println("Nombre: " + Amigos.getNombre());
        System.out.println("Categoría: " + Amigos.getCategoria());
        System.out.println("Contactos en el grupo:");
        for (Contacto c : Amigos.getContactos()) {
            System.out.println(c.getNombre() + " - " + c.getTelefono());
        }

        // Agregar grupo a la agenda
        agenda.getGrupos().add(Amigos);

        // Crear un grupo y agregar contactos
        Grupo Oficina = new Grupo("Oficina", Categoria.OFICINA);
        Oficina.agregarContacto(contacto1);
        Oficina.agregarContacto(contacto2);
        Oficina.agregarContacto(contacto4);
        

        // Imprimir detalles del grupo
        System.out.println("\nGrupo creado:");
        System.out.println("Nombre: " + Oficina.getNombre());
        System.out.println("Categoría: " + Oficina.getCategoria());
        System.out.println("Contactos en el grupo:");
        for (Contacto c : Oficina.getContactos()) {
            System.out.println(c.getNombre() + " - " + c.getTelefono());
        }

        // Agregar grupo a la agenda
        agenda.getGrupos().add(Amigos);

        // Crear una reunión y agregar asistentes
        Reunion reunion = new Reunion("Reunión de Proyecto", new Date(), new Time(System.currentTimeMillis()));
        reunion.agregarAsistente(contacto1);
        reunion.agregarAsistente(contacto2);

        // Agregar reunión a la agenda
        agenda.getReuniones().add(reunion);

       

      

        System.out.println("\nReuniones en la agenda:");
        for (Reunion r : agenda.getReuniones()) {
            System.out.println(r.getDescripcion() + " - " + r.getFecha() + " - " + r.getHora());
            System.out.println("Asistentes:");
            for (Contacto c : r.getAsistentes()) {
                System.out.println(c.getNombre() + " - " + c.getTelefono());
            }
        }
    }
}