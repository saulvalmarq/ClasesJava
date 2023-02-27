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
public class GavidiaNotas {
    public static void main(String[] args) {
        //double lab[];
        //double par[];
        for (int i = 0; i <= 9; i++) {
            
        double lab[];
        lab = new double[3];
         double par[];
        par = new double[3];
        JOptionPane.showMessageDialog(null, "Ingrese las notas del Estudiante: "+ (i+1));
            for (int j = 0; j <= 3; j++) {
          String dato = JOptionPane.showInputDialog(null, "Laboratorio: "+ (j+1));
          lab[i] = Double.parseDouble(dato);
    }
                for (int k = 0; k <= 3; k++) {
          String dato = JOptionPane.showInputDialog(null, "Parcial: "+ (k+1));
          par[i] = Double.parseDouble(dato);
    }
//          notaFinal = ((labs)/4)) * 0.4;
   }
  }
}