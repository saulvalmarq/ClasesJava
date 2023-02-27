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
public class ClaseOptionDosVid {

    public static void main(String[] args) {
        String dato = JOptionPane.showInputDialog(null, "Digite su salario:");
        // Declarando variable y asignando el valor introducido pero
        // Convirtiendo de String a double
        double salario = Double.parseDouble(dato);
        // Con el valor ya convertido a double hacemos operaciones
        salario = salario * 0.10 + salario;
        // Se manda a imprimiir en pantalla de dos formas diferentes
        System.out.println("El salario es : " + salario);
        JOptionPane.showMessageDialog(null, "El salario es : " + salario);
    }
}

