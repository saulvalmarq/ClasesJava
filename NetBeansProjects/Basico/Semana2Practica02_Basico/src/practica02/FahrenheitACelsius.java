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
public class FahrenheitACelsius {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        double valorFarehnheit = 90.0;
        double valorCelsius = convertirACelsius(valorFarehnheit);

        System.out.println("Convirtiendo Grados Farehnheit a Grados Celsius");
        System.out.println("Para : " + valorFarehnheit + " Grados Farehnheit");
        System.out.println("Los Grados Celsius Equivalentes son: " + formato.format(valorCelsius));
           
                
    }
    public static double convertirACelsius(double valorFarehnheit){
        double valorCelsius;
        valorCelsius = ((valorFarehnheit - 32) * 5)/9;
        return valorCelsius;
    }
}
