/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea05SH;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaFacturaElectrica {

    public static void main(String[] args) {


// Creando la Instancia de la clase FacturaElectrica
        FacturaElectrica factura = new FacturaElectrica();

// Asignando datos  
        factura.setNoCuenta("NIC 22277184");
        factura.setLecturaActual(3025);
        factura.setLecturaAnterior(2010);
        factura.setMultiplicador(10);
        factura.setDiasDeFacturacion(30);
        factura.setConsumoMensual(0.0);
        factura.setConsumoDiario(0.0);
        factura.setValorFactura(0.0);

// Imprimiendo Todos los Datos
        factura.ImprimirDatos();
    }
}
