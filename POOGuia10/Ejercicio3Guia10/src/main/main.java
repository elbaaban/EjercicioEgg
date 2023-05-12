/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Alumno;
import Serivio.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> Alumno = new ArrayList();
        AlumnoServicio as = new AlumnoServicio();

        as.crearAlumnos();
        as.notaFinal();
    }
}
