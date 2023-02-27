/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea06;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class CompuSmart {
    public static void main(String[] args) {
        NumberFormat dolar = new DecimalFormat("$ #,###.##");
        System.out.println("Cálculo de Salario Vendedor Compu Smart \n");
        JOptionPane.showMessageDialog(null, "Cálculo de Salario Vendedor Compu Smart");
        String venta = JOptionPane.showInputDialog(null, "Ingrese la Venta Mensual del Vendedor:");
        double ventaMensual = Double.parseDouble(venta);
    
        if (ventaMensual>=1 && ventaMensual<=999){
            double salarioLiquido = (300 + (ventaMensual* 0.05)) * (1-0.10);
            System.out.println("El Salario Liquido del Vendedor es : " + dolar.format(salarioLiquido));
            JOptionPane.showMessageDialog(null, "El Salario Liquido del Vendedor es : " + dolar.format(salarioLiquido));
        } else if (ventaMensual>=1000 && ventaMensual<=2999){
            double salarioLiquido = (300 + (ventaMensual* 0.08)) * (1-0.10);
            System.out.println("El Salario Liquido del Vendedor es : " + dolar.format(salarioLiquido));
            JOptionPane.showMessageDialog(null, "El Salario Liquido del Vendedor es : " + dolar.format(salarioLiquido));
        } else if (ventaMensual>=3000){
            double salarioLiquido = (300 + (ventaMensual* 0.10)) * (1-0.10);
            System.out.println("El Salario Liquido del Vendedor es : " + dolar.format(salarioLiquido));
            JOptionPane.showMessageDialog(null, "El Salario Liquido del Vendedor es : " + dolar.format(salarioLiquido));
        } else {
            System.out.println("Entrada Incorrecta....");
            System.out.println("El rango de Ventas es de 1 dolar en adelante...");
            JOptionPane.showMessageDialog(null, "El rango de Ventas es de 1 dolar en adelante...");
            
        }
    }     
}
