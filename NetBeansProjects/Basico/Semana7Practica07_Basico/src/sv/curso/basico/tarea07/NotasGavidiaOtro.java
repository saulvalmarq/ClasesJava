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

public class NotasGavidiaOtro {

    public static void main(String[] args) {
//        int i=0;
//        int aprobados=0;
//        int reprobados=0;
//        double labs=0;
//        double pars=0;
//        double lab=0;
//        double par=0;
//        double notaFinal=0;
//        double promedio1=0;
//        double promedio2=0;

        System.out.println("Calculo de Notas Finales para 10 Estudiantes \n");
        Labos(labs, labs, i);
        Parcis(pars, pars, i);
        Calculos(labs, pars, i, promedio1, promedio2);
        Decisiones(notaFinal, aprobados, reprobados, aprobados);
        Impresion(lab, labs, par, pars, notaFinal, aprobados, reprobados, promedio1, promedio2);
       
    }

    public static double Labos(double lab, double labs, int i) {
        double promedio1=0.0;
        System.out.println("Notas de Laboratorio");
        System.out.println("Ingrese Notas de Laboratorio del " + i + "° " + "Estudiante");
        JOptionPane.showMessageDialog(null, "Ingrese Notas de Laboratorio del " + i + "° " + "Estudiante:");

        for (int j = 1; j <= 4; j++) {
            String dato1 = JOptionPane.showInputDialog(null, "Laboratorio: " + j);
            lab = Double.parseDouble(dato1);
            labs = labs + lab;
            promedio1 = (labs / 4) * 0.4;
            System.out.println("Labs:" + labs);
        }
    return promedio1;
    }

    public static double Parcis(double par, double pars, int i) {
        double promedio2=0.0;
        System.out.println("Notas de Examenes Parciales");
        System.out.println("Ingrese Notas de Parciales del " + i + "° " + "Estudiante");
        JOptionPane.showMessageDialog(null, "Ingrese Notas de Parciales del " + i + "° " + "Estudiante:");

        for (int k = 1; k <= 4; k++) {
            String dato2 = JOptionPane.showInputDialog(null, "Parcial: " + k);
            par = Double.parseDouble(dato2);
            pars = pars + par;
            promedio2 = (pars / 4) * 0.6;
             System.out.println("Pars:" + pars);
        }
        return promedio2;
    }

    public static double Calculos(double labs, double pars, int i, double promedio1, double promedio2) {
        double notaFinal = 0.0;
//        System.out.println("Promedio1 =" + promedio1);
//        System.out.println("Promedio2 =" + promedio2);
        notaFinal = ((labs / 4) * 0.4) + ((pars / 4) * 0.6);
//        System.out.println("notaFinal = "+ notaFinal);
        System.out.println("La nota Final del " + i + "° " + "Estudiante es : " + notaFinal);
        JOptionPane.showMessageDialog(null, "La nota Final del " + i + "° " + "Estudiante es : " + notaFinal);
        return notaFinal;
    }

    public static void Decisiones(double notaFinal, int aprobados, int reprobados, int i) {
        if (notaFinal >= 6) {
            aprobados++;
            System.out.println("El " + i + "° " + "Estudiante está aprobado \n");
        } else {
            reprobados++;
            System.out.println("El " + i + "° " + "Estudiante está reprobado \n");
        }
    }

    public static void Impresion(double lab, double labs, double par, double pars, double notaFinal, int aprobados, int reprobados, double promedio1, double promedio2) {
        for (int i = 1; i <= 3; i++) {
            Labos(labs, lab, i);
            Parcis(pars, par, i);
            Calculos(labs, pars, i, promedio1, promedio2);
            Decisiones(notaFinal, aprobados, reprobados, i);
        }
 
        System.out.println(aprobados + " Estudiantes tienen 6 o mas de 6 (Aprobados)");
        System.out.println(reprobados + " Estudiantes tienen menos de 6 (Reprobados)");
        JOptionPane.showMessageDialog(null, aprobados + " Estudiantes tienen 6 o mas de 6 (Aprobados)");
        JOptionPane.showMessageDialog(null, reprobados + " Estudiantes tienen menos de 6 (Reprobados)");
        
        
        
        
    }
}

