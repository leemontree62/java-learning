package org.example.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import org.example.logica.Materia;

import java.util.List;

public class MateriaJpaController {
    private final EntityManagerFactory emf;

    public MateriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    // ---------- CREAR ----------
    public void crear(Materia materia) {
        EntityManager em = emf.createEntityManager();       // abre tu "conexión de trabajo"
        try {
            em.getTransaction().begin();                    // empieza la transacción
            em.persist(materia);                             // LÍNEA C: guarda el alumno nuevo
            em.getTransaction().commit();                   // confirma: aquí se escribe en la base
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
    public void editar(Materia materia) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(materia);                               // LÍNEA C: actualiza uno que ya existe (mismo id)
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
            Materia materia = em.find(Materia.class, id);      // primero se busca...
            if (materia != null) {
                em.remove(materia);                          // LÍNEA C: ...y luego se borra
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
    // Las lecturas no modifican nada, así que no necesitan transacción.
    public Materia buscar(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Materia.class, id);               // devuelve null si no existe
        } finally {
            em.close();
        }
    }

    // ---------- LISTAR TODOS ----------
    public List<Materia> listar() {
        EntityManager em = emf.createEntityManager();
        try {
            // "Alumno" aquí es el nombre de la CLASE Java, no el de la tabla
            return em.createQuery("SELECT a FROM Materia a", Materia.class).getResultList();
        } finally {
            em.close();
        }
    }

    // ---------- CONTAR ----------
    public long contar() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT COUNT(a) FROM Materia a", Long.class).getSingleResult();
        } finally {
            em.close();
        }
    }

    // Cierra la fábrica al terminar el programa
    public void cerrar() {
        emf.close();
    }
}
