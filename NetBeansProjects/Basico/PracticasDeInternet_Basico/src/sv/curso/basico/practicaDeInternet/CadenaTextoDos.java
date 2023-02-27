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
public class CadenaTextoDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        cajaTexto1(cadena); //llamada al método1
        cajaTexto2(cadena); //llamada al método2
        cajaTexto1(cadena); //llamada al método3
        System.out.println();
    }

    // método que muestra un String rodeado por un borde 
    public static void cajaTexto1(String str){
            int n = str.length(); //longitud del String
            for (int i = 1; i <= n + 4; i++){ //borde de arriba
                 System.out.print("#"); //no tiene ln, imprime todo en la misma linea
            }
    }
    public static void cajaTexto2(String str){
            System.out.println();
            System.out.println("# " + str + " #"); //cadena con un borde en cada lado              
            }
            
    }

