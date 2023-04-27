/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero"
//que permita retirar una cantidad de dinero del saldo de la cuenta. 
//Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirar_dinero() {
        double retiro;
        do {
            System.out.println("Ingrese la cantidad de dinero que desea retirar");
            Scanner leer = new Scanner(System.in);
            retiro = leer.nextDouble();
        } while (retiro > saldo);
        saldo -= retiro;
        System.out.println("el saldo de  " + titular + " es " + saldo);
    }
}
