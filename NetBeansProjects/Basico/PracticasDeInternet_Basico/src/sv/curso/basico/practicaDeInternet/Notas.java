/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class Notas {

    public static void main(String[] args) {

        int aprobados = 0;
        int reprobados = 0;
        double labs = 0.0;
        double pars = 0.0;
        double lab = 0.0;
        double par = 0.0;
//        double promedio1;
//        double promedio2;
//        double notaFinal;
        System.out.println("Calculo de Notas Finales para 10 Estudiantes \n");
        for (int i = 1; i <= 1; i++) {
            Laboratorios(labs, i);
            Parciales(pars, i);
            Calculo1(labs);
            Calculo2(pars);
            Calculo3(par, par, i);
            Decision(par, aprobados, reprobados, i);
            Colectar(aprobados, reprobados);
        }
    }

    public static double Laboratorios(double labs, int i) {
        System.out.println("Notas de Laboratorio");
        System.out.println("Ingrese Notas de Laboratorio del " + i + "° " + "Estudiante");
        JOptionPane.showMessageDialog(null, "Ingrese Notas de Laboratorio del " + i + "° " + "Estudiante:");
        for (int j = 1; j <= 4; j++) {
         String dato = JOptionPane.showInputDialog(null, "Laboratorio: " + j);
        double lab = Double.parseDouble(dato);
            labs = labs + lab;
            System.out.println("Labs:" + labs);
        }
        return labs;
    }

    private static double Parciales(double pars, int i) {
        System.out.println("Notas de Examenes Parciales");
        System.out.println("Ingrese Notas de Parciales del " + i + "° " + "Estudiante");
        JOptionPane.showMessageDialog(null, "Ingrese Notas de Parciales del " + i + "° " + "Estudiante:");
        for (int k = 1; k <= 4; k++) {
            String dato = JOptionPane.showInputDialog(null, "Parcial: " + k);
            double par = Double.parseDouble(dato);
            pars = pars + par;
            System.out.println("Pars:" + pars);
        }
        return pars;
    }

    private static double Calculo1(double labs) {
        double promedio1 = (labs / 4) * 0.4;
        System.out.println("Promedio1 =" + promedio1);
        return promedio1;
    }

    private static double  Calculo2(double pars) {
        double promedio2 = (pars / 4) * 0.6;
        System.out.println("Promedio2 =" + promedio2);
        return promedio2;
    }

    private static void Calculo3(double promedio1, double promedio2, int i) {
        double notaFinal = promedio1 + promedio2;
//          notaFinal = ((labs / 4) * 0.4) + ((pars / 4) * 0.6);
        System.out.println("notaFinal = " + notaFinal);
        System.out.println("La nota Final del " + i + "° " + "Estudiante es : " + notaFinal);
        //JOptionPane.showMessageDialog(null, "La nota Final del " + i + "° " + "Estudiante es : " + notaFinal);
//        return notaFinal;
    }

    private static void Decision(double notaFinal, int aprobados, int reprobados, int i) {
        if (notaFinal >= 6) {
            aprobados++;
            System.out.println("El " + i + "° " + "Estudiante está aprobado \n");
        } else {
            reprobados++;
            System.out.println("El " + i + "° " + "Estudiante está reprobado \n");
        }
    }
//    public static void Impresiones(double lab, double labs, double par, double pars, double notaFinal, int aprobados, int reprobados, double promedio1, double promedio2) {

//    private static void Colectar(double lab, double pars, double promedio1, double promedio2, int aprobados, int reprobados) {
    private static void Colectar(int aprobados, int reprobados) {
        System.out.println(aprobados + " Estudiantes tienen 6 o mas de 6 (Aprobados)");
        System.out.println(reprobados + " Estudiantes tienen menos de 6 (Reprobados)");
    }
}
