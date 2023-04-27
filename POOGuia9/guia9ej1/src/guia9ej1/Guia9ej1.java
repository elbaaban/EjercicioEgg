/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej1;

import entidades.Cadena;
import servicios.CadenaServicio;

/**
 *
 * @author meli
 */
public class Guia9ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CadenaServicio servicio = new CadenaServicio();

        Cadena cadena = new Cadena("Chau mundo");

        servicio.mostrarVocales(cadena);

        servicio.invertirFrase(cadena);

        servicio.vecesRepetido('u', cadena);

        servicio.compararLongitud(cadena);

        servicio.unirFrases(cadena);

        servicio.reemplazar(cadena, "&");

        System.out.println(servicio.contiene(cadena, "n"));

    }

}
