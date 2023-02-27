/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica06;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class Prueba {
    public static void main(String[] args) {
        
    }
    public static int demanaEnter(String mensaje) {
        Scanner in = new Scanner(System.in);
        int value;
        boolean valueOk = false;
        //int minValor=0;
        do {
            System.out.println(mensaje + "\n");
            valueOk = in.hasNextInt();
            if (!valueOk) {
                in.next();
                System.out.println("Debes ingresar un entero");
            }
        } while (!valueOk);
        value = in.nextInt();
        in.nextLine();

        return value;

    }
}
