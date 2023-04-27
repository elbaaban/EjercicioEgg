/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraextramain;

import Entidad.Coche;

/**
 *
 * @author Elba Aban
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche renault = new Coche("Renault", "12", 700000);
        Coche honda = new Coche("Honda", "Civic", 1200000);
        Coche toyota = new Coche("Toyota", "Etios", 1800000);
        
        System.out.println("Coche 1: Marca " + renault.getMarca() + ". Modelo " + renault.getModelo() + " Precio $" + renault.getPrecio());
        System.out.println("Coche 2: Marca " + honda.getMarca() + ". Modelo " + honda.getModelo() + " Precio $" + honda.getPrecio());
        System.out.println("Coche 3: Marca " + toyota.getMarca() + ". Modelo " + toyota.getModelo() + " Precio $" + toyota.getPrecio());
    }
    }
    

