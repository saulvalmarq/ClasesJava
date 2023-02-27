/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Saúl Valencia
 */
public class Pract3Ejer3VentaAutos {

    public static void main(String[] args) {
// Se invoca el método Impresiones con valores cero
        Impresiones(0, 0);
    }
// Método para Ingresar el nombre del vendedor
    public static String IngresaNombre(String nombre) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {  // try catch es un manejador de errores que posteriormente estudiaremos
            System.out.println("Ingrese el nombre del Vendedor: ");
            nombre = in.readLine();

        } catch (Exception e) {
            System.out.println("Error al introducir datos desde teclado…");
            System.out.println(e.getMessage());
        }
        return nombre;
    }
// Método para Ingresar el Número de Autos Vendidos
    public static int IngresaAutos(int numeroAutos) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {  // try catch es un manejador de errores que posteriormente estudiaremos
            System.out.println("Digite el total de autos vendidos en el mes: ");
            String autos = in.readLine();
            numeroAutos = Integer.parseInt(autos);

        } catch (Exception e) {
            System.out.println("Error al introducir datos desde teclado…");
            System.out.println(e.getMessage());
        }
        System.out.println("El total de Autos Vendidos fue de: " + numeroAutos);
        return numeroAutos;
    }
// Método para Ingresar el Monto del Total de Ventas del Mes
    public static double IngresaVentas(double ventaDelMes) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {  // try catch es un manejador de errores que posteriormente estudiaremos
            System.out.println("Digite el Monto de la Venta del Mes: ");
            String venta = in.readLine();
            ventaDelMes = Double.parseDouble(venta);

        } catch (Exception e) {
            System.out.println("Error al introducir datos desde teclado…");
            System.out.println(e.getMessage());
        }
        System.out.println("El Monto de la Venta del Mes fue de: " + ventaDelMes);
        return ventaDelMes;
    }
// Método para Calcular la primera comisión por venta de autos
    public static double comision1() {
        double comision1 = 170.00 * IngresaAutos(0);
        return comision1;
    }
// Método para Calcular la segunda comisión por Monto de Ventas
    public static double comision2() {
        double comision2 = 0.05 * IngresaVentas(0);
        return comision2;
    }
// Método para Calcular el Salario del Vendedor
    public static double calculoSalario(double com1, double com2) {
        double salario = 800.00, salarioFinal;
        salarioFinal = salario + comision1() + comision2();
        return salarioFinal;
    }
// Método para Imprimir los Resultados
    public static void Impresiones(int numeroAutos, double ventaDelMes) {
        System.out.println("El nombre del Vendedor es: " + IngresaNombre(null));
        System.out.println("El Salario Devengado del Vendedor es de: " + calculoSalario(0, 0));
    }
}
