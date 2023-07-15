/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Baraja;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();
        System.out.println("**************");
        System.out.println( " su siguente carta es: " +baraja.siguienteCarta());
        System.out.println("**************");

        
        System.out.println("**************");
        System.out.println("quedan: " +baraja.cartasDisponibles()+ " disponibles");
        System.out.println("**************");
        System.out.println("su cartas son: "+ baraja.darCartas(5));
        System.out.println("**************");
        baraja.cartasMonton();
        System.out.println("**************");
        baraja.mostrarBaraja();
    }

}
