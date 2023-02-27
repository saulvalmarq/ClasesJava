/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

/**
 *
 * @author Saúl Valencia
 */
public class Resistencia {

    public static void main(String[] args) {
        double resistencia1 = 2000.00;
        double resistencia2 = 1000.00;
        double resistenciaEquivalente = 1 / ((1 / resistencia1) + (1 / resistencia2));

        System.out.println("El valor de la Resistencia Equivalente es: " + resistenciaEquivalente + " Ohmios");
    }
}
