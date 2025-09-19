/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Prestamo;
import com.bibliotecadigital.domain.service.PrestamoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JpaPrestamoRepository implements PrestamoRepository {

    private final EntityManagerFactory emf;

    public JpaPrestamoRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    // Métodos de utilidad para manejar el EntityManager y las transacciones
    private <T> T execute(Function<EntityManager, T> action) {
        EntityManager em = emf.createEntityManager();
        try { return action.apply(em); } 
        finally { em.close(); }
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
    public Prestamo save(Prestamo prestamo) {
        executeInsideTransaction(em -> {
            if (prestamo.getId() == 0) {
                em.persist(prestamo);
            } else {
                em.merge(prestamo);
            }
        });
        return prestamo;
    }

    @Override
    public Optional<Prestamo> findById(int id) {
        return Optional.ofNullable(execute(em -> em.find(Prestamo.class, id)));
    }

    @Override
    public List<Prestamo> findAll() {
        return execute(em -> em.createQuery("SELECT p FROM Prestamo p", Prestamo.class).getResultList());
    }
}