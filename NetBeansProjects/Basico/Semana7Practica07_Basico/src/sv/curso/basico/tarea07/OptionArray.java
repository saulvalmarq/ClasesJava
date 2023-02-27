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
public class OptionArray {
    public static void main(String[] args) {
                double lab[];
                lab = new double[4];
		String[] laboratorio = {"lab1", "lab2", "lab3", "lab4"};
//                String dato = JOptionPane.showInputDialog(null, "Ingrese la " + j + "°" + " nota");
		int ventana = JOptionPane.showOptionDialog(null, 
						"Ingresa las notas de los laboratorios:", 
						"Cursode Java Básico", 
						JOptionPane.DEFAULT_OPTION, 
						JOptionPane.QUESTION_MESSAGE, null, 
						laboratorio, laboratorio[0]);
//                laboratorio[0]= lab[1];
//                laboratorio[0]= lab[2];
//                laboratorio[0]= lab[3];
//                laboratorio[0]= lab[1];
///		if(ventana == 0) {System.out.println("Opcion A");} 
//		else if(ventana == 1) {System.out.println("Boton B");}
//		else if(ventana == 2) {System.out.println("Boton C");}
//		else if(ventana == 3) {System.out.println("Boton D");}
//		else if(ventana == 1) {System.out.println("Boton B");}
////		else if(ventana == 2) {System.out.println("Boton C");}
//		else if(ventana == 3) {System.out.println("Boton D");}
}
}