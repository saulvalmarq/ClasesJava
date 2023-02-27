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
public class MetodoVoidCadenaTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        cajaTexto(cadena); //llamada al método
    }

    // método que muestra un String rodeado por un borde 
    public static void cajaTexto(String str){
            int n = str.length(); //longitud del String
            for (int i = 1; i <= n + 4; i++){ //borde de arriba
                 System.out.print("#"); //no tiene ln, imprime todo en la misma linea
            }
            System.out.println();
            System.out.println("# " + str + " #"); //cadena con un borde en cada lado              
            for (int i = 1; i <= n + 4; i++){ //borde de abajo
                 System.out.print("#"); 
            }
            System.out.println();
    }
}
