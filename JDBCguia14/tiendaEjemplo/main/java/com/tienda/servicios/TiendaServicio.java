package com.tienda.servicios;

import com.tienda.entidades.Fabricante;
import com.tienda.entidades.Producto;
import com.tienda.persistencia.FabricanteDao;

public class TiendaServicio {
    
    private FabricanteDao fabricanteDao = new FabricanteDao();

    public String[] consultarNombresProductos() {

        return null;

    }

    public Producto[] consultarProductos(){
        
        return null;
        
    }
    
    public Producto[]  consultarProductosPrecios(double precioDesde, double precioHasta){
        
        return null;
        
    }
    
    public Producto[] consultarListaPortatiles(){
        
        return null;
        
    }
    
    public Producto[] consultarNombrePrecioMasBarato(){
        
        return null;
        
    }
    
    public void  ingresarProducto(Producto nuevoProducto){
        
    }
    
    public void ingresarFabricante(Fabricante nuevoFabricante){
        
        fabricanteDao.agregar(nuevoFabricante);
        
    }
    
    public void editarProducto(Producto producto){
        
    }
    
    
}
