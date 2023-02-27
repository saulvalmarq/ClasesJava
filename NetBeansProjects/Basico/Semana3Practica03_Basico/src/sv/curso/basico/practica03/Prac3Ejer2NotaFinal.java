/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

/**
 *
 * @author Saúl Valencia
 */
public class Prac3Ejer2NotaFinal {
// Principal

    public static void main(String[] args) {
        Impresiones();
    }
// Método para calcular el Promedio de Laboratorios   

    public static double Laboratorios(double l1, double l2, double l3, double l4) {
        double Plabs;
        Plabs = (l1 + l2 + l3 + l4) / 4;
        return Plabs;
    }
// Método para calcular el Promedio de Parciales

    public static double Parciales(double p1, double p2, double p3, double p4) {
        double Ppars;
        Ppars = (p1 + p2 + p3 + p4) / 4;
        return Ppars;
    }
// Método para calcular el Promedio Final Obtenido

    public static double PromedioFinal() {
        double Pfinal;
//        Pfinal = (Laboratorios(6, 7, 8, 9) + Parciales(9, 8, 7, 6)) / 2;
        Pfinal = (Laboratorios(6.5, 7.5, 8.5, 9.5) + Parciales(9.5, 8.5, 7.5, 6.5)) / 2;
        return Pfinal;
    }

    public static void Impresiones() {
        // Declarando variables para impresion
        String carnet = "VM1988215";
        String nombre = "Carmelo Gonzalez";
        System.out.println("Información del Estudiante");
        System.out.println("Nombre:" + nombre);
        System.out.println("Código de Carnet: " + carnet);
// Invocando el resueltado Final del metodo PromedioFinal
        System.out.println("EL Promedio Final Obtenido es: " + PromedioFinal());
    }
}
