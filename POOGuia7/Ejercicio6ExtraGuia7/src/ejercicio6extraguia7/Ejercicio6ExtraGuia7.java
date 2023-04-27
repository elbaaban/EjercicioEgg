/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6extraguia7;

import Entidad.Rectangulo;

/**
 *
 * @author Elba Aban
 */
public class Ejercicio6ExtraGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo A = new Rectangulo();
        A.setLado1(4);
        A.setLado2(6);
       
        System.out.println("el area del rectangulo es "+ A.calcular_area());
    }
    
}
