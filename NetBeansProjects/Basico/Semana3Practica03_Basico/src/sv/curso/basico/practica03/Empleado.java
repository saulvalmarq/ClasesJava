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
public class Empleado {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("$#,###.##");
      
        System.out.println("Ingrese el Nombre del Empleado:");
        String nombreEmpleado = lector.nextLine();

        System.out.println("Ingrese el Numero de dias trabajados en el mes:");
        double diasTrabajados = lector.nextDouble();
        
        System.out.println("Ingrese el Salario Diario:");
        double salarioDiario = lector.nextDouble();
        
        System.out.println("Ingrese el Total de Horas Extras trabajadas en el mes:");
        double totalHorasExtras = lector.nextDouble();
        
        System.out.println("El Nombre del Empleado es        : " + nombreEmpleado);
        System.out.println("El Salario final del Empleado es : " + formato.format(Empleado.Extras(salarioDiario, totalHorasExtras) + Empleado.salariosinExtras(diasTrabajados, salarioDiario)));
        
    }
   
    public static double Extras(double salarioDiario, double totalHorasExtras) {
        double salarioPorHorasExtras;
        double pagoHoraExtra = salarioDiario * 0.10;
        salarioPorHorasExtras = pagoHoraExtra * totalHorasExtras;
        return salarioPorHorasExtras;
    }

      public static double salariosinExtras(double diasTrabajados, double salarioDiario) {
        double salarioFinal;
        salarioFinal = diasTrabajados * salarioDiario;
        return salarioFinal;       
    }  
    
      
}
