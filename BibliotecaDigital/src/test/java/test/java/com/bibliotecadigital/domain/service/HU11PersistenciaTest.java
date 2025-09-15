package test.java.com.bibliotecadigital.domain.service;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HU11PersistenciaTest {

    @Test
    void testInicializacionJPAyConexionDB() {
        EntityManagerFactory emf = null;
        try {
            // Intenta crear el EntityManagerFactory usando el nombre de la unidad de persistencia de persistence.xml
            emf = Persistence.createEntityManagerFactory("biblioteca-pu");
            
            // Si la línea anterior no lanza una excepción, la configuración es correcta.
            assertNotNull(emf, "El EntityManagerFactory no debería ser nulo si la conexión fue exitosa.");
            
        } catch (Exception e) {
            // Si algo falla (ej. no encuentra el driver, XML mal formado), este test fallará.
            fail("Falló la inicialización de JPA y la conexión a la base de datos.", e);
        } finally {
            if (emf != null && emf.isOpen()) {
                emf.close();
            }
        }
    }
}