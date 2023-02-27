/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica06;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class Decisiones1if {
    public static void main(String[] args) {
    
        String dato = JOptionPane.showInputDialog(null, "Digite su edad:");
        
        int edad = Integer.parseInt(dato);
        
        if (edad>=18){
            System.out.println("Mayor de edad...");
        } else if (edad>=15){
            System.out.println("Pubertad...");
        } else if (edad>=10){
            System.out.println("Preadolescencia");
        } else if (edad>=5){
            System.out.println("Ninez");
        }
    }
}
