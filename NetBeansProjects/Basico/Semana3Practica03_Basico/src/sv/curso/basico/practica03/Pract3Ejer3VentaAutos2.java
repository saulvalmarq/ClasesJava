/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Saúl Valencia
 */
public class Pract3Ejer3VentaAutos2 {
// Método para ingresar número de autos y monto de la venta del mes
// Y calcular las comisiones respectivas 
    public static double IngresoAutosVentas(int numeroAutos, double ventaDelMes) {
        String nombre = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {  // try catch manejador de errores
            System.out.println("Ingrese el nombre del Vendedor: ");
            nombre = in.readLine();
                        
            System.out.println("Digite el total de autos vendidos en el mes: ");
            String autos = in.readLine();
            numeroAutos = Integer.parseInt(autos);
            
            System.out.println("Digite el Monto de la Venta del Mes: ");
            String venta = in.readLine();
            ventaDelMes = Double.parseDouble(venta);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al introducir datos desde teclado…");
            System.out.println(e.getMessage());
        }
        double comision1 = 170.00 * numeroAutos;
        double comision2 = 0.05 * ventaDelMes;
        double comisiones = comision1 + comision2;

        System.out.println("");
        System.out.println("El nombre del Vendedor es: "+ nombre);
        System.out.println("El total de Autos Vendidos fue de: " + numeroAutos);
        System.out.println("El Monto de la Venta del Mes fue de: " + ventaDelMes);
        return comisiones;
    }
// Método para calcular el salario 
    public static double calculoSalario(double comisiones) {
        double salario = 800.00, salarioFinal;
        salarioFinal = salario + comisiones;
        System.out.println("El Salario Devengado del Vendedor es de:" + salarioFinal);
    return salarioFinal;
    }

       public static void main(String[] args) {
// Se invoca el método para calcular el salario obtenido colocando
// como parámetro la suma retornada del metodo IngresoAutosVentas
           calculoSalario(IngresoAutosVentas(0,0));
    }
}