/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica06;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class Decisiones4Switch {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Digite dos letras para dia de semana:");

        dato = dato.toUpperCase();
        
        switch (dato) {
            case "LU":
                System.out.println("Dia lunes");
                break;
            case "MA":
                System.out.println("Dia martes");
                break;
            case "MI":
                System.out.println("Dia miercoles");
                break;
            case "JU":
                System.out.println("Dia jueves");
                break;
            case "VI":
                System.out.println("Dia viernes");
                break;
            default:
                System.out.println("Desconocido...");
        }
    }
}
