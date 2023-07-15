/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
     * Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
     * televisores, con valores ya asignados. Luego, recorrer este array y
     * ejecutar el método precioFinal() en cada electrodoméstico. Se deberá
     * también mostrar el precio de cada tipo de objeto, es decir, el precio de
     * todos los televisores y el de las lavadoras. Una vez hecho eso, también
     * deberemos mostrar, la suma del precio de todos los Electrodomésticos. Por
     * ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de
     * 5000, el resultado final será de 7000 (2000+5000) para electrodomésticos,
     * 2000 para lavadora y 5000 para televisor.
     */
    public static void main(String[] args) {

//        Lavadora lavadora = new Lavadora();
//        Televisor tv = new Televisor();
//        lavadora.crearLavadora();
//        System.out.println("el precio del lavador es: " + lavadora.precioFinal());
//
//        tv.crearTelevisor();
//        System.out.println("el precio del televisor: " + tv.precioFinal());
        ArrayList<Electrodomestico> electrodomestico = new ArrayList();
        electrodomestico.add(new Lavadora(9000, "azul", 'f', 80));
        electrodomestico.add(new Lavadora(19000, "gris", 'a', 60));
        electrodomestico.add(new Televisor(90000, "rojo", 'a', 60, 50, true));
        electrodomestico.add(new Televisor(100000, "blanco", 'b', 30, 60, true));
        double precioTodosTV = 0, precioTodosLavatora = 0, precioTodos = 0;

        for (Electrodomestico aux : electrodomestico) { //aux es todos los electrodomesticos
            double preciofinal = aux.precioFinal();
            precioTodos += preciofinal;
            if (aux instanceof Lavadora) {
                precioTodosLavatora += preciofinal; //guarda precio de solo las lavadoras

            } else if (aux instanceof Televisor) {
                precioTodosTV += preciofinal;

            }

        }
        System.out.println("el precio de todas las lavadoras son: " + precioTodosLavatora);
        System.out.println("el precio de todas las televisores son: " + precioTodosTV);
        System.out.println("El precio final de los electrodomesticos son; " + precioTodos);
    }
}
