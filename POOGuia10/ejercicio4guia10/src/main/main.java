package main;

import Servicio.PeliculaServicio;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        ps.cargarPeliculas();
        ps.mostrar();
        ps.mostrarPeliculaMasUnaHora();
        ps.ordenarPeliculasPorDuracionMayorAMenor();
        ps.ordenarPeliculasPorDuracionMenorAMayor();
        ps.ordenarPeliculasPorDirector();
        ps.ordenarPeliculasPorTitulo();
    }

}
