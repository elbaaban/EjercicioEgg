/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extraguia7;

import Entidad.Puntos;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos p = new Puntos ();
        p.crearpuntos();
        System.out.println("la distancia entre los puntos es: " + p.distancia());
    }
    
}
