/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dninif;

import entidades.Nif;
import serviciosNif.NifServicios;

/**
 *
 * @author Matias
 */
public class DniNif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NifServicios NIF = new NifServicios();
        Nif codigo = NIF.crearNif();
        NIF.Mostrar(codigo);
        
        
        
    }
    
}
