/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author Saúl Valencia
 */
public class EmpleadoAlbanil {

    // Creando Metodo Principal
    public static void main(String[] args) {
        // Definiendo variable y asignando valores
        double salario = SalarioNominal(10.0, 30.0);
        double pagoExtra = SalarioHorasExtras(10.0, 50.0);
        double renta = descuentoRenta(salario, pagoExtra);
        double salarioMes = salarioPorMes(salario, pagoExtra, renta);
        
        // Imprimiendo Resultados
        System.out.println("Cálculo de Salario con Descuentos Empresa de Construcción \n");
        System.out.println("Salario Nominal               : $ " + salario);
        System.out.println("Pago Mensual por Horas Extras : $ " + pagoExtra);
        System.out.println("Descuento de Renta            : $ " + renta);
        System.out.println("Salario del Mes               : $ " + salarioMes);
    }

    public static double SalarioNominal(double pagoDiario, double diasTrabajados) {
        double salario;
        salario = pagoDiario * diasTrabajados;
        return salario;
    }

    public static double SalarioHorasExtras(double pagoDiario, double numeroHorasExtras) {
        double pagoExtra;
        pagoExtra = pagoDiario * 0.10 * numeroHorasExtras;
        return pagoExtra;
    }

    public static double descuentoRenta(double salarioNominal, double salarioHorasExtras) {
        double renta;
        renta = (salarioNominal + salarioHorasExtras) * 0.10;
        return renta;
    }

    public static double salarioPorMes(double salarioNominal, double salarioHorasExtras, double descuentoRenta) {
        double salarioMes;
        salarioMes = salarioNominal + salarioHorasExtras - descuentoRenta;
        return salarioMes;
    }
}
