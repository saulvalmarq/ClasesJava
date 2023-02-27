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
public class Prac3Ejer6SaldoBanco {
// Método Principal
    public static void main(String[] args) {
// Invocando el método para iniciar la cadena de procesos
        IngresoDatos();
    }
// Método para Ingreso de Datos
    public static void IngresoDatos() {
        Scanner lector = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("$ #,###.##");

        System.out.println("Ingrese el Nombre del Cliente:");
        String nombreCliente = lector.nextLine();

        System.out.println("Ingrese la Cantidad a depositar(Monto Invertido): ");
        double deposito = lector.nextDouble();
// Impresiones Solicitadas
        System.out.println("El Nombre del Cliente es             : " + nombreCliente);
        System.out.println("El monto invertido fue de            : " + deposito);
// Impresiones invocando los diferentes métodos involucrados
        System.out.println("La Ganancia Obtenida sin descuento es: " + formato.format(GananciaSemestral(deposito)));
        System.out.println("La Ganancia Obtenida con descuento es: " + formato.format(GananciaSemestral(deposito) - RetencionRenta(deposito)));
        System.out.println("El Saldo de la Cuenta es de          : " + formato.format(SaldoCuenta(deposito)));
    }

    public static double GananciaSemestral(double deposito) {
        double gananciaS = deposito * (0.01125);
        return gananciaS;
    }

    public static double RetencionRenta(double deposito) {
        double retencion = GananciaSemestral(deposito) * 0.10;
        return retencion;
    }

    public static double SaldoCuenta(double deposito) {
        double saldoCuenta = deposito + GananciaSemestral(deposito) - RetencionRenta(deposito);
        return saldoCuenta;
    }
}
