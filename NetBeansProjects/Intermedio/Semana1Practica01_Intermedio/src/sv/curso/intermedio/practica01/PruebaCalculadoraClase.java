/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica01;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaCalculadoraClase {

    public static void main(String[] args) {
        int valor1, valor2, div=0;
        valor1 = 10;
        valor2 = 0;
        //java.lang.ArithmeticException
        try {
            div = CalculadoraClase.division(valor1, valor2);
        } catch (ArithmeticException ex1) {
            System.out.println("No se puede dividir por cero...");
        } catch (Exception ex2) {
            System.out.println("Se ha producido un error...");
        }
        System.out.println("Division: " + div);
    }
}
