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
public class DivisionPrac1_2 {

    public static void main(String[] args) {
//        try { // Con este try al intentar ingresar datos erroneos se captura el error
            Scanner lector = new Scanner(System.in);
            
            System.out.println("Digite el Valor 1:");
            int valor1 = lector.nextInt();
            System.out.println("Digite el Valor 2:");
            int valor2 = lector.nextInt();

        try {
            int resultado = metodo1(valor1,valor2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error al Dividir");
        }
    }
    public static int metodo1(int valor1, int valor2) throws Exception{
         int resultado = metodo2(valor1,valor2);
         System.out.println("Trato Error Método1");
        return resultado;
    }
    public static int metodo2(int valor1, int valor2) throws Exception{
         int resultado = valor1/valor2;
         System.out.println("Trato Error Método2");
         return resultado;
    }
}
