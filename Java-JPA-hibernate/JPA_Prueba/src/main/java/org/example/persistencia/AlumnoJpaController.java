package org.example.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import org.example.logica.Alumno;

import java.util.List;

public class AlumnoJpaController {

    // La fábrica lee el persistence.xml. Se crea UNA vez y se reutiliza.
    // El texto debe ser igual al name de <persistence-unit>.
    private final EntityManagerFactory emf;

    public AlumnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    // ---------- CREAR ----------
    public void crear(Alumno alumno) {
        EntityManager em = emf.createEntityManager();       // abre tu "conexión de trabajo"
        try {
            em.getTransaction().begin();                    // empieza la transacción
            em.persist(alumno);                             // guarda el alumno nuevo
            em.getTransaction().commit();                   // aquí se escribe en la base
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
    public void editar(Alumno alumno) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(alumno);                               // actualiza uno que ya existe (mismo id)
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
            Alumno alumno = em.find(Alumno.class, id);      // primero se busca...
            if (alumno != null) {
                em.remove(alumno);                          // LÍNEA C: ...y luego se borra
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
    public Alumno buscar(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Alumno.class, id);               // devuelve null si no existe
        } finally {
            em.close();
        }
    }

    // ---------- LISTAR TODOS ----------
    public List<Alumno> listar() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT a FROM Alumno a", Alumno.class).getResultList();
        } finally {
            em.close();
        }
    }

    // ---------- CONTAR ----------
    public long contar() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT COUNT(a) FROM Alumno a", Long.class).getSingleResult();
        } finally {
            em.close();
        }
    }

    // Cierra la fábrica al terminar el programa
    public void cerrar() {
        emf.close();
    }

}