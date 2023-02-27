/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class Codigo1Prac1 {
    public static int elegirNumero() throws InputMismatchException{
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número entero");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        int x;
        try {
            x = elegirNumero();
        System.out.println("Has elegido " + x); 
        } catch (InputMismatchException e1) {
            System.out.println("Dato Introducido no es Entero"); 
        } catch (Exception e2) {
            System.out.println("Error General de Ingreso de Datos");
        }
       
    }
}
