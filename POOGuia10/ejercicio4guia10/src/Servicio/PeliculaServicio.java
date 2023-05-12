/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class PeliculaServicio {

    private ArrayList<Pelicula> peliculas = new ArrayList(); //inicializar  la lista para cargar las peliculas

    public void cargarPeliculas() {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("ingrese el titulo");
            String titulo = leer.nextLine();
            System.out.println("ingrese el nombre del director");
            String director = leer.nextLine();
            System.out.println("ingrese la duracion");
            double duracion = leer.nextDouble();
            Pelicula nuevaPelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(nuevaPelicula);
            System.out.println("desea seguir ingresando alumnos S/N");
            respuesta = leer.next();
            leer.nextLine(); //para el espacio cuando pones el nombre del director y antes el de la pelicula

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrar() {
        for (Pelicula pelicula : peliculas) {
           System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println();
        }
    }

    public void mostrarPeliculaMasUnaHora() {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1.0) {
                 System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duración: " + pelicula.getDuracion() + " horas");
                System.out.println();
            }
        }
    }

     public void ordenarPeliculasPorDuracionMayorAMenor() {
        peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion).reversed());
// Comparator para definir el criterio de ordenamiento de las películas. Comparator.comparingDouble se utiliza 
//para ordenar por la duración, Comparator.comparing se utiliza para ordenar por el título o el director.
//Además, utilizamos el método reversed() para obtener el orden inverso (de mayor a menor duración).
 //sort Este método se utiliza para ordenar los elementos de la lista en función de un criterio específico.
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        mostrar();
    }

    public void ordenarPeliculasPorDuracionMenorAMayor() {
        peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion));
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        mostrar();
    }

    public void ordenarPeliculasPorTitulo() {
        peliculas.sort(Comparator.comparing(Pelicula::getTitulo));
        System.out.println("Películas ordenadas por título:");
        mostrar();
    }

    public void ordenarPeliculasPorDirector() {
        peliculas.sort(Comparator.comparing(Pelicula::getDirector));
        System.out.println("Películas ordenadas por director:");
        mostrar();
    }


}
