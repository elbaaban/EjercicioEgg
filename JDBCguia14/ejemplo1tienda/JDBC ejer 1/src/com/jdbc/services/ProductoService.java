/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.services;

import com.jdbc.entidades.Producto;
import com.jdbc.persistencia.ProductoDAO;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ProductoService {
    Scanner leer = new Scanner(System.in);
     
    public ProductoService() {
    }
public void mostrarproducto () throws Exception{
   ProductoDAO pd = new ProductoDAO();
   Producto p = null ;
    pd.mostrarproducto(p);
    
}
   public void listaDeProducto() throws Exception{
   ProductoDAO pd = new ProductoDAO();
        String s = "*";

      pd.nombreyprecio(s);
       
           
   }
   public void  precio () throws Exception{
       ProductoDAO pd = new ProductoDAO();
       pd.PrecioEntre();
   }
  public void portatil() throws Exception{
        ProductoDAO pd = new ProductoDAO();
        pd.portatil();
  }  
  public void productoBarato() throws Exception{
         ProductoDAO pd = new ProductoDAO();  
         pd.nypDeProductoMasBarato();
  }
  public void guardarProducto(Producto p) throws Exception{
     
       ProductoDAO pd = new ProductoDAO();  
      pd.guardarProducto(p);
  }
}
