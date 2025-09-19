/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Autor;
import com.bibliotecadigital.domain.service.AutorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JpaAutorRepository implements AutorRepository {

    private final EntityManagerFactory emf;

    public JpaAutorRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // Métodos de utilidad para manejar el EntityManager y las transacciones
    private <T> T execute(Function<EntityManager, T> action) {
        EntityManager em = emf.createEntityManager();
        try {
            return action.apply(em);
        } finally {
            em.close();
        }
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            action.accept(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public Autor save(Autor autor) {
        executeInsideTransaction(em -> {
            if (autor.getId() == 0) {
                em.persist(autor);
            } else {
                em.merge(autor);
            }
        });
        return autor;
    }

    @Override
    public Optional<Autor> findById(int id) {
        return Optional.ofNullable(execute(em -> em.find(Autor.class, id)));
    }

    @Override
    public List<Autor> findAll() {
        return execute(em -> em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList());
    }

    @Override
    public void deleteById(int id) {
        executeInsideTransaction(em -> {
            // Primero, busca el autor usando el EntityManager de ESTA transacción
            Autor autorParaBorrar = em.find(Autor.class, id);
            if (autorParaBorrar != null) {
                // Ahora sí, borra el objeto que está gestionado ("attached")
                em.remove(autorParaBorrar);
            }
        });
    }
}