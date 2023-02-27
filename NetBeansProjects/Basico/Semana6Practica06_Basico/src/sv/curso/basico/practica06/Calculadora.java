/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica06;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class Calculadora {

// Metodo Principal  
    public static void main(String[] args) {
        System.out.println("Calculadora Básica: suma, resta, multiplicación y división \n");
        System.out.println("Ingrese solo Números Enteros");
        JOptionPane.showMessageDialog(null, "Calculadora Básica: suma, resta, multiplicación y división");
        JOptionPane.showMessageDialog(null, "Ingrese solo Números Enteros");
        Calculos();

    }
// Metodo para Decisiones y Calculos

    public static void Calculos() {
// Entrada de Datos por Teclado
        String valor1 = JOptionPane.showInputDialog(null, "Ingrese el Primer Valor:");
        int primerValor = Integer.parseInt(valor1);

        String dato = JOptionPane.showInputDialog(null, "Ingrese Inicial de Operación Aritmética (S,R,M,D) a Realizar:");
        String valor2 = JOptionPane.showInputDialog(null, "Ingrese el Segundo Valor:");
        int segundoValor = Integer.parseInt(valor2);

        dato = dato.toUpperCase();
        int suma = primerValor + segundoValor;
        int resta = primerValor - segundoValor;
        int multiplicacion = primerValor * segundoValor;
        double division = (double) primerValor / segundoValor;
// Uso de Switch como fue solicitado en la Tarea        
        switch (dato) {
            case "S":
                System.out.println("La Suma es: " + suma);
                JOptionPane.showMessageDialog(null, "La Suma es: " + suma);
                break;
            case "R":
                System.out.println("La Resta es : " + resta);
                JOptionPane.showMessageDialog(null, "La Resta es : " + resta);
                break;
            case "M":
                System.out.println("La Multiplicación es : " + multiplicacion);
                JOptionPane.showMessageDialog(null, "La Multiplicación es : " + multiplicacion);
                break;
            case "D":
                System.out.println("La División es : " + division);
                JOptionPane.showMessageDialog(null, "La División es : " + division);
                break;
            default:
                System.out.println("Operación Aritmética Incorrecta...");
                System.out.println("Ingrese S, R, M, D");
                JOptionPane.showMessageDialog(null, "Operación Aritmética Incorrecta...");
        }

    }
}
