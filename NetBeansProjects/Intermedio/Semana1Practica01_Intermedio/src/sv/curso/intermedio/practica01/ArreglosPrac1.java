/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica01;

/**
 *
 * @author Saúl Valencia
 */
public class ArreglosPrac1 {

    public static void main(String[] args) {
        String[] nombres = new String[4];
        nombres[0] = "JOSE";
        nombres[1] = "LUIS";
        nombres[2] = "PEREZ";
        nombres[3] = "GOMEZ";

        try {
            System.out.println("Nombre: " + nombres[0]);
            System.out.println("Nombre: " + nombres[1]);
            System.out.println("Nombre: " + nombres[2]);
            System.out.println("Nombre: " + nombres[3]);

            System.out.println("Nombre: " + nombres[5]);

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Arreglo Fuera de Rango");
        }
    }
}
