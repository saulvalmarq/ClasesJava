/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea07;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class CincoNumeros {
        public static void main(String[] args) {
            Scanner dato = new Scanner(System.in);
            int a;
            int contador = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.println("Ingrese el " + j + " numero");
                a = dato.nextInt();
                contador = contador + a;
            }
            System.out.println("La suma de los numeros es ; " + contador);
        }
    }
