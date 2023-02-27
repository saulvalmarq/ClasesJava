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
public class NotasGavidia3 {
        int aprobados;
        int reprobados;
        int i;
        double labs;
        double pars;
        double lab;
        double par;
        double nota;
        double promedio1;
        double promedio2;
        
    public static void main(String[] args ) {

        System.out.println("Calculo de Notas Finales para 10 Estudiantes \n");
//            Laboratorios(labs);
//            Parciales(pars, pars);
//            Calculos(labs, pars, aprobados);
//            Decisiones3(nota, aprobados, reprobados, aprobados);
//            Parciales();
//            Promedio1(0);
//            Promedio2(0);
//            NotaFinal(0, 0, 0);
//            Decision(0, 0, 0, 0);
//            Impresion(0, 0);
            double Labos = Laboratorios();
            System.out.println("Labos" + Labos);
            Parciales();
            Promedio1(0);
            Promedio2(0);
            NotaFinal();
            Decision();
            Impresion();     

    }
    public double Laboratorios() {
        System.out.println("Notas de Laboratorio");
        System.out.println("Ingrese Notas de Laboratorio del Estudiante");
        JOptionPane.showMessageDialog(null, "Ingrese Notas de Laboratorio del " + i + "° " + "Estudiante:");

        for (int j = 1; j <= 4; j++) {

            String dato = JOptionPane.showInputDialog(null, "Laboratorio: " + j);
            lab = Double.parseDouble(dato);
            labs = labs + lab;
            System.out.println("Labs:" + labs);
        }
       return labs;
    }
    public double Parciales() {
        System.out.println("Notas de Examenes Parciales");
        System.out.println("Ingrese Notas de Parciales del " + i + "° " + "Estudiante");
        JOptionPane.showMessageDialog(null, "Ingrese Notas de Parciales del " + i + "° " + "Estudiante:");

        for (int k = 1; k <= 4; k++) {
            String dato = JOptionPane.showInputDialog(null, "Parcial: " + k);
            par = Double.parseDouble(dato);
            pars = pars + par;
             System.out.println("Pars:" + pars);
        }
    return pars;
    }
    public double Promedio1() {
        promedio1 = (labs / 4) * 0.4;
        return promedio1;
    }       
        
    public double Promedio2(double pars) {
        promedio2 = (pars / 4) * 0.6;
        return promedio2;
    }   

    public double NotaFinal() {
        double nota = promedio1 + promedio2;
        System.out.println("Promedio1 =" + promedio1);
        System.out.println("Promedio2 =" + promedio2);
        System.out.println("notaFinal = "+ nota);
        System.out.println("La nota Final del " + i + "° " + "Estudiante es : " + nota);
        return nota;
    }

    public void Decision() {
        if (nota >= 6) {
            aprobados++;
            System.out.println("El " + i + "° " + "Estudiante está aprobado \n");
        } else {
            reprobados++;
            System.out.println("El " + i + "° " + "Estudiante está reprobado \n");
        }
    }

    public void Impresion() {
        for (int i = 1; i <= 3; i++) {
//            Laboratorios(labs, labs, i);
//            Parciales(pars, pars, i);
//            Promedio1(labs, promedio1);
//            Promedio2(pars, promedio2);
//            NotaFinal(i, promedio1, promedio2, notaFinal);
//            Decision(notaFinal, aprobados, reprobados, i);
        }
        System.out.println(aprobados + " Estudiantes tienen 6 o mas de 6 (Aprobados)");
        System.out.println(reprobados + " Estudiantes tienen menos de 6 (Reprobados)");
        //           JOptionPane.showMessageDialog(null, aprobados + " Estudiantes tienen 6 o mas de 6 (Aprobados)");
        //           JOptionPane.showMessageDialog(null, reprobados + " Estudiantes tienen menos de 6 (Reprobados)");
    }
}
