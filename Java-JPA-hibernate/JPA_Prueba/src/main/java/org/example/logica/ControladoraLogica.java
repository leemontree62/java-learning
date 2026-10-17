package org.example.logica;


import org.example.persistencia.ControladoraPersistencia;

import java.util.List;

public class ControladoraLogica {
    //metodos
    private final ControladoraPersistencia controlPersis = new ControladoraPersistencia();


    //alumno
    public void editarAlumno(Alumno alumno){
        controlPersis.editarAlumno(alumno);
    }
    public void crearAlumno(Alumno alumno){
        controlPersis.crearAlumno(alumno);
    }
    public void borrarAlumno(int id){
        controlPersis.borrarAlumno(id);
    }
    public Alumno buscarAlumno(int id){
        return controlPersis.buscarAlumno(id);
    }
    public List<Alumno> listarAlumnos(){
        return controlPersis.listarAlumnos();
    }
    public long contarAlumnos(){
        return controlPersis.contarAlumnos();
    }


    //carrera
    public void crearCarrera(Carrera carrera){
        controlPersis.crearCarrera(carrera);
    }
    public void editarCarrera(Carrera carrera){
        controlPersis.editarCarrera(carrera);
    }
    public void borrarCarrera(int id){
        controlPersis.borrarCarrera(id);
    }
    public Carrera buscarCarrera(int id){
        return controlPersis.buscarCarrera(id);
    }
    public List<Carrera> listarCarrera(){
        return controlPersis.listarCarreras();
    }
    public long contarCarreras(){
        return controlPersis.contarCarreras();
    }


    //materia
    public void crearMateria(Materia materia){
        controlPersis.crearMateria(materia);
    }
    public void editarCarrera(Materia materia){
        controlPersis.editarMateria(materia);
    }
    public void borrarMateria(int id){
        controlPersis.borrarMatria(id);
    }
    public Materia buscarMateria(int id){
        return controlPersis.buscarMateria(id);
    }
    public List<Materia> listarMateria(){
        return controlPersis.listarMateria();
    }
    public long contarMateria(){
        return controlPersis.contarMateria();
    }

    public void cerrar() {
        controlPersis.cerrar();
    }
}
