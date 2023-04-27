/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosNif;

import entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class NifServicios {
    
  public Nif crearNif(){
      Scanner leer = new Scanner(System.in);
      Scanner leer = new Scanner(System.in);
      System.out.println("ingrese su numero de Dni");
      long dni = leer.nextLong();
      while (!(String.valueOf(dni).length() == 8 || String.valueOf(dni).length() == 7)) {
          System.out.print("Dni ingresado incorrecto. \n"
                    + "Intente nuevamente: ");
            dni = leer.nextLong();
      }
      char [] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E' };
      
      char letraNif = letra [(int)dni % 23 ];
              
     return new Nif(dni, letraNif);
      
  }

  public void Mostrar(Nif valor){
      System.out.println(valor.getDni()+"-"+valor.getLetra()); 
  
}

}

