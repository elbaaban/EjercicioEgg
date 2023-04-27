/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class CafeteraServicio {
   Scanner leer = new Scanner(System.in); 
    public void llenarCafetera(Cafetera C){
        C.setCantidadActual(C.getCapacidadMaxima());
}
  
    public void vaciarCafetera(Cafetera C){
        C.setCantidadActual(0);
    }
    public void servirTaza(Cafetera C){
        String Taza;
        System.out.println("Ingerese el tamaño de la Taza");
        System.out.println("A = 100");
        System.out.println("B = 150");
        System.out.println("C = 200");
        Taza = leer.next();
        switch(Taza.toUpperCase()){
            
            case "A": if (C.getCantidadActual()>= 100){
                System.out.println("la Taza se lleno");
                C.setCantidadActual(C.getCantidadActual()-100);
                
            } else {
                System.out.println("el cafe no alcanza,la Taza se llena con "+ C.getCantidadActual());
                vaciarCafetera(C);
            }
            break;
            
            case "B": if (C.getCantidadActual()>= 150){
                System.out.println("la Taza se lleno");
                C.setCantidadActual(C.getCantidadActual()-150);
                
            } else {
                System.out.println("el cafe no alcanza,la Taza se llena con "+ C.getCantidadActual());
                vaciarCafetera(C);
            }
            break;
            
            case "C": if (C.getCantidadActual()>= 200){
                System.out.println("la Taza se lleno");
                C.setCantidadActual(C.getCantidadActual()-200);
                
            } else {
                System.out.println("el cafe no alcanza,la Taza se llena con "+ C.getCantidadActual());
                vaciarCafetera(C);
            }
                  break;  
          
            default: System.out.println("hay taza de 100 de 150 y de 200 SALAME");
            
        }
    }
    
    public void agregarCafe(Cafetera C){
     double cafe;
        System.out.println(" Cuanta cantidad de cafe quiere agregar ");
        cafe = leer.nextDouble();
        if ( C.getCantidadActual()+ cafe > C.getCapacidadMaxima()){
            System.out.println("cafetera casi llena , se va a rebalsar");
            llenarCafetera(C);
            
        }
        else {
            System.out.println("se agrego cafe");
            C.setCantidadActual(C.getCantidadActual()+cafe);
            
        }
    }
        
}
