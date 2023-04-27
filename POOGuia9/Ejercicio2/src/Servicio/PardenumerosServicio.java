/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pardenumeros;
import java.util.Arrays;

/**
 *
 * @author Elba Aban
 */
public class PardenumerosServicio {

    public void mostrarValores(Pardenumeros pdn) {
        System.out.println("el numero 1 : " + pdn.getNumero1());
        System.out.println("el numero 2 : " + pdn.getNumero2());
    }

    public double devolverMayor(Pardenumeros pdn) {
        if (pdn.getNumero1() > pdn.getNumero2()) {
            System.out.println("el numero mayor es: " + pdn.getNumero1());
            return pdn.getNumero1();

        } else {
            System.out.println("el numero mayor es: " + pdn.getNumero2());
            return pdn.getNumero2();

        }

    }

    public void calcularPotencia(Pardenumeros pdn) {
        double mayor = Math.round(pdn.getNumero1());
        double menor = Math.round(pdn.getNumero2());
        double resultado;
        if (pdn.getNumero1() > pdn.getNumero2()) {
            resultado = Math.pow(mayor, menor);

        } else {
            resultado = Math.pow(menor, menor);
        }
        System.out.println("el resultado de la potencia es: " + resultado);
    }
    public void calcularRaiz (Pardenumeros pdn){
        double absoluto;
         if (pdn.getNumero1() > pdn.getNumero2()){
             absoluto = Math.abs(pdn.getNumero2());
             
         }else {
              absoluto = Math.abs(pdn.getNumero1());
         }
         System.out.println("la raiz es : " + Math.sqrt(absoluto));
    }
}
