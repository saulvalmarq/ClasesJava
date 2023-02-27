/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class Metodos1Suma {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer número: ");                                             
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();
        resultado = sumar(numero1, numero2);
        System.out.println("Suma: " + resultado);
    }

    //método sumar
    public static int sumar(int a, int b){
           int c;
           c = a + b;
           return c;
    }
}
