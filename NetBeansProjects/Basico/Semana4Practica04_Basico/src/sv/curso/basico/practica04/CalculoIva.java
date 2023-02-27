/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica04;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */
public class CalculoIva {
    NumberFormat formato = new DecimalFormat("$ #,###.##");
    // Declaramos los atributos
    double precioArticulo;
    double porcentajeIva;
    
    
// Constructor
    public CalculoIva(double precioArticulo, double porcentajeIva){
        this.precioArticulo = precioArticulo;
        this.porcentajeIva = porcentajeIva;
    }

// Metodo para Calcular lo que se pagara en concepto de iva
    public void PrimerMetodo(double precioSinIva, double porcentajeIva) {
        double calcularIva;
        calcularIva = this.precioArticulo * this.porcentajeIva;
        System.out.println("Cobro IVA: " + formato.format(calcularIva));
    
    }
// Metodo para Calcular el precio sin iva
    public void SegundoMetodo(double precioConIva, double porcentajeIva) {
        double precio;
        precio = precioConIva - (this.precioArticulo * this.porcentajeIva);
        System.out.println("Precio con IVA: " + formato.format(precioConIva));
        System.out.println("Precio sin IVA: " + formato.format(precio));
    }
  
//Metodo Principal para invocar los otros metodos y obtener resultados
    public static void main(String[] args) {      
// Creamos el objeto articulo para acceder a los atributos de clase que es una instancia
// de la clase CalculoIva y asignamos valor a cada atributo
        CalculoIva articulo = new CalculoIva(75.0, 0.13);
// Mandamos a llamar los metodos creados para obtener resultados
        articulo.PrimerMetodo(75.0, 0.13);
// Como prueba se dió como parámetro el precio con iva para que devuelva el precio original del articulo
        articulo.SegundoMetodo(84.75, 0.13);
    }
}
