package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.logging.Logger;

public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

         // IllegalArgumentException indica que un método ha recibido un argumento inapropiado o inválido
        assertThrows(IllegalArgumentException.class, () -> new Contacto(" ", "Juanito", "Calle 123", "123456789", "juan@example.com"), "El nombre no debe estar vacío");
        assertThrows(IllegalArgumentException.class, () -> new Contacto("Juan", " ", "Calle 123", "123456789", "juan@example.com"), "El alias no debe estar vacío");
        assertThrows(IllegalArgumentException.class, () -> new Contacto("Juan", "Juanito", " ", "123456789", "juan@example.com"), "La dirección no debe estar vacía");
        assertThrows(IllegalArgumentException.class, () -> new Contacto("Juan", "Juanito", "Calle 123", " ", "juan@example.com"), "El teléfono no debe estar vacío");
        assertThrows(IllegalArgumentException.class, () -> new Contacto("Juan", "Juanito", "Calle 123", "123456789", ""), "El email no debe estar vacío");

        LOG.info("Finalizando test datosVacios");
    }


    //Test noDuplicados verifia que lo contactos no tenga igual nombre y telefono
    @Test
    public void noDuplicados() {
        LOG.info("Iniciado test noDuplicados");

        Contacto contacto1 = new Contacto("Juan", "Juanito", "Calle 123", "123456789", "juan@example.com");
        Contacto contacto2 = new Contacto("Juan", "Juanito", "Calle 123", "123456789", "juan@example.com");
        Contacto contacto3 = new Contacto("Pedro", "Pedrito", "Calle 456", "987654321", "pedro@example.com");

        assertEquals(contacto1, contacto2, "Los contactos con el mismo nombre y teléfono deben ser iguales");
        assertNotEquals(contacto1, contacto3, "Los contactos con diferente nombre y teléfono no deben ser iguales");

        LOG.info("Finalizando test noDuplicados");
    }
}