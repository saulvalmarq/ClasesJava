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
public class CincoNotasConJoption {
    public static void main(String[] args) {
    //int a;
        // int contador = 0;
        double suma = 0;
        double promedio;
        for (int j = 1; j <= 5; j++) {
            // System.out.println("Ingrese la nota " + j + "°");
            String dato = JOptionPane.showInputDialog(null, "Ingrese la " + j + "°" + " nota");
            
            // a = dato.nextInt();
            double nota = Double.parseDouble(dato);
            //contador = contador + a;
            suma = suma + nota;
        }
        //int promedio = contador / 5;
        promedio = suma / 5;
        System.out.println("El promedio es : " + promedio);
        JOptionPane.showMessageDialog(null,"El promedio es : " + promedio);   
    }
}