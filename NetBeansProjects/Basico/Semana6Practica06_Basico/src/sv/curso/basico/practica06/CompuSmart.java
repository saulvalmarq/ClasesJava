/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica06;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class CompuSmart {
// Metodo Principal      

    public static void main(String[] args) {
// Invocando Metodos para Obtener Resultados      
        Impresion();
        Rangos(0);
    }
// Metodo para Decisiones y Calculos

    public static void Rangos(double ventaMensual) {
        NumberFormat dolar = new DecimalFormat("$ #,###.##");
        int i = 1;
        while (i <= 5) { // Ciclo para el grupo de 5 Vendedores
// Entrada de Datos por Teclado                 
            String venta = JOptionPane.showInputDialog(null, "Ingrese la Venta Mensual del Vendedor: " + i);
            ventaMensual = Double.parseDouble(venta);
// Ciclo para evitar que metan valores negativos
            if (ventaMensual > 0) {
// Primer Rango
                if (ventaMensual >= 1 && ventaMensual <= 999) {
                    double salarioLiquido = (300 + (ventaMensual * 0.05)) * (1 - 0.10);
                    System.out.println("El Salario Liquido del Vendedor " + i + " es : " + dolar.format(salarioLiquido));
                    JOptionPane.showMessageDialog(null, "El Salario Liquido del Vendedor " + i + " es : " + dolar.format(salarioLiquido));
// Segundo Rango
                } else if (ventaMensual >= 1000 && ventaMensual <= 2999) {
                    double salarioLiquido = (300 + (ventaMensual * 0.08)) * (1 - 0.10);
                    System.out.println("El Salario Liquido del Vendedor " + i + " es : " + dolar.format(salarioLiquido));
                    JOptionPane.showMessageDialog(null, "El Salario Liquido del Vendedor " + i + " es : " + dolar.format(salarioLiquido));
// Tercer Rango
                } else if (ventaMensual >= 3000) {
                    double salarioLiquido = (300 + (ventaMensual * 0.10)) * (1 - 0.10);
                    System.out.println("El Salario Liquido del Vendedor " + i + " es : " + dolar.format(salarioLiquido));
                    JOptionPane.showMessageDialog(null, "El Salario Liquido del Vendedor " + i + " es : " + dolar.format(salarioLiquido));
                }
                i++;
            } else {
                System.out.println("Entrada Incorrecta....");
                System.out.println("El rango de Ventas es de 1 dolar en adelante...");
                JOptionPane.showMessageDialog(null, "El rango de Ventas es de 1 dolar en adelante...");
            }
        }
    }
// Metodo para encabezado de presentación

    public static void Impresion() {
        System.out.println("Cálculo de Salario Vendedor Compu Smart \n");
        JOptionPane.showMessageDialog(null, "Cálculo de Salario Vendedor Compu Smart");

    }
}
