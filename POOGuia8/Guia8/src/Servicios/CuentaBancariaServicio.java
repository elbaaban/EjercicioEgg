/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author toto_
 */
public class CuentaBancariaServicio {

    private Scanner leerValores = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuentas() {
        System.out.println("Ingrese los datos de su cuenta bancaria");
        System.out.print("Numero de cuenta: ");
        int numeroCuenta = leerValores.nextInt();
        System.out.print("Dni: ");
        long dniCliente = leerValores.nextLong();
        System.out.print("Ingrese saldo inicial a su cuenta: ");
        double saldoActual = leerValores.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);

    }

    public void ingresarDinero(CuentaBancaria cuenta) {

        System.out.print("Ingrese el monto que desea ingresar a su cuenta: ");
        cuenta.setSaldoActual(leerValores.nextDouble() + cuenta.getSaldoActual());

    }

    public void retirarDinero(CuentaBancaria cuenta) {

        System.out.print("Ingrese el monto que desea retirar a su cuenta: ");
        double montoRetiro = leerValores.nextDouble();

        if (montoRetiro < cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - montoRetiro);
            System.out.println("Su retiro de " + montoRetiro + " fue exitoso");
        } else {
            System.out.println("Su saldo es insuficiente, por lo que su retiro sera de " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        }

    }

    
}
