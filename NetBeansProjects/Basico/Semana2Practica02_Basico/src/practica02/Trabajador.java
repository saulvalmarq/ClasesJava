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
public class Trabajador {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        double afpEmpleado = PagoAfpEmpleado(500.0, 0.06);
        double afpEmpleador = PagoAfpEmpleador(500.0, 0.065);
        double totalAfp = afpEmpleado + afpEmpleador;

        System.out.println("Pago AFP en concepto de Empleado  : " + formato.format(afpEmpleado));
        System.out.println("Pago AFP en concepto de Empleador : " + formato.format(afpEmpleador));
        System.out.println("Pago Total a AFP                  : " + formato.format(totalAfp));
    }
                
                
    public static double PagoAfpEmpleado(double salario, double porcent1){
        double afpEmpleado;
        afpEmpleado = salario * porcent1;
        return afpEmpleado; 
    }            
                
    public static double PagoAfpEmpleador(double salario, double porcent2){
        double afpEmpleador;
        afpEmpleador = salario * 0.065;
        return afpEmpleador;
    }              
                
     public static double PagoTotalAfp(double afpEmpleado, double afpEmpleador){
        double totalAfp;
        totalAfp = afpEmpleado +  afpEmpleador;
        return totalAfp;
    }                            
}
