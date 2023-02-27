/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea07;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class Obrero {

    public static void main(String[] args) {
        double salario;
        System.out.println("Cálculo del salario de Obreros");
        JOptionPane.showMessageDialog(null, "Cálculo del salario de Obreros");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese las horas trabajadas por el obrero (valores enteros): " + i);
            String dato = JOptionPane.showInputDialog(null, "horas enteras trabajadas por el obrero: " + i);
            int horas = Integer.parseInt(dato);
            int horasExtra;
            
            while (horas <= 40) {
                salario = horas * 10;
                System.out.println("El salario del obrero " + i + " es: " + salario);
                JOptionPane.showMessageDialog(null, "El salario es: " + salario);
                break;
            }

            while (horas > 40) {
                horasExtra = horas - 40;
                salario = (10 * 40) + (horasExtra * 15);
                System.out.println("El salario del obrero " + i + " es: " + salario);
                JOptionPane.showMessageDialog(null, "El salario del obrero " + i + " es: " + salario);
                break;
            }
        }
    }
}
