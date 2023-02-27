/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea08;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class EmpleadoMejorado {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("$ #,###.##");

        System.out.println("Ingrese el Nombre del Empleado:");
        String nombreEmpleado = lector.nextLine();

        System.out.println("Ingrese el Numero de dias trabajados en el mes:");
        double diasTrabajados = lector.nextDouble();

        System.out.println("Ingrese el Salario Diario:");
        double salarioDiario = lector.nextDouble();

        System.out.println("Ingrese el Total de Horas Extras trabajadas en el mes:");
        double totalHorasExtras = lector.nextDouble();

        System.out.println("El Nombre del Empleado es        : " + nombreEmpleado);
//        System.out.println("El Salario final del Empleado es : " + formato.format(EmpleadoMejorado.Extras(salarioDiario, totalHorasExtras) + EmpleadoMejorado.salariosinExtras(diasTrabajados, salarioDiario)));
        //      System.out.println("El Salario final del Empleado es : " + formato.format()));
        double salarioSe = 0;
        double salarioPorHorasExtras = 0;
        double e = EmpleadoMejorado.Extras(salarioDiario, totalHorasExtras);
        double sse = EmpleadoMejorado.Extras(salarioDiario, totalHorasExtras);
        double sf = EmpleadoMejorado.salarioFinal(salarioSe, salarioPorHorasExtras);
        System.out.println("El Salario final del Empleado es : " + formato.format(sf));

    }

    public static double Extras(double salarioDiario, double totalHorasExtras) {
        double salarioPorHorasExtras;
        double pagoHoraExtra = salarioDiario * 0.10;
        salarioPorHorasExtras = pagoHoraExtra * totalHorasExtras;
        return salarioPorHorasExtras;
    }

    public static double salariosinExtras(double diasTrabajados, double salarioDiario) {
        double salarioSe;
        salarioSe = diasTrabajados * salarioDiario;
        return salarioSe;
    }

    public static double salarioFinal(double salarioSe, double salarioPorHorasExtras) {
        double salarioF;
        salarioF = salarioSe + salarioPorHorasExtras;
        System.out.println("El Salario final del Empleado es : " + salarioF);
        return salarioF;

    }

}
//      public static void EntradaDeDatos(){
//          
////          System.out.println("Ingrese el Nombre del Empleado:");
////        String nombreEmpleado = lector.nextLine();
////
////        System.out.println("Ingrese el Numero de dias trabajados en el mes:");
////        double diasTrabajados = lector.nextDouble();
////        
////        System.out.println("Ingrese el Salario Diario:");
////        double salarioDiario = lector.nextDouble();
////        
////        System.out.println("Ingrese el Total de Horas Extras trabajadas en el mes:");
////        double totalHorasExtras = lector.nextDouble();
////        
////        System.out.println("El Nombre del Empleado es        : " + nombreEmpleado);
//////        System.out.println("El Salario final del Empleado es : " + formato.format(EmpleadoMejorado.Extras(salarioDiario, totalHorasExtras) + EmpleadoMejorado.salariosinExtras(diasTrabajados, salarioDiario)));
////       System.out.println("El Salario final del Empleado es : " + formato.format(EmpleadoMejorado.salarioFinal()));
////      }
//}
