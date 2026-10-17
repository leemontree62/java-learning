package org.example.logica;

import jakarta.persistence.*;

import java.util.LinkedList;

@Entity
public class Materia {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    private  String nombre;
    private String tipo;


    //constructores
    public Materia() {

    }

    public Materia( String nombre, String tipo) {

        this.nombre = nombre;
        this.tipo = tipo;
    }

    //metodos getter y setter


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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //otros metodos
    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
