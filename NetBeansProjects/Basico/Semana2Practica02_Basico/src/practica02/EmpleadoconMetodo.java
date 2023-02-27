/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author Saúl Valencia
 */
public class EmpleadoconMetodo {
    public static void main(String[] args) {
        double salarioMensual = sueldoCompleto (300.00);
        System.out.println("Calculo de Salario en Construcción incluyendo Horas Extras");
        System.out.println("El Salario Completo es de : $ " + salarioMensual);       
    }
    
    public static double sueldoCompleto(double salarioBase) {
        double salarioMensual;
        int horasExtras = 15;
        salarioMensual = salarioBase + (2 * horasExtras);
        return salarioMensual;       
    }
}