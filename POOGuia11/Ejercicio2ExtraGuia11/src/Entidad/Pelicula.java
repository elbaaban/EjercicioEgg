/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Calendar;

/**
 *
 * @author Elba Aban
 */
public class Pelicula {

    private String titulo;
    private Calendar cal = Calendar.getInstance();
    private String director;
    private int edadMinima;
 
    public Pelicula(String titulo, String director, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.edadMinima = edadMinima;
    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(int hora, int minutos, int segundos) {
        cal.set(Calendar.HOUR_OF_DAY, hora);
        cal.set(Calendar.MINUTE, minutos);
        cal.set(Calendar.SECOND, segundos);
    }

    @Override
    public String toString() {
        return "Peliculas{" + "Titulo = " + titulo + ", Director = " + director + ", Duracion = " + cal.get(Calendar.HOUR_OF_DAY) + " : " + cal.get(Calendar.MINUTE) + " : " + cal.get(Calendar.SECOND) + '}';
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

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
   
}
