/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto
 * de Jugadores) y Revolver Métodos: 
 * • llenarJuego(ArrayList<Jugador>jugadores,
 * Revolver r): este método recibe los jugadores y el revolver para guardarlos
 * en los atributos del juego.
 *
 *
 * • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de
 * agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y
 * se termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno
 * se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe
 * mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto,
 * usando los atributos de la clase Juego.
 *
 *
 */
public class Juego {

    private RevolverDeAgua r;
    private ArrayList<Jugador> jugadores;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        this.jugadores = jugadores;
        this.r = r;

    }

 public void ronda(){
     
     for (int i = 0; i < jugadores.size(); i++) {
         System.out.println("Jugador " +(i+1));      
         presioneEnter();    
       jugadores.get(i).disparo(r);
         if (jugadores.get(i).isMojado()){
             
             System.out.println("El jugador " + (i+1) + " se mojo y por suerte es agua y no la ruleta rusa");
            
             break;
                         
         }
         
         System.out.println("Safaste, seguis seco");
     }
     
 } 
  public void presioneEnter(){
      Scanner leer = new Scanner(System.in);
      System.out.println("Presion Enter para disparar");
      leer.nextLine();
}
}  

