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
public class CalcularIva {

    public static void main(String[] args) {
        double precioConIva = obtenerPrecioConIva(111.06);
        double precioSinIva = obtenerPrecioSinIva(125.50);
        NumberFormat formato = new DecimalFormat("#0.00");
        System.out.println("Precio con Iva :" + formato.format(precioConIva));
        System.out.println("Precio Sin Iva :" + formato.format(precioSinIva));
    }

    public static double obtenerPrecioConIva(double precioSinIva) {
        double precioConIva;
        precioConIva = precioSinIva * 1.13;
        return precioConIva;
    }
    
    public static double obtenerPrecioSinIva(double precioConIva) {
        double precioSinIva;
        precioSinIva = precioConIva / 1.13;
        return precioSinIva;
    }
}
