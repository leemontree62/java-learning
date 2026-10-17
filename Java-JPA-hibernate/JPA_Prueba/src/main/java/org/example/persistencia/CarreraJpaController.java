package org.example.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import org.example.logica.Carrera;

import java.util.List;

public class CarreraJpaController {
    private final EntityManagerFactory emf;

    public CarreraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // ---------- CREAR ----------
    public void crear(Carrera carrera) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();                    // empieza la transacción
            em.persist(carrera);                             // guarda el alumno nuevo
            em.getTransaction().commit();                   //  aquí se escribe en la base
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();             // si algo falla, deshace tod o
            }
            throw e;                                        // avisa del error en vez de ocultarlo
        } finally {
            em.close();                                     // siempre se cierra
        }
    }

    // ---------- EDITAR ----------
    public void editar(Carrera carrera) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(carrera);                               // actualiza uno que ya existe (mismo id)
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    // ---------- BORRAR ----------
    public void borrar(int id) {                            // int porque el id de Alumno es int
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Carrera carrera = em.find(Carrera.class, id);      // primero se busca...
            if (carrera != null) {
                em.remove(carrera);                          //  ...y luego se borra
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        } finally {
            em.close();
        }
    }

    // ---------- BUSCAR UNO ----------
    public Carrera buscar(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Carrera.class, id);               // devuelve null si no existe
        } finally {
            em.close();
        }
    }

    // ---------- LISTAR TODOS ----------
    public List<Carrera> listar() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT a FROM Carrera a", Carrera.class).getResultList();
        } finally {
            em.close();
        }
    }

    // ---------- CONTAR ----------
    public long contar() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT COUNT(a) FROM Carrera a", Long.class).getSingleResult();
        } finally {
            em.close();
        }
    }

    // Cierra la fábrica al terminar el programa
    public void cerrar() {
        emf.close();
    }


}
