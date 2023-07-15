/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Enitdades.Circulo;
import Enitdades.Rectangulo;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(5, 4);
        System.out.println("el area del circulo;  " + circulo.calcularArea());
        System.out.println("el perimetro del circulo es : " + circulo.calcularPerimetro());
        System.out.println("el area del rectangulo;  " + rectangulo.calcularArea());
        System.out.println("el perimetro del rectangulo es : " + rectangulo.calcularPerimetro());
    }

}
