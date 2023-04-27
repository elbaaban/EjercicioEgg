/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidad.Pardenumeros;
import Servicio.PardenumerosServicio;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PardenumerosServicio ps = new PardenumerosServicio();
        Pardenumeros pdn = new Pardenumeros();
        ps.mostrarValores(pdn);
        ps.devolverMayor(pdn);
        ps.calcularPotencia(pdn);

        ps.calcularRaiz(pdn);

    }
}
