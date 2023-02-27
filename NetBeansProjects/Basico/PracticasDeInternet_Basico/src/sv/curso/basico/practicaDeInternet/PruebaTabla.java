/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaTabla {

    public static void main(String[] args) {
        tabla(4);
        tabla(7);
    }

    public static void tabla(int n) {
        // ejemplo de llamada
        // de tipo void
        System.out.println("Tabla de multiplicar del numero " + n);
        for (int i = 0; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + producto(n, i));        
        }
 
        return; // No devuelve ningun valor
    }

    public static int producto(int a, int b) {
        return a * b;
    }
}
