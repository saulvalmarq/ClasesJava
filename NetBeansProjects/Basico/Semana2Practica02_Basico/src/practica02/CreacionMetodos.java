/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author Saúl Valencia
 */
public class CreacionMetodos {

    public static void main(String[] args) {
        metodoConVoid();
        metodoConint();
        metodoConDouble();
        metodoConString();
    }

    public static void metodoConVoid() {
        System.out.println("Ejecución con Void");
    }

    public static int metodoConint() {
        System.out.println("Ejecución con Int");
        return 0;
    }

    public static double metodoConDouble() {
        System.out.println("Ejecución con Double");
        return 0.0;
    }

    public static String metodoConString() {
        System.out.println("Ejecución con String");
        return "";
    }
}
