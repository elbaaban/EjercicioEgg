/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Servicio.DateServicio;
import java.util.Date;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateServicio ds = new DateServicio();
        Date d = ds.fechadenacimiento();

        System.out.println("su fecha de nacimiento es: " + d.toString()); // te copia la fecha de nacimiento ordenado 
        ds.fechaactual();
        System.out.println("la fecha actual es : " + ds.fechaactual().toString());
        System.out.println("su edad es : " + ds.diferencia(d, ds.fechaactual()));
    }

}
