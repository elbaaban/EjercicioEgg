/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class ejercicio3 {
// Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
    public static void main(String[] args) {
    System.out.println("Tamaño del vector");
    Scanner leer = new Scanner(System.in);
        int N = leer.nextInt();
     
        int[] vector = new int[N];
        
        for (int i = 0; i < N; i++) {
            do{
                System.out.println("Ingrese el numero "+(i+1)+" de "+N);
                vector[i] = leer.nextInt();
            }while(vector[i]>99999);            
        }
        
        int uni=0, dec=0, cen=0, mil=0, diezmil=0, cont, aux ;
        for (int i = 0; i < N; i++) {
            cont=0;
            aux=vector[i];
            do{
                aux=aux/10;
                cont++;
            }while(aux>=1);
            
            switch(cont){
                case 1: uni++; break;
                case 2: dec++; break;
                case 3: cen++; break;
                case 4: mil++; break;
                case 5: diezmil++; break;
                
            }
        }
        
        
        System.out.println("Cant. de numeros de 1 unidad: "+uni);
        System.out.println("Cant. de numeros de 2 unidad: "+dec);
        System.out.println("Cant. de numeros de 3 unidad: "+cen);
        System.out.println("Cant. de numeros de 4 unidad: "+mil);
        System.out.println("Cant. de numeros de 5 unidad: "+diezmil);
        
     
    }
    }
   
