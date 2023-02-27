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
public class NotasUniversidadGavidia {

// Metodo Principal  
    public static void main(String[] args) {
        double notaFinal = 0;
        double promedio1 = 0;
        double promedio2 = 0;
        int aprobados = 0;
        int reprobados = 0;
// Breves Explicaciones para evitar cometer errores de introducción de datos           
        System.out.println("Calculo de Notas Finales para un grupo de Estudiantes");
        System.out.println("Ingresar valores positivos del 0 al 10 \n");
        JOptionPane.showMessageDialog(null, "Ingresar valores positivos del 0 al 10 \n");
// Invocando Metodo para Obtener Resultados             
        Decisiones(promedio1, promedio2, notaFinal, aprobados, reprobados);
    }
// Metodo para Decisiones y Calculos
    public static void Decisiones(double promedio1, double promedio2, double notaFinal, int aprobados, int reprobados) {
// Ciclo solicitado para obtener las Notas de los 10 estudiantes
        for (int i = 1; i <= 10; i++) {
// Declarando e inicializando variables a utilizar
            double labs = 0;
            double pars = 0;
// Entrada de Datos por Teclado
            System.out.println("Ingrese las notas del " + i + "° " + "Estudiante:");
            JOptionPane.showMessageDialog(null, "Ingrese las notas del " + i + "° " + "Estudiante:");
// Ciclo para obtener las Notas de los cuatro laboratorios            
            for (int j = 1; j <= 4;) {

                String dato = JOptionPane.showInputDialog(null, "Laboratorio: " + j);
                double lab = Double.parseDouble(dato);
// Ciclo para evitar que metan valores negativos y mayores que 10
                if (lab >= 0 && lab <= 10) {
                    labs = labs + lab;
                    j++;
                } else {
                    System.out.println("Entrada Incorrecta....");
                }
            }
// Ciclo para obtener las Notas de los cuatro Parciales
            for (int k = 1; k <= 4;) {
                String dato = JOptionPane.showInputDialog(null, "Parcial: " + k);
                double par = Double.parseDouble(dato);
                if (par >= 0 && par <= 10) {
                    pars = pars + par;
                    k++;
                } else {
                    System.out.println("Entrada Incorrecta....");
                }
            }

// Calculo de Promedios y Nota Final por Estudiante
            promedio1 = (labs / 4) * 0.4;
            promedio2 = (pars / 4) * 0.6;
            notaFinal = promedio1 + promedio2;
            System.out.println("La nota Final del " + i + "° " + "Estudiante es : " + notaFinal + "\n");
            JOptionPane.showMessageDialog(null, "La nota Final del " + i + "° " + "Estudiante es : " + notaFinal);
// Ciclo para Conteo de aprobados y reprobados            
            if (notaFinal >= 6) {
                aprobados++;
                System.out.println("El " + i + "° " + "Estudiante está aprobado \n");
            } else {
                reprobados++;
                System.out.println("El " + i + "° " + "Estudiante está reprobado \n");
            }
        }

// Impresiones solicitadas para saber cuantos estudiantes fueron aprobados y cuantos reprobados
        System.out.println("Estudiante(s) Aprobado(s) : " + aprobados);
        System.out.println("Estudiante(s) Reprobado(s) : " + reprobados);
        JOptionPane.showMessageDialog(
                null, "Estudiante(s) Aprobado(s) : " + aprobados);
        JOptionPane.showMessageDialog(
                null, "Estudiante(s) Reprobado(s) : " + reprobados);
    }
}
