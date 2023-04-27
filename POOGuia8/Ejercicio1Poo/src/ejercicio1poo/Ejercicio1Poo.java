/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;

/**
 *
 * @author Elba Aban
 */
public class Ejercicio1Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaBancariaServicio cuenta = new CuentaBancariaServicio ();
       CuentaBancaria cuenta1 = cuenta.crearCuenta();
        
        System.out.println(cuenta1.toString());
        
        cuenta.ingresardinero(cuenta1);
        
        System.out.println(cuenta1.toString());
        
        cuenta.retirardinero(cuenta1);
        System.out.println("=================");
        System.out.println(cuenta1.toString());
        System.out.println();
        cuenta.extraccionRapida(cuenta1);
        System.out.println("*****************");
        System.out.println(cuenta1.toString());
        
        cuenta.consultarSaldo(cuenta1);
        System.out.println(cuenta1.toString());        
        cuenta.consultarDatos(cuenta1);
        System.out.println(cuenta1.toString());
        
    }
    }
    

