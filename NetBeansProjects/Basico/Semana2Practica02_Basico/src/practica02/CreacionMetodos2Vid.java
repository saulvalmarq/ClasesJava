/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author Saúl Valencia
 */
public class CreacionMetodos2Vid {

    
    
    public static void main(String[] args) {
        metodo1();
        double v2 = metodo2(2.0, 8.0);
        System.out.println("V2 vale:" + v2);
        String v3 = metodo3("Juan ", "Perez");
        System.out.println("V3 vale:" + v3);
        int v4 = metodo4(5,8);
        System.out.println("V4 vale:" + v4);
    }

    public static void metodo1() {
        System.out.println("Método1");
    }

    public static double metodo2(double valor1, double valor2) {
        System.out.println("Método2");
        return valor1 + valor2;
    }

    public static String metodo3(String valor1, String valor2) {
        System.out.println("Método3");
        return valor1 + valor2;
    } 
    public static int metodo4(int valor1, int valor2) {
        System.out.println("Método4");
        return valor1 + valor2;
    } 
}
