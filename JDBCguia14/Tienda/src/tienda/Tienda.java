package tienda;

import tienda.servicios.TiendaServicio;



 

public class Tienda {

    public static void main(String[] args) {
       
       TiendaServicio ts = new TiendaServicio();
        try{
        
            ts.Menu();
            
        } catch ( Exception e){
            System.out.println(e);
        }
    }
}                            
