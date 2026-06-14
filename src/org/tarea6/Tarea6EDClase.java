/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tarea6;
/**
 *
 * @author q5024
 */
public class Tarea6EDClase {
      public void aplicarDescuento(double precioProducto, int numProductos){     
          double total;
        precioProducto = bajarPrecio(numProductos, precioProducto);
          if (numProductos != 0) {
              total = precioProducto * 0.8;
              System.out.println("El total a pagar es:" + total);
              System.out.println("Enviado");
          } else {
              total = precioProducto * 0.95;
              System.out.println("El total a pagar es:" + total);
              System.out.println("Enviado");
        }   

    }

    private double bajarPrecio(int numProductos, double precioProducto) {
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        return precioProducto;
    }
}
