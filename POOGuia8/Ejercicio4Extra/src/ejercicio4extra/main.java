/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extra;

import Entidad.Raices;
import Servicio.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       RaicesServicio rs = new RaicesServicio ();
       Raices raiz1 = new Raices();
       
       rs.cargar(raiz1);
       rs.calcular(raiz1,rs.tieneRaices(rs.getDiscriminante()), rs.tieneRaiz(rs.getDiscriminante()), rs.getDiscriminante());
       
    }
    
}
