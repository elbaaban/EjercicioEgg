/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Servicio.ArregloServicio;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArregloServicio as = new ArregloServicio();
        double[] A = new double[50];
        double[] B = new double[20];
        as.inicializarA(A);
        as.Mostrar(A);
       
        as.ordenar(A);
        System.out.println("***********************************");
        as.inicializarB(A,B);
    
    }
    
}
