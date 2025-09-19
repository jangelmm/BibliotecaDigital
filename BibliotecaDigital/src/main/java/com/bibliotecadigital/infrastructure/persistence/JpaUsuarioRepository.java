/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bibliotecadigital.infrastructure.persistence;

/**
 *
 * @author jesus
 */

import com.bibliotecadigital.domain.model.Usuario;
import com.bibliotecadigital.domain.service.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class JpaUsuarioRepository implements UsuarioRepository {

    private final EntityManagerFactory emf;

    public JpaUsuarioRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // (Puedes copiar los métodos de utilidad 'execute' y 'executeInsideTransaction' de JpaAutorRepository)
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
    public Usuario save(Usuario usuario) {
        executeInsideTransaction(em -> {
            if (usuario.getId() == null) {
                em.persist(usuario);
            } else {
                em.merge(usuario);
            }
        });
        return usuario;
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return Optional.ofNullable(execute(em -> em.find(Usuario.class, id)));
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return execute(em -> {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", Usuario.class);
            query.setParameter("email", email);
            try {
                return Optional.of(query.getSingleResult());
            } catch (jakarta.persistence.NoResultException e) {
                return Optional.empty();
            }
        });
    }

    @Override
    public List<Usuario> findAll() {
        return execute(em -> em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList());
    }

    @Override
    public void delete(Usuario usuario) {
        executeInsideTransaction(em -> {
            if (em.contains(usuario)) {
                em.remove(usuario);
            } else {
                Usuario managedUsuario = em.find(Usuario.class, usuario.getId());
                if (managedUsuario != null) {
                    em.remove(managedUsuario);
                }
            }
        });
    }
}