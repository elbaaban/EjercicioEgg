/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Elba Aban
 */
public class ArrayEjemplo {
     private int[] array;
    
    public ArrayEjemplo(int size) {
        array = new int[size];
    }
    
    public void accesoArray(int indice) {
        try {
            int elemento = array[indice];
            System.out.println("Elemento en el índice " + indice + ": " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice del array fuera de rango.");
        }
}
}