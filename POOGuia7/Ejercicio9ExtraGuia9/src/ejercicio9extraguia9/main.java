/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9extraguia9;

import Entidad.Mascota;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota e = new Mascota("Pepito", "Caniche", "Perro", 5);
        System.out.println(e.cumpliranios());
    }

}
