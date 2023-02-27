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
public class Prac3Ejer1Nit {
// Declaramos el método Principal

    public static void main(String[] args) {
// Invocamos el resultado del método creado
        JOptionPane.showMessageDialog(null, Datos());
    }
// Creamos un método para introducir datos y seleccionar lo solicitado

    public static String Datos() {
// Variable para guardar el numeor de nit introducido
        String numeroNit;
// Solicitamos que se introudzca el numero de nit
        numeroNit = JOptionPane.showInputDialog("Introduzca el NIT:");
// Obteniendo el par de numeros del día
        String dia = numeroNit.substring(4, 6);
// Obteniendo el par de numeros del mes
        String mes = numeroNit.substring(6, 8);
// Obteniendo el par de numeros del año
        String anio = numeroNit.substring(8, 10);
// Devolviendo la fecha de nacimiento como lo solicitan
        return "La fecha de nacimiento es: " + dia + "/" + mes + "/" + anio;
    }
}
