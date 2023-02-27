/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */
public class Calculadora {
    public static void main(String[] args) {
       BufferedReader lector = new BufferedReader(
               new InputStreamReader(System.in)); 
       
       double valor1=0;
       double valor2=0;
       NumberFormat formato = new DecimalFormat("#0.00");
    
       try{
        System.out.println("Valor 1:");
        valor1 = Double.parseDouble(lector.readLine());
        System.out.println("Valor 2:");
        valor2 = Double.parseDouble(lector.readLine());
        
           System.out.println("Suma           :" + Calculadora.sumar(valor1, valor2));
           System.out.println("Resta          :" + Calculadora.restar(valor1, valor2));
           System.out.println("Multiplicacion :" + Calculadora.multiplicar(valor1, valor2));
           System.out.println("Division       :" + formato.format (Calculadora.dividir(valor1, valor2)));
    
    } catch (Exception e){
           System.out.println(e.getMessage());
    }
  }

    public static double sumar(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        return resultado;
    }        
    public static double restar(double valor1, double valor2) {
        double resultado = valor1 - valor2;
        return resultado;
    }        
    public static double multiplicar(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        return resultado;
    }        
    public static double dividir(double valor1, double valor2) {
        double resultado = valor1 / valor2;
        return resultado;      
    }









    
}
