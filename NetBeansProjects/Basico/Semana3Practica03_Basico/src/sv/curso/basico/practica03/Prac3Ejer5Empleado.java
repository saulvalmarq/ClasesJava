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
public class Prac3Ejer5Empleado {
// Método Principal
    public static void main(String[] args) {
// Invocando este método se hace el ingreso de los datos necesarios y luego hay una cadena de invocaciones
        IngresarDatos();
    }
// Método para Ingresar la información necesaria para los cálculos
    public static void IngresarDatos() {
        Scanner lector = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("$ #,###.##");

        System.out.println("Ingrese el Nombre del Empleado:");
        String nombreEmpleado = lector.nextLine();

        System.out.println("Ingrese el Numero de dias trabajados en el mes:");
        int diasTrabajados = lector.nextInt();

        System.out.println("Ingrese el Salario Diario:");
        double salarioDiario = lector.nextDouble();

        System.out.println("Ingrese el Total de Horas Extras trabajadas en el mes:");
        int totalHorasExtras = lector.nextInt();

        System.out.println("El Nombre del Empleado es        : " + nombreEmpleado);
// Haciendo esta impresión, indirectamente se invocan todos los métodos involucrados, primero el método SalarioFinal
// y se proveen parámetros que son proporcionados en este mismo método(IngresarDatos) desde donde se hace la impresión
// El método SalarioFinal hace una invocación de los métodos SalarioSinExtras y SalarioConExtras, de esta forma se separan
// Las tareas y se intercambian los resultados entre los 5 métodos creados
// La ventaja es que solo con invocar el método IngresarDatos desde el método principal ya operan todos
        System.out.println("El Salario final del Empleado es : " + formato.format(SalarioFinal(diasTrabajados, salarioDiario, totalHorasExtras)));
    }
//Método para  Calcular el salario sin extras
    public static double SalarioSinExtras(int diasTrabajados, double salarioDiario) {
        double salarioD;
        salarioD = diasTrabajados * salarioDiario;
        return salarioD;
    }
//Método para  Calcular el salario con extras
    public static double SalarioConExtras(double salarioDiario, int totalHorasExtras) {
        double salarioE;
        salarioE = salarioDiario * 0.10 * totalHorasExtras;
        return salarioE;
    }
//Método para  Calcular el Salario Final 
    public static double SalarioFinal(int diasTrabajados, double salarioDiario, int totalHorasExtras) {
        double salarioF;
        salarioF = SalarioSinExtras(diasTrabajados, salarioDiario) + SalarioConExtras(salarioDiario, totalHorasExtras);
        return salarioF;
    }
}
