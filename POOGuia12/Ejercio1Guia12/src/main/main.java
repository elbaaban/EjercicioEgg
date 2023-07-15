
package main;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elba Aban
 */
public class main {

 
    public static void main(String[] args) {
        List<Animal>listaAnimales = new ArrayList();
        Perro perro=new Perro( "mara", "lo que ella quiera comer ", "pitbull", 10);
        perro.alimientacion();
        Gato gato=new Gato("asdasd", "sambuchito","chatran", 26);
        gato.alimientacion();
        Caballo caballo=new Caballo("omar", "hamburguesa","arquitecto", 25);
        caballo.alimientacion();
         
         
    }
    
}
