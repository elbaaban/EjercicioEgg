/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Elba Aban
 */
public class DateServicio {

    Scanner leer = new Scanner(System.in);

    public Date fechadenacimiento() {
        System.out.println("ingrese el dia ");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("ingrese el año");
        int anio = leer.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }

    public Date fechaactual() {
        return new Date();
    }

    public int diferencia(Date fechadenacimiento, Date fechaactual) {
        int edad = fechaactual.getYear() - fechadenacimiento.getYear();
        if (fechaactual.getMonth() < fechadenacimiento.getMonth()) {
            return edad - 1;
        } else {
            return edad;
        }

    }
}
