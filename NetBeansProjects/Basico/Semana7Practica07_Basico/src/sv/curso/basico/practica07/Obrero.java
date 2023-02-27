/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica07;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class Obrero {
// Metodo Principal  

    public static void main(String[] args) {
        System.out.println("Cálculo del Salario Semanal de Obreros");
        JOptionPane.showMessageDialog(null, "Cálculo del Salario Semanal de Obreros");
        CalculaSalario(0);
    }
// Metodo para Decisiones y Calculos

    public static void CalculaSalario(double salario) {
// Ciclo para obtener los Salarios de Diez Obreros 
        for (int i = 1; i <= 10;) {
// Entrada de Datos por Teclado
            System.out.println("Ingrese las horas semanales(valores enteros) trabajadas por el obrero " + i + " :");
            String dato = JOptionPane.showInputDialog(null, "horas semanales(valores enteros) trabajadas por el obrero " + i + " :");
            int horas = Integer.parseInt(dato);
            int horasExtra;
// Ciclo para evitar que metan valores negativos
            if (horas >= 0) {
// Decisión para un número de horas menor o igual que 40
                while (horas <= 40) {
                    salario = horas * 10;
                    System.out.println("El salario semanal del obrero " + i + " es: " + salario);
                    JOptionPane.showMessageDialog(null, "El salario semanal del obrero " + i + " es: " + salario);
                    break;
                }
// Decisión para un número de horas mayor que 40, la diferencia del total de horas menos 40, es lo que pagaran a 15
                while (horas > 40) {
                    horasExtra = horas - 40;
                    salario = (10 * 40) + (horasExtra * 15);
                    System.out.println("El salario semanal del obrero " + i + " es: " + salario);
                    JOptionPane.showMessageDialog(null, "El salario semanal del obrero " + i + " es: " + salario);
                    break;
                }
                i++;
            } else {
                System.out.println("Entrada Incorrecta....");
            }
        }
    }
}
