/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

/**
 *
 * @author Saúl Valencia
 */
public class Operacion {
    public static int sumar(int x1, int x2) {
        int s = x1 + x2;
        return s;
    }

    public static int restar(int x1, int x2) {
        int r = x1 - x2;
        return r;
    }

    public static void main(String [] ar) {
        System.out.print("La suma de 2+4 es ");
        System.out.println(Operacion.sumar(2, 4));
        System.out.print("La resta de 6-2 es ");
        System.out.println(Operacion.restar(6, 2));
    }
}
