package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.logging.Logger;


public class GrupoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    //Test agregarContacto se asegura que no se agregue ninugn contacto con  el mismo nombre,telefono y que sus correo sean validos
    @Test
    public void agregarContactoExitoso() {
        LOG.info("Iniciado test agregarContactoExitoso");

        Grupo grupo = new Grupo("Amigos", Categoria.AMIGOS);
        Contacto contacto1 = new Contacto("A", "A", "null", "null", "null@");
        Contacto contacto2 = new Contacto("AD", "A", "null", "null1", "null@");
        Contacto contacto3 = new Contacto("AC", "A", "null", "null2", "null@");
        Contacto contacto4 = new Contacto("AB", "A", "null", "null3", "null@");

        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);

        assertEquals(4, grupo.getContactos().size());

        LOG.info("Finalizando test agregarContactoExitoso");
    }

    //En el test agregarContacto tendremos como prueba si el numero de contactos es < a 5 pasa si es > a 5 falla
    //de esta forma cada vez que falle sera porque el grupo cumpole la condicion de tener minimo 5 contactos

    @Test
    public void agregarContacto() {
        LOG.info("Iniciado test agregarContacto");

        Grupo grupo = new Grupo("Trabajo", Categoria.OFICINA);
        Contacto contacto1 = new Contacto("A", "A", "null", "null", "null@");
        Contacto contacto2 = new Contacto("AD", "A", "null", "null1", "null@");
        Contacto contacto3 = new Contacto("AC", "A", "null", "null2", "null@");
        Contacto contacto4 = new Contacto("AB", "A", "null", "null3", "null@");
       // Contacto contacto5 = new Contacto("AX", "A", "null", "null4", "null@");



        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        //grupo.agregarContacto(contacto5);

        assertEquals(4, grupo.getContactos().size());

        LOG.info("Finalizando test agregarContacto");
    }
}