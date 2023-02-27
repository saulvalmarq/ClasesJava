/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

/**
 *
 * @author Saúl Valencia
 */
public class VendedorCarros {

    public static void main(String[] args) {
        int carrosVendidosPorMes = 15;
        double comisionPorCarro = 12000.00 * 0.02;
        double comisionDelMes = carrosVendidosPorMes * comisionPorCarro;
        System.out.println("Excel Ventas, pago de Comisiones ");
        System.out.println("Comisión por Venta de Carros del 2% ");
        System.out.println("Para el Vendedor, la Comisión del mes es de : $ " + comisionDelMes);
    }
}
