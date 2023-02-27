/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica01;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class LeerNumeroPrac1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite un Número");
        try {
            int numero = lector.nextInt();
            System.out.println("El numero es: " + numero);
        } catch (Exception e) {
            System.out.println("Error al leer el numero");  
        }
        
        
    }
}
