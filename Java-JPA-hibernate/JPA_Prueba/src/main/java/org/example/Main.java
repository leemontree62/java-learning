package org.example;
import org.example.logica.Alumno;
import org.example.logica.Carrera;
import org.example.logica.ControladoraLogica;
import org.example.logica.Materia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Requiere Java 25”

public class Main {
    static void main() {
        ControladoraLogica control = new ControladoraLogica();
        // 1) materias
        Materia materia1 = new Materia("Programacion", "Cuatrimestral");
        Materia materia2 = new Materia("Programacion II", "Cuatrimestral");
        Materia materia3 = new Materia("Programacion Avanzada", "Anual");

        control.crearMateria(materia1);
        control.crearMateria(materia2);
        control.crearMateria(materia3);

        //las agregamos a la lista
        List<Materia> listaMateria = new ArrayList<>();
        listaMateria.add(materia1);
        listaMateria.add(materia2);
        listaMateria.add(materia3);

        // 2) carrera con sus materias
        Carrera carrera = new Carrera(new Date(), listaMateria, "ING De Sistemas");
        control.crearCarrera(carrera);

        // 3) alumno con su carrera y sus materias
        Alumno alumno = new Alumno("Perea", carrera, new Date(), "Lorenna");
        alumno.setListaMaterias(listaMateria);
        control.crearAlumno(alumno);

        // resultado
        IO.println("_________Datos del alumno___________");
        IO.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        IO.println("Carrera: " + alumno.getCarrera().getNombre());
        IO.println("Materias:");

        for (Materia m : alumno.getListaMaterias()) {
            IO.println(" - " + m.getNombre());
        }

        control.cerrar();
    }
}
