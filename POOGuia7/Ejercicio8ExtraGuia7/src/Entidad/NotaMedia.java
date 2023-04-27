/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class NotaMedia {

    private double NMedia = 0.0;
    private Estudiante[] arr = new Estudiante[3];

    public double getNMedia() {
        return NMedia;
    }

    public void crearLista() {
        Scanner leer = new Scanner(System.in);
        String nombre;
        double notaMedia;
        int edad;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            nombre = leer.next();
            System.out.println("Ingrese la edad ");
            edad = leer.nextInt();
            System.out.println("Ingrese la notaMedia");
            notaMedia = leer.nextDouble();
            arr[i] = new Estudiante(nombre, edad, notaMedia);

        }

    }

    public void calcularMedia() {

        for (int i = 0; i < arr.length; i++) {
            NMedia += arr[i].getNotaMedia();

        }
        NMedia /= arr.length;

    }

    public void MostrarPromedioAlto() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNotaMedia() >= NMedia) {
                System.out.println("El estudiante : " + arr[i].getNombre() + " supera la nota media del curso con " + arr[i].getNotaMedia());
            }

        }

    }
}
