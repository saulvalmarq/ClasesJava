/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author Saúl Valencia
 */
public class CalculadoraVid {
    public static void main(String[] args) {
        double suma = sumar(2.0, 8.0);
        double resta = restar(10, 5);
        double multiplicar = multiplicar(5, 5);
        double dividir = dividir(10, 2);
        
        System.out.println("La suma es           :" + suma);
        System.out.println("La resta es          :" + resta);
        System.out.println("La multiplicación es :" + multiplicar);
        System.out.println("La división es       :" + dividir);
    }
    
 public static double sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }        
    public static double restar(double valor1, double valor2) {
        return valor1 - valor2;
    }        
    public static double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }        
    public static double dividir(double valor1, double valor2) {
        return valor1 / valor2;   
    }     
}
