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
public class NotasGavidia {

    public static void main(String[] args) {
        int aprobados = 0;
        int reprobados = 0;

        System.out.println("Calculo de Notas Finales para un grupo de Estudiantes");
        System.out.println("Ingresar valores positivos del 0 al 10 \n");
        JOptionPane.showMessageDialog(null, "Ingresar valores positivos del 0 al 10 \n");
        for (int i = 1; i <= 10; i++) {
            double labs = 0;
            double pars = 0;
            double notaFinal = 0;
            double promedio1 = 0;
            double promedio2 = 0;
            System.out.println("Ingrese las notas del " + i + "° " + "Estudiante:");

            JOptionPane.showMessageDialog(null, "Ingrese las notas del " + i + "° " + "Estudiante:");

            for (int j = 1; j <= 4; j++) {
                String dato = JOptionPane.showInputDialog(null, "Laboratorio: " + j);
                double lab = Double.parseDouble(dato);
                labs = labs + lab;
            }
            for (int k = 1; k <= 4; k++) {
                String dato = JOptionPane.showInputDialog(null, "Parcial: " + k);
                double par = Double.parseDouble(dato);
                pars = pars + par;
            }
            promedio1 = (labs / 4) * 0.4;
            promedio2 = (pars / 4) * 0.6;
            notaFinal = promedio1 +promedio2;
            System.out.println("La nota Final del " + i + "° " + "Estudiante es : " + notaFinal + "\n");
            //JOptionPane.showMessageDialog(null, "La nota Final del " + i + "° " + "Estudiante es : " + notaFinal);
            if (notaFinal >= 6) {
                aprobados++;
                System.out.println("El " + i + "° " + "Estudiante está aprobado \n");
            } else {
                reprobados++;
                System.out.println("El " + i + "° " + "Estudiante está reprobado \n");
            }
        }
        System.out.println(aprobados + " Estudiante(s) tienen 6 o mas de 6 (Aprobado(s))");
        System.out.println(reprobados + " Estudiante(s) tienen menos de 6 (Reprobado(s))");
        JOptionPane.showMessageDialog(null, aprobados + " Estudiante(s) tienen 6 o mas de 6 (Aprobado(s))");
        JOptionPane.showMessageDialog(null, reprobados + " Estudiante(s) tienen menos de 6 (Reprobado(s))");
    }
}
