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
public class Decisiones2ifElse {
    public static void main(String[] args) {
    String dato = JOptionPane.showInputDialog(null, "Digite su edad:");
//        String resultado;
        int edad = Integer.parseInt(dato);
        
        //&&   And
        if (edad>=18 && edad<=60){
            System.out.println("Mayor de edad...");
        } else if (edad>=15 && edad<18){
            System.out.println("Pubertad...");
        } else if (edad>=10 && edad <15){
            System.out.println("Preadolescencia");
        } else if (edad>=5 && edad < 10){
            System.out.println("Ninez");
        } else {
            System.out.println("Valor desconocido...");
            JOptionPane.showMessageDialog(null,"Valor desconocido..." + dato);    
        }
    }
}
