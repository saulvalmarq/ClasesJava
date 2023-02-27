/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */
public class ImportarMaquina {
    // Declarando la clase principal
    public static void main(String[] args) {
// Creando la instancia de la clase NumberFormat
        NumberFormat formato = new DecimalFormat("#0.00");
        // Definiendo variables y asignado valores
        double valorMaquina = 10000.0;
        double valorFlete = 500;
        double valorSeguro = valorMaquina * 0.05;
        double valorDai = obtenerValorDai (10000.0, 500.0, 0.05);
        double valorIva = obtenerValorIva (valorDai);
        // Imprimiendo lo solicitado
        System.out.println("Valor Dai         : " + formato.format(valorDai));
        System.out.println("Valor Iva         : " + formato.format(valorIva));
        System.out.println("Costo Importación : " + formato.format(valorDai + valorIva));   
    }
    // Metodo para el cálculo del Dai
       public static double obtenerValorDai(double valorMaquina, double valorFlete, double porSeguro) {
        double valorDai;
        valorDai = (valorMaquina - valorFlete - (valorMaquina * porSeguro)) * 0.10;
        return valorDai;
    }
    // Metodo para el cálculo del Iva 
    public static double obtenerValorIva(double valorDai) {
        double valorIva;
        valorIva = valorDai * 0.13;
        return valorIva;
    }      
}
