/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

/**
 *
 * @author Saúl Valencia
 */
public class DocenteUniversitario {

    public static void main(String[] args) {
        double pagoPorHora = 8.00;
        int horasClase = 36;
        double salarioNominal = pagoPorHora * horasClase;
        double descuentoRenta = salarioNominal * 0.10;
        double salarioMensual = salarioNominal - descuentoRenta;

        System.out.println("Cálculo de Salario Universitario");
        System.out.println("Para un Docente que gana por hora                  : $" + pagoPorHora);
        System.out.println("Y que ha trabajado la siguiente cantidad de horas  : " + horasClase);
        System.out.println("El Salario del Docente ya con Descuento de Renta es: $" + salarioMensual);

    }
}
