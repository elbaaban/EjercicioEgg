/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Servicio.TiendaServicio;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TiendaServicio servicio = new TiendaServicio();
       servicio.introducirProducto();
       servicio.mostrarListadeProducto();
       servicio.modificarProducto();
       servicio.buscarProductoEliminar();
       servicio.mostrarListadeProducto();
    }
    
}
