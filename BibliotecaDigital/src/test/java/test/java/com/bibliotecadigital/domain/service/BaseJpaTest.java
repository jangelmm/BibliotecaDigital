package test.java.com.bibliotecadigital.domain.service;

import com.bibliotecadigital.infrastructure.persistence.JpaBibliotecaRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * Clase base abstracta para todos los tests que interactúan con la base de datos real vía JPA.
 * Su propósito es centralizar la configuración del EntityManagerFactory y, lo más importante,
 * garantizar que la base de datos se limpie ANTES de la ejecución de CADA test.
 */
public abstract class BaseJpaTest {

    protected static EntityManagerFactory emf;
    protected JpaBibliotecaRepository repository;

    @BeforeAll
    static void setUpAll() {
        // Se crea el EMF una sola vez para toda la suite de tests, es un objeto pesado.
        emf = Persistence.createEntityManagerFactory("biblioteca-pu");
    }

    @AfterAll
    static void tearDownAll() {
        if (emf != null) {
            emf.close();
        }
    }

    @BeforeEach
    void setUp() {
        // Antes de CADA test, se limpia la base de datos para asegurar el aislamiento.
        clearDatabase();
        // Se crea una nueva instancia del repositorio para el test actual.
        repository = new JpaBibliotecaRepository();
    }
    
    /**
     * Borra todos los datos de las tablas para asegurar que cada test comience
     * en un estado limpio y predecible.
     */
    private void clearDatabase() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            // El orden del borrado es importante por las claves foráneas (borrar préstamos antes que usuarios/materiales)
            em.createQuery("DELETE FROM Prestamo").executeUpdate();
            // Las tablas de unión se limpian al borrar las entidades principales
            em.createQuery("DELETE FROM MaterialBiblioteca").executeUpdate();
            em.createQuery("DELETE FROM Autor").executeUpdate();
            em.createQuery("DELETE FROM Usuario").executeUpdate();
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}