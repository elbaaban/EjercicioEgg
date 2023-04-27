/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class CuentaBancariaServicio {
     private Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo inicial:");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, (int) dniCliente, saldoActual);
    }
    public void ingresardinero(CuentaBancaria cuenta, double cantidad){
        System.out.println("ingrese el dinero que desa depositar");
        cuenta.setsaldoActual(cuenta.getsaldoActual() + cantidad);
    }
    public void retirardinero(CuentaBancaria cuenta, double cantidad){
        System.out.println("ingrese el dinero que desa depositar");
         
        if(cantidad < cuenta.getSaldoActual()){
            cuenta.setSaldoActual(cuenta.getSaldoActual()-cantidad);
            System.out.println("Su retiro de " + cantidad + " fue exitoso");
        }else{
            System.out.println("Su saldo es insuficiente, por lo que su retiro sera de " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        }
    }
     public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Se extrajo " + (cuenta.getSaldoActual() * 0.2));
        cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    public void retirardinero(CuentaBancaria cuenta1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ingresardinero(CuentaBancaria cuenta1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
