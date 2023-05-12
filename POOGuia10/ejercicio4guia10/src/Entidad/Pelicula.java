/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author Elba Aban
 */
public class Pelicula {

    private String titulo;
    private String director;
    private double duracion;
    public static Comparator<Pelicula> comparadorDuracionAsc = new Comparator<Pelicula>() { // comparador de pelicula
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return (int) (t.getDuracion() - t1.getDuracion());

        }
    }; //necesita el ; porque es una sentencia no un metodo

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

}
