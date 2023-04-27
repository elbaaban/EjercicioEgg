/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class RaicesServicio {
    Scanner leer = new Scanner(System.in);


    public double getDiscriminante() {
        Raices raiz = new Raices();
        double discriminante;
        discriminante = (Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC());
        return discriminante;
    }

    public boolean tieneRaices(double discriminante) {

        if (discriminante >= 0) {
            return true;
        }
        return false;
    }

    public boolean tieneRaiz(double discriminante) {

        if (discriminante == 0) {
            return true;
        }
        return false;
    }

    public void obtenerRaices(Raices r, double discriminante, boolean tieneRaices) {
        
        if (tieneRaices) {
            System.out.println(-r.getB() + Math.sqrt(discriminante) / (2 * r.getA()));

            System.out.println(-r.getB() - Math.sqrt(discriminante) / (2 * r.getA()));

        }

    }

    public void obtenerRaiz(Raices r, double discrmininante, boolean tieneRaiz) {
        
        if (tieneRaiz) {
            System.out.println(-r.getB() / (2 * r.getA()));
        }
        
    }
    public void calcular ( Raices r , boolean tieneRaiz, boolean tieneRaices, double descriminante){
        if (tieneRaices){
            obtenerRaices (r, descriminante, tieneRaices);
        } else if (tieneRaiz){
                 obtenerRaices (r, descriminante, tieneRaices);
        }else {
            System.out.println("no tiene solucion");
        }
        
    }
        public void cargar (Raices r){
            System.out.println("ingrese a: ");
            r.setA(leer.nextDouble());
            System.out.println("ingrese b: ");
            r.setB(leer.nextDouble());
            System.out.println("ingrese C: ");
            r.setC(leer.nextDouble());
         
            
        
        }
}