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
public class Vendedor {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("$#,###.##");

        System.out.println("Ingrese el Nombre del Vendedor:");
        String nombreVendedor = lector.nextLine();

        System.out.println("Ingrese el Salario Base:");
        double salarioBase = lector.nextDouble();

        System.out.println("Ingrese Comision por Computadora Vendida:");
        double comision = lector.nextDouble();

        System.out.println("Ingrese el Total de Computadoras Vendidas en el mes:");
        double totalcomputadorasVendidas = lector.nextDouble();

        System.out.println("El nombre del empleado es        : " + nombreVendedor);
        System.out.println("El salario final del empleado es : " + formato.format(Vendedor.salarioFinal(salarioBase, comision, totalcomputadorasVendidas)));
        System.out.println("La Retención de Renta es         : " + formato.format(Vendedor.descuentoRenta(salarioBase, comision, totalcomputadorasVendidas)));
    }

    public static double descuentoRenta(double salarioBase, double comision, double totalcomputadorasVendidas) {
        double retencionRenta;
        retencionRenta = (salarioBase + (comision * totalcomputadorasVendidas)) * 0.10;
        return retencionRenta;
    }

    public static double salarioFinal(double salarioBase, double comision, double totalcomputadorasVendidas) {
        double salarioDevengado;
        salarioDevengado = (salarioBase + (comision * totalcomputadorasVendidas)) * (1 - 0.10);
        return salarioDevengado;
    }
    

}
