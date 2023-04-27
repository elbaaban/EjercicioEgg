/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author toto_
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaServicio cuentaServ = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta1 = cuentaServ.crearCuentas();
        
        System.out.println(cuenta1.toString());
        
        cuentaServ.ingresarDinero(cuenta1);
        
        System.out.println(cuenta1.toString());
        
        cuentaServ.retirarDinero(cuenta1);
        System.out.println("=================");
        System.out.println(cuenta1.toString());
        
    }
    
}
