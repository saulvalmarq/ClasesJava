/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaFactorialR {

    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            System.out.println("Factorial de " + i + " = " + factorialR(i));
        }
    }


public static long factorialR(int n) {
        if (n==0)
            return 1;
        else
            return (n * factorialR(n-1));
    }

}