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
public class JOptionDialog {
    public static void main(String[] args) {
		String[] botones = {"Boton A", "Boton B", "Boton C", "Boton D"};
		int ventana = JOptionPane.showOptionDialog(null, 
						"Pulsa un boton:", 
						"Javadesde0.com", 
						JOptionPane.DEFAULT_OPTION, 
						JOptionPane.QUESTION_MESSAGE, null, 
						botones, botones[0]);
		if(ventana == 0) {System.out.println("Opcion A");} 
//		else if(ventana == 1) {System.out.println("Boton B");}
//		else if(ventana == 2) {System.out.println("Boton C");}
//		else if(ventana == 3) {System.out.println("Boton D");}
		else if(ventana == 1) {System.out.println("Boton B");}
//		else if(ventana == 2) {System.out.println("Boton C");}
//		else if(ventana == 3) {System.out.println("Boton D");}
	}
}
