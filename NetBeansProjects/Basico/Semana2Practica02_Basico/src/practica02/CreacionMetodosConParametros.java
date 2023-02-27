/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author Saúl Valencia
 */
public class CreacionMetodosConParametros {
// Generando la clase principal

    public static void main(String[] args) {
// Invocando el metodo metodoConVoid y asignando valores
// Dejando una linea punteada impresa de por medio
// Declarando una variable tipo double y asignando el resultado del metodo 
// metodoConDouble con valor de 10.0 
// Dejando una segunda linea punteada impresa de por medio
// Declarando una variable tipo String y asignando el resultado del metodo 
// metodoConString con contenido asignado "Jose" 

        metodoConVoid(1, 10.0, "Jose");
        System.out.println("---------------------");
        double valorDouble = metodoConDouble(10.0);
        System.out.println("---------------------");
        String valorString = metodoConString("Jose");
    }
// Toma los valores asignados y los imprime

    public static void metodoConVoid(int valorInt, double valorDouble, String valorString) {
        System.out.println("Ejecución con Void");
        System.out.println("Valor Int      : " + valorInt);
        System.out.println("Valor Double   : " + valorDouble);
        System.out.println("Valor String   : " + valorString);
    }
// Toma los valores asignados y los imprime

    public static double metodoConDouble(double valorDouble) {
        System.out.println("Ejecución con Double");
        System.out.println("Valor Double   : " + valorDouble);
        return valorDouble;
    }
// Toma los valores asignados y los imprime

    public static String metodoConString(String valorString) {
        System.out.println("Ejecución con String : " + valorString);
        System.out.println("Valor String   : " + valorString);
        return valorString;
    }
}
