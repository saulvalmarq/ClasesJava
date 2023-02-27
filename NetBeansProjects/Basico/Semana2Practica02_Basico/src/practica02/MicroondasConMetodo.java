/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 *
 * @author Saúl Valencia
 */
public class MicroondasConMetodo {
    public static void main(String[] args) {        
        double precioConIva = calcularIva(75.00, 1.13);
        NumberFormat formato = new DecimalFormat("#0.00");
        System.out.println("Calculo de Productos con Impuestos");
        System.out.println("El Precio con Iva del Horno Microondas es : $ " + formato.format(precioConIva));
    }
    
    public static double calcularIva(double precioSinIva, double ivamodificado){
        double precioConIva;
        precioConIva = precioSinIva * ivamodificado;
        return precioConIva;
    }

}
