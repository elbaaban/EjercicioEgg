/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entinda.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class TiendaServicio {

    Tienda tienda = new Tienda();
    HashMap<String, Double> listaProducto = new HashMap();
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void introducirProducto() {
        String respuesta;
        do {
            System.out.println("ingrese el nombre del producto");
            String producto = leer.next();
            System.out.println("ingrese el precio del producto");
            double precio = leer.nextDouble();
            listaProducto.put(producto, precio);
            System.out.println("desea ingresar mas productos? S/N");

            respuesta = leer.next();

            leer.nextLine(); //para el espacio cuando pones el nombre del director y antes el de la pelicula

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void mostrarListadeProducto() {
        for (Map.Entry<String, Double> entry : listaProducto.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(" el nombre del producto es: " + entry.getKey() + " el precio es: " + entry.getValue());
        }
    }

    public void buscarProductoEliminar() {
        System.out.println("que producto desea eliminar");
        String buscar = leer.next();
        listaProducto.remove(buscar);
         
    }
    public void modificarProducto() {
        System.out.println("que producto desea modificar?");
        String modificarproducto = leer.next();
        if (listaProducto.containsKey(modificarproducto)) {
            System.out.println("ingrese nuevo valor");
            double nuevoPrecio = leer.nextInt();
            listaProducto.replace(modificarproducto, nuevoPrecio);
        }
        for (Map.Entry<String, Double> entry : listaProducto.entrySet()) {

            System.out.println(" el nombre del producto es: " + entry.getKey() + " el nuevo precio es: " + entry.getValue());
        }
    }
}
