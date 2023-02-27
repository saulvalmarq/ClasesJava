/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

/**
 *
 * @author Saúl Valencia
 */
public class Rectangulo {

    public static double area(int lado1, int lado2) {
        return lado1 * lado2;
    }

    public static double perimetro(int lado1, int lado2) {
        return lado1 * 2 + lado2 * 2;
    }

    public static void main(String[] args) {
        imprimir(2, 2);
    }

    public static void imprimir(int lado1, int lado2) {
        System.out.println("Area del Rectagulo");
// Funciona colocando el nombre de la clase y sin colocarlo        
//        System.out.println(Rectangulo.area(lado1, lado2));
        System.out.println(area(lado1, lado2));
        System.out.println("Perímetro del Rectagulo");
//        System.out.println(Rectangulo.perimetro(lado1, lado2));
        System.out.println(perimetro(lado1, lado2));
    }
}
