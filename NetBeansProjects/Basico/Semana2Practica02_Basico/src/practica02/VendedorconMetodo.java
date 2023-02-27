/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author Saúl Valencia
 */
public class VendedorconMetodo {
    public static void main(String[] args) {
        double comisionPorMes = pagoComision (12000.00, 0.02);
        System.out.println("Excel Ventas, pago de Comisiones " );
        System.out.println("Comisión por venta de Carros del 2% " );
        System.out.println("Para el Vendedor, la Comisión del mes es de : $ " + comisionPorMes);        
    }
    
    public static double pagoComision(double precioCarro, double comision) {
        double calculoComision;
        int carrosPorMes = 15;
        calculoComision = precioCarro * comision * carrosPorMes;
        return calculoComision;
    }
}
