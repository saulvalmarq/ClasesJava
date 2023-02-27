/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class ClaseOptionVid {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Digite su salario:");
        
        //int salarioInt = Integer.parseInt(dato);
        float salarioFloat = Float.parseFloat(dato);
        double salarioDouble = Double.parseDouble(dato);
        
        System.out.println("Salario Float:" + salarioFloat);
        System.out.println("Salario Double:" + salarioDouble);
        
        double renta = 150.00;
        String salarioString = String.valueOf(renta);
        // Presentando resultado en ventana gráfica
        JOptionPane.showMessageDialog(null, "El salario double es:" +salarioDouble);
    }
}

