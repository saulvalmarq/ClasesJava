/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class CalcularDai {
    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);  
      
        double valorMaquina;
        double valorFlete;
        double valorSeguro;
        NumberFormat formato = new DecimalFormat("$#,###.##");
      
        System.out.println("Valor Maquina");
        valorMaquina = lector.nextDouble();

        System.out.println("Valor Flete");
        valorFlete = lector.nextDouble();

        System.out.println("Valor Seguro");
        valorSeguro = lector.nextDouble();

        double valorDai = CalcularDai.obtieneDai(valorMaquina, valorFlete, valorSeguro);
        double valorIva = CalcularDai.obtieneIva(valorDai);

        System.out.println("Valor del Dai: " + formato.format(valorDai));
        System.out.println("Valor del Iva: " + formato.format(valorIva));     
    }
    
public static double obtieneDai(double valorMaquina,
                                double valorFlete,
                                double valorSeguro){
    double dai;
    dai = (valorMaquina - valorFlete - valorSeguro)*0.10;
    return dai;
    }

public static double obtieneIva(double valorDai){
    double valorIva;
    valorIva = valorDai * 1.13;
    return valorIva;
    }  
}    
