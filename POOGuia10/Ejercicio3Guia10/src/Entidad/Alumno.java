/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Elba Aban
 */
public class Alumno {

    private String nombre;
    int nota1, nota2, nota3;

    public Alumno() {
    }

    public Alumno(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

}
//    private String Nombre;
//    private ArrayList<Integer> Notas;
//
//    public Alumno() {
//    }
//
//    public String getNombre() {
//        return Nombre;
//    }
//
//    public void setNombre(String Nombre) {
//        this.Nombre = Nombre;
//    }
//
//    public ArrayList<Integer> getNotas() {
//        return Notas;
//    }
//
//    public void setNotas(ArrayList<Integer> Notas) {
//        this.Notas = Notas;
//    }
//
//    public Alumno(String Nombre, ArrayList<Integer> Notas) {
//        this.Nombre = Nombre;
//        this.Notas = Notas;
//    }


