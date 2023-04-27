/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8extraguia7;

import Entidad.NotaMedia;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotaMedia nm = new NotaMedia();
        nm.crearLista();
        nm.calcularMedia();
        System.out.println(nm.getNMedia());

        nm.MostrarPromedioAlto();
    }

}


