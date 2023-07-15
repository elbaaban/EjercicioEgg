/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.List;

/**
 *
 * @author Elba Aban
 */
public class Persona {
    private Perro perro;
    private String nombre, apellido, Perro;
    private long documento;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String Perro, long documento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Perro = Perro;
        this.documento = documento;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPerro() {
        return Perro;
    }

    public void setPerro(String Perro) {
        this.Perro = Perro;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
}
