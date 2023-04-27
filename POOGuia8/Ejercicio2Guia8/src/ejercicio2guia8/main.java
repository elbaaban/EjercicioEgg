/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2guia8;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera C = new Cafetera(1000, 0);
        cs.llenarCafetera(C);
        cs.servirTaza(C);
        cs.vaciarCafetera(C);
        cs.agregarCafe(C);
    }
}
