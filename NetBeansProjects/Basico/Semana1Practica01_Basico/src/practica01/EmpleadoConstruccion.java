/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

/**
 *
 * @author Saúl Valencia
 */
public class EmpleadoConstruccion {

    public static void main(String[] args) {
        double salarioMensual = 300.00;
        int horasExtrasDelMes = 15;
        double pagoPorHoraExtra = 2.00;
        double salarioExtraPorMes = horasExtrasDelMes * pagoPorHoraExtra;
        double salarioTotal = salarioMensual + salarioExtraPorMes;

        System.out.println("Calculo de Salario en Construcción");
        System.out.println("Para un Salario Mensual de                : $ " + salarioMensual);
        System.out.println("Con la siguiente Cantidad de Horas Extras : " + horasExtrasDelMes);
        System.out.println("El Salario Total del Empleado es          : $ " + salarioTotal);

    }
}
