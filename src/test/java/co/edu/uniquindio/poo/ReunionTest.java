package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Time;
import java.util.Date;
import java.util.logging.Logger;

public class ReunionTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    //Test que asegura que las reuniones no sean iguales
    @Test
    public void noHayDosReunionesIguales() {
        LOG.info("Iniciado test noHayDosReunionesIguales");

        Date fecha = new Date();
        Time hora = new Time(System.currentTimeMillis());

        Reunion reunion1 = new Reunion("Reunion de Proyecto", fecha, hora);
        Reunion reunion2 = new Reunion("Reunion de Proyecto", fecha, hora);

         // IllegalArgumentException indica que un método ha recibido un argumento inapropiado o inválido
        assertThrows(IllegalArgumentException.class, () -> reunion1.verificarDuplicado(reunion2), "No deben haber dos reuniones iguales");

        LOG.info("Finalizando test noHayDosReunionesIguales");
    }

    //Test para verificar que las reuniones tengan al menos 1 contacto que asista
    @Test
    public void alMenosUnAsistente() {
        LOG.info("Iniciado test alMenosUnAsistente");

        Reunion reunion = new Reunion("Reunión de Proyecto", new Date(), new Time(System.currentTimeMillis()));
        Contacto contacto = new Contacto("null", "null", "null", "null", "@null");

        reunion.agregarAsistente(contacto);

        assertEquals(1, reunion.getAsistentes().size(), "Debe haber al menos un asistente en la reunión");

        LOG.info("Finalizando test alMenosUnAsistente");
    }
}