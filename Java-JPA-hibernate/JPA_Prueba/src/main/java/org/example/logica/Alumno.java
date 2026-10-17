package org.example.logica;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity//un tipo de Anotattion que hace que esta clase se convierta en una entidad/tabla en nuestra DB
public class Alumno {

    //atributos
    @Id //con esta notattion marcamos cuál va a hacer nuestra PK de esta entidad/clase en la DB
    @GeneratedValue(strategy = GenerationType.IDENTITY)//esta notation lo que hace es generarme el valor de nuestra PK de manera automática y de forma secuencial
    private int id;

    @Basic//una notation para los campos que no tienen nada en particular no obligatorio JPA sabe
    private String nombre;
    private String apellido;

    @Temporal(TemporalType.DATE)
    private Date fechaNaci;

    @ManyToOne//hacemos la relacion 1 a 1
    private Carrera carrera;

    @ManyToMany(fetch = FetchType.EAGER)//muchos a muchos
    private List<Materia> listaMaterias = new ArrayList<>();

    //contructores
    public Alumno() {
    }

    public Alumno(String apellido, Carrera carrera, Date fechaNaci, String nombre) {
        this.apellido = apellido;
        this.carrera = carrera;
        this.fechaNaci = fechaNaci;
        this.nombre = nombre;
    }

    //metodos getter
    public String getApellido() {
        return apellido;
    }
    public Date getFechaNaci() {
        return fechaNaci;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public Carrera getCarrera() {
        return carrera;
    }

    //metodos setter
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFechaNaci(Date fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    //otros metodos


    @Override
    public String toString() {
        return "Alumno{" +
                "apellido='" + apellido + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNaci=" + fechaNaci +
                ", carrera=" + carrera +
                '}';
    }

}
