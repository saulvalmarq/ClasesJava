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
public class Prac3Ejer4VentaComputadoras {
     public static void main(String[] args) {
        double salarioBase = 300;
        double comision =50;
        IngresoDatos(salarioBase, comision); 
    }
// Método para calcular la retención de renta
    public static double descuentoRenta(double salarioBase, double comision, double totalcomputadorasVendidas) {
        double retencionRenta;
        retencionRenta = (salarioBase + (comision * totalcomputadorasVendidas)) * 0.10;
        return retencionRenta;
    }
// Método para calcular el salario con comisiones y descuento de renta
    public static double salarioFinal(double salarioBase, double comision, double totalcomputadorasVendidas) {
        double salarioDevengado;
        salarioDevengado = (salarioBase + (comision * totalcomputadorasVendidas)) * (1 - 0.10);
        return salarioDevengado;
    }
// Método para Ingresar datos e Imprimir resultados      
    public static void IngresoDatos(double salarioBase, double comision){
// Instanciando la clase Scanner para ingreso de datos
        Scanner lector = new Scanner(System.in);
// Instanciando la clase NumberFormat para formateo de datos
        NumberFormat formato = new DecimalFormat("$ #,###.##");
// Solicitando el nombre del Vendedor y guardandolo en la variable nombreVendedor 
        System.out.println("Ingrese el Nombre del Vendedor:");
        String nombreVendedor = lector.nextLine();
// Solicitando el total de computadoras vendidas y guardando en la variable totalcomputadorasVendidas
        System.out.println("Ingrese el Total de Computadoras Vendidas en el mes:");
        Integer totalcomputadorasVendidas = lector.nextInt();
// Imprimiendo el nombre del vendedor y el total de computadoras        
        System.out.println("El nombre del empleado es        : " + nombreVendedor);
        System.out.println("Total de Computadores Vendidas   : "+ totalcomputadorasVendidas);
// Al solicitar impresion de los resultados del metodo salarioFinal automáticamente hago que se ejecute dicho método
// con los parámetros dados
        System.out.println("El salario final del empleado es : " + formato.format(salarioFinal(salarioBase, comision, totalcomputadorasVendidas)));
// Al solicitar impresion de los resultados del metodo descuentoRenta automáticamente hago que se ejecute dicho método
// con los parámetros dados
        System.out.println("La Retención de Renta es         : " + formato.format(descuentoRenta(salarioBase, comision, totalcomputadorasVendidas)));
    }
}
