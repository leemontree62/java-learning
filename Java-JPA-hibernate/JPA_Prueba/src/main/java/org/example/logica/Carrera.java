package org.example.logica;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

@Entity
public class Carrera {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;


    /*para un 1 a N al contrario que las bases de datos el dato que me va a asociar a las 2 tablas siempre va a estar del
    lado del "1" y no de la "N" a diferencia de bases de datos y tiene que ser por medio de una collecion/lista */
    @ManyToMany(fetch = FetchType.EAGER) //muchos a muchos
    private List<Materia> lisMaterias = new ArrayList<>();


    //cosntructores
    public Carrera() {
    }

    public Carrera(Date fechaCreacion, List<Materia> lisMaterias, String nombre) {
        this.fechaCreacion = fechaCreacion;
        this.lisMaterias = lisMaterias;
        this.nombre = nombre;
    }

    //metodos getter y setter
    public Date getfechaCreacion() {
        return fechaCreacion;
    }
    public void setfechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<Materia> getLisMaterias() {
        return lisMaterias;
    }

    public void setLisMaterias(List<Materia> lisMaterias) {
        this.lisMaterias = lisMaterias;
    }
    //otros metodos

    @Override
    public String toString() {
        return "Carrera{" +
                "fechaCreacion=" + fechaCreacion +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
