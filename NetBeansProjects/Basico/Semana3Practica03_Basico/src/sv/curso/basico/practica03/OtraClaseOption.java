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
public class OtraClaseOption {
    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Digite su salario:");
        
        double salario = Double.parseDouble(dato);
        
        salario = salario * 0.10 + salario;
        
        System.out.println("El salario es:" + salario);
        JOptionPane.showMessageDialog(null, "El salario double es:" +salario);
    }
}
