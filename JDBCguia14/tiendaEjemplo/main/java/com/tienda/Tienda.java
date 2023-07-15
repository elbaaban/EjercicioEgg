

package com.tienda;

import com.tienda.entidades.Fabricante;
import com.tienda.servicios.TiendaServicio;

public class Tienda {

    public static void main(String[] args) {
       
        TiendaServicio servicio = new TiendaServicio();
        
        Fabricante nuevoFabricante = new Fabricante(0, "Melina");
        
       servicio.ingresarFabricante(nuevoFabricante);
    }
}
