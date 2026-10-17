package org.example.persistencia;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.logica.Alumno;
import org.example.logica.Carrera;
import org.example.logica.Materia;

import java.util.List;

public class ControladoraPersistencia {

    // Lee el persistence.xml, prepara la conexión a la base de datos y
    // el mapa clase-tabla. Es pesado, por eso se crea UNA sola vez.
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidad");

    // Cada controller usa esta misma fábrica para abrir sus gestores.
    private final AlumnoJpaController alumnoJpa = new AlumnoJpaController(emf);
    private  final CarreraJpaController carreraJpa = new CarreraJpaController(emf);
    private final MateriaJpaController materiaJpa = new MateriaJpaController(emf);
    //metodos

    //metodos CRUD controller alumnos
    public void crearAlumno(Alumno alumno){
        alumnoJpa.crear(alumno);
    }
    public void editarAlumno(Alumno alumno){
        alumnoJpa.editar(alumno);
    }
    public void borrarAlumno(int id){
        alumnoJpa.borrar(id);
    }
    public Alumno buscarAlumno(int id){
        return alumnoJpa.buscar(id);
    }
    public List<Alumno> listarAlumnos(){
        return alumnoJpa.listar();
    }
    public long contarAlumnos(){
        return alumnoJpa.contar();
    }


    //metodos crud  controller carrera
    public void crearCarrera(Carrera carrera) {
        carreraJpa.crear(carrera);
    }
    public void editarCarrera(Carrera carrera) {
        carreraJpa.editar(carrera);
    }
    public void borrarCarrera(int id) {
        carreraJpa.borrar(id);
    }
    public Carrera buscarCarrera(int id) {
        return carreraJpa.buscar(id);
    }
    public List<Carrera> listarCarreras() {
        return carreraJpa.listar();
    }
    public long contarCarreras() {
        return carreraJpa.contar();
    }


    //metodos Crud controller  de materia
    public void crearMateria(Materia materia) {
        materiaJpa.crear(materia);
    }
    public void editarMateria(Materia materia) {
        materiaJpa.editar(materia);
    }
    public void borrarMatria(int id) {
        materiaJpa.borrar(id);
    }
    public Materia buscarMateria(int id) {
        return materiaJpa.buscar(id);
    }
    public List<Materia> listarMateria() {
        return materiaJpa.listar();
    }
    public long contarMateria() {
        return materiaJpa.contar();
    }

    public void cerrar(){
        emf.close();
    }

}
