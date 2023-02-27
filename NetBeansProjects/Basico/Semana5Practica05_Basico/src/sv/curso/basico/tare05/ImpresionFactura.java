/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tare05;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */

//Dando herencia a la clase Impresion Factura
public class ImpresionFactura extends FacturaElectrica {
// Creando instancias de la Clase NumberFormat para formatiar datos       
    NumberFormat formato = new DecimalFormat(" #,###.##");
    NumberFormat dolar = new DecimalFormat("$ #,###.##");

// Imprimiendo todos los datos   
    public void ImprimirFactura() {
        System.out.println("Cálculos del Valor de la Factura Electrica:\n");
        System.out.println("Datos del Abonado:");
        System.out.println("No Cuenta                   : " + getNoCuenta());
        System.out.println("Lectura Actual del Medidor  : " + getLecturaActual());
        System.out.println("Lectura Anterior del Medidor: " + getLecturaAnterior());
        System.out.println("Multiplicador               : " + getMultiplicador());
        System.out.println("Días de Facturación         : " + getDiasDeFacturacion());
// Imprimiendo Consumos y el Valor de la Factura  
        System.out.println("Consumo Mensual             : " + (getConsumoMensual()));
        System.out.println("Consumo Diario              : " + formato.format(getConsumoDiario()));
        System.out.println("Valor de la Factura         : " + dolar.format(getValorFactura()));
    }
}
