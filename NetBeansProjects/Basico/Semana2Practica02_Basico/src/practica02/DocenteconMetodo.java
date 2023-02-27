/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
  * @author Saúl Valencia
 */
public class DocenteconMetodo {
    public static void main(String[] args) {
        double salarioMensual = DescuentoRenta(8.0, 36);
        System.out.println("Calculo de Salario Docente Universitario");
        System.out.println("El Salario del Docente ya con Descuento de Renta es: $ " + salarioMensual);
        
    }
    
        public static double DescuentoRenta(double salarioPorHora, int horasPorMes) {
        double salarioMensual;
        salarioMensual = horasPorMes * salarioPorHora * (1 - 0.10);
        return salarioMensual;
    }
}
