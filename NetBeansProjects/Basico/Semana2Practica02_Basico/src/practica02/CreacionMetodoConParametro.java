/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author DGA
 */
public class CreacionMetodoConParametro {

    public static void main(String[] args) {
        double valor = metodoValor(5);
        System.out.println("Valor Double: " + valor);
    }
// Invocamos el metodoValor y le asignamos el valor de 5
// Dentro del metodo se le suman 10 a la variable
// El resultado es 15.0    

    public static double metodoValor(double valorDouble) {
        valorDouble = valorDouble + 10;
        return valorDouble;
    }
}
