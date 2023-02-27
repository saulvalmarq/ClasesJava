/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea07;

import javax.swing.JOptionPane;

/*import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class NotasGavidia2 {

    public static void main(String[] args) {

        int aprobados = 0;
        int reprobados = 0;
        double labs = 0.0;
        double pars = 0.0;
        double notaFinal = 0;

        System.out.println("Calculo de Notas Finales para 10 Estudiantes \n");
        Laboratorios(labs, labs);
        Parciales(pars, pars);
        Calculos(labs, pars, aprobados);
        Decisiones3(notaFinal, aprobados, reprobados, aprobados);

    }

    public static void Laboratorios(double lab, double labs) {
        System.out.println("Notas de Laboratorio \n");
        for (int i = 1; i <= 5; i++) {

            System.out.println("Ingrese Notas del " + i + "° " + "Estudiante");
            JOptionPane.showMessageDialog(null, "Ingrese Notas del " + i + "° " + "Estudiante:");

            for (int j = 1; j <= 4; j++) {
                String dato = JOptionPane.showInputDialog(null, "Laboratorio: " + j);
                lab = Double.parseDouble(dato);
                labs = labs + lab;
            }
        }
    }

    public static void Parciales(double par, double pars) {
        System.out.println("Notas de Examenes Parciales \n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese Notas del " + i + "° " + "Estudiante");
            JOptionPane.showMessageDialog(null, "Ingrese Notas del " + i + "° " + "Estudiante:");

            for (int k = 1; k <= 4; k++) {
                String dato = JOptionPane.showInputDialog(null, "Parcial: " + k);
                par = Double.parseDouble(dato);
                pars = pars + par;
            }
        }
    }

    public static void Calculos(double labs, double pars, int i) {
        double promedio1 = (labs / 4) * 0.4;
        double promedio2 = (pars / 4) * 0.6;
        double notaFinal = promedio1 + promedio2;
        System.out.println("La nota Final del " + i + "° " + "Estudiante es : " + notaFinal + "\n");
        JOptionPane.showMessageDialog(null, "La nota Final del " + i + "° " + "Estudiante es : " + notaFinal);
    }

    public static void Decisiones3(double notaFinal, int aprobados, int reprobados, int i) {
        if (notaFinal >= 6) {
            aprobados++;
            System.out.println("El " + i + "° " + "Estudiante está aprobado \n");
        } else {
            reprobados++;
            System.out.println("El " + i + "° " + "Estudiante está reprobado \n");
        }
    }

    public static void Impresiones(int aprobados, int reprobados) {
        System.out.println(aprobados + " Estudiantes tienen 6 o mas de 6 (Aprobados)");
        System.out.println(reprobados + " Estudiantes tienen menos de 6 (Reprobados)");
        JOptionPane.showMessageDialog(null, aprobados + " Estudiantes tienen 6 o mas de 6 (Aprobados)");
        JOptionPane.showMessageDialog(null, reprobados + " Estudiantes tienen menos de 6 (Reprobados)");
    }
}
