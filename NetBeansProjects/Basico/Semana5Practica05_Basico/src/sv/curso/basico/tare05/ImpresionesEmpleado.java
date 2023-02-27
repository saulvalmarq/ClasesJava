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

//Dando herencia a la clase Impresiones
public class ImpresionesEmpleado extends Empleado {
    NumberFormat dolar = new DecimalFormat("$ #,###.##");

// Metodo solicitado para imprimir nombre completo
    public void ImprimirNombreEmpleado() {
        System.out.println("Cálculo de Descuentos de:");
        System.out.println("Nombre Completo      : " + getNombres() + " " + getApellidos());
    }

// Imprimiendo todos los datos   
    public void Imprimir() {
        
        System.out.println("No Nit               : " + getNoNit());
        System.out.println("Apellidos            : " + getApellidos());
        System.out.println("Nombres              : " + getNombres());
        System.out.println("Direccion            : " + getDireccion());
        System.out.println("Bandera (Estado)     : " + getBandera());
// Imprimiendo Salarios   
        System.out.println("Salario Devengado    : " + dolar.format(getSalarioDevengado()));
        System.out.println("Salario con Descuento: " + dolar.format(getSalarioConDescuento()));
    }
}
