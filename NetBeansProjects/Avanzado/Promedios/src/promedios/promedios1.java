/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedios;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class promedios1 {

    public static void main(String[] args) {

        calculo();
    }

    public static void calculo() {
        String NEstudiantes = JOptionPane.showInputDialog("Digite la cantidad de estudiantes");
        int number = Integer.valueOf(NEstudiantes);

        for (int i = 1; i <= number; i++) {

            String lab11 = JOptionPane.showInputDialog("digite nota para el estudiante " + i + " de el 1°laboratorio");
            double lab1 = Double.parseDouble(lab11);
            String lab22 = JOptionPane.showInputDialog("digite notapara el estudiante " + i + " de el 2°laboratorio");
            double lab2 = Double.parseDouble(lab22);
            String lab33 = JOptionPane.showInputDialog("digite nota para el estudiante " + i + "  de el 3°laboratorio");
            double lab3 = Double.parseDouble(lab33);
            String lab44 = JOptionPane.showInputDialog("digite nota para el estudiante " + i + " de e 4°laboratorio");
            double lab4 = Double.parseDouble(lab44);
            String par11 = JOptionPane.showInputDialog("digite nota para el estudiante " + i + " de el 1°parcial");
            double par1 = Double.parseDouble(par11);
            String par22 = JOptionPane.showInputDialog("digite nota para el estudiante " + i + " de el 2°parcial");
            double par2 = Double.parseDouble(par22);
            String par33 = JOptionPane.showInputDialog("digite nota para el estudiante " + i + " de el 3°parcial");
            double par3 = Double.parseDouble(par33);
            String par44 = JOptionPane.showInputDialog("digite nota para el estudiante " + i + " de el 4°parcial");
            double par4 = Double.parseDouble(par44);

            //    double promedio = 6.00;
            int aprobado = 0;
            int reprobado = 0;
            double promedio1 = ((lab1 + lab2 + lab3 + lab4) / 4) * 0.4;
            double promedio2 = ((par1 + par2 + par3 + par4) / 4) * 0.6;
            double promedioFinal = promedio1 + promedio2;
            if (promedioFinal >= 6.0) {
                aprobado++;
                System.out.println("hola el promedio para  estudiante " + i + ":" + promedioFinal);
                System.out.println(" estado: Aprobado ");
                System.out.println("---------------------------------------");
            } else {
                reprobado++;

                System.out.println("hola el promedio para  estudiante " + i + ":" + promedioFinal);
                System.out.println("estado: Reprobado  ");
                System.out.println("---------------------------------------");
            }

        }
    }
}
