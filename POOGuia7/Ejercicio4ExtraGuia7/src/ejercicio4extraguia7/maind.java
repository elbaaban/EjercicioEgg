/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extraguia7;

import Entidad.Cuenta;

/**
 *
 * @author Elba Aban
 */
public class maind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuentita = new Cuenta ();
        cuentita.setSaldo(1000);
        cuentita.setTitular("Pepito");
        cuentita.retirar_dinero();
    }
    
}
