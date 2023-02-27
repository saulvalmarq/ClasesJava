/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class Arreglos {

    static int miArreglo[];

    public static void main(String[] args) {
        miArreglo = new int[5];
        Scanner lector = new Scanner(System.in);
        // Leer Datos
        for (int i = 0; i <= 4; i++) {
            System.out.println("Digitar un numero entero:");
            miArreglo[i] = lector.nextInt();
        }
        // Mostrar Datos
        for (int i = 0; i <= 4; i++) {
//            System.out.println("Valor:" +  miArreglo[i]);
            System.out.println("Valor "+ i +": " +  miArreglo[i]);
        }
    }
}
