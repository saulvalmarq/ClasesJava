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
public class Decisiones3Switch {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Digite dia de semana:");

        int diaSemana = Integer.parseInt(dato);

        switch (diaSemana) {
            case 1:
                System.out.println("Dia lunes");
                break;
            case 2:
                System.out.println("Dia martes");
                break;
            case 3:
                System.out.println("Dia miercoles");
                break;
            case 4:
                System.out.println("Dia jueves");
                break;
            case 5:
                System.out.println("Dia viernes");
                break;
            default:
                System.out.println("Desconocido...");
        }

    }
}
