/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serivio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> listaAlumnos = new ArrayList<>();

    public void crearAlumnos() {
        Alumno a1 = new Alumno("Juan", 9, 7, 8);
        Alumno a2 = new Alumno("Pedro", 6, 3, 9);
        Alumno a3 = new Alumno("Diego", 10, 7, 9);
        listaAlumnos.add(a1);
        listaAlumnos.add(a2);
        listaAlumnos.add(a3);
        System.out.println("Mostrar alumnos");
        for (Alumno estudiantes : listaAlumnos) {
            System.out.println(" El nombre del alumno es: " + estudiantes.getNombre() + " su nota 1 es: " + estudiantes.getNota1() + " su nota 2 es: " + estudiantes.getNota2() + " su nota 3 es: " + estudiantes.getNota3());
        }
        System.out.println("Cantidad de alumnos: " + listaAlumnos.size());
        System.out.println(listaAlumnos.isEmpty());
    }

    public void notaFinal() {
        System.out.println("Ingrese el alumno a buscar: ");
        String name = leer.next();
        Alumno select = null;
        for (Alumno estudiante : listaAlumnos) {
            if (estudiante.getNombre().equalsIgnoreCase(name)) {
                select = estudiante;
                break;
            }
        }
        if (select == null) {
            System.out.println("No esta en la lista ");
            return;
        }
        int sumaNota = select.getNota1() + select.getNota2() + select.getNota3();
        double promedio = sumaNota / 3;
        System.out.println("El promedio de " + name + " es " + promedio);
    }
}

//    Scanner leer = new Scanner(System.in);
//
//    public Alumno crearAlu() {
//        ArrayList<Integer> Notas = new ArrayList();
//
//        String nombre;
//
//        System.out.println("Ingrese el nombre del alumno");
//        nombre = leer.next();
//        System.out.println("Ingrese la nota 1 del alumno");
//        Notas.add(leer.nextInt());
//        System.out.println("Ingrese la nota 2 del alumno");
//        Notas.add(leer.nextInt());
//        System.out.println("Ingrese la nota 3 del alumno");
//        Notas.add(leer.nextInt());
//
//        return new Alumno(nombre, Notas);
//    }
//
//    public ArrayList<Alumno> ListaAlumno() {
//        ArrayList<Alumno> alu = new ArrayList();
//        String respuesta;
//        do {
//            Alumno name = crearAlu();
//            alu.add(name);
//            System.out.println("desea seguir ingresando alumnos S/N");
//            respuesta = leer.next();
//
//        } while (respuesta.equalsIgnoreCase("S"));
//
//        return alu;
//    }
//
//    public double promedio(Alumno alunota) {
//        int suma = 0;
//        int cont = 0;
//        for (Integer n : alunota.getNotas()) {
//            suma += n;
//            cont++;
//        }
//        return suma / cont;
//    }
//
//    public void notaFinal(ArrayList<Alumno> A) {
//
//        System.out.println("ingrese el nombre del alumno a promediar ");
//        String nombreB = leer.next();
//        double prom = 0;
//        for (int i = 0; i < A.size(); i++) {
//            Alumno aux = A.get(i);
//            if (nombreB.equalsIgnoreCase(aux.getNombre())) {
//                prom = promedio(aux);
//
//            }
//
//        }
//        System.out.println("el promedio de  " + nombreB + " " + prom);
//    }

