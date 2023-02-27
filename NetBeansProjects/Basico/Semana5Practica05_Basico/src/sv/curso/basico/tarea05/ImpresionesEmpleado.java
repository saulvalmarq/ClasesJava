/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea05;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */

//Dando herencia a la clase Impresiones
public class ImpresionesEmpleado extends Empleado {
// Creando instancia de la Clase NumberFormat para formatiar datos 
    NumberFormat dolar = new DecimalFormat("$ #,###.##");
    
// Metodo solicitado para imprimir nombre completo
    public void ImprimirNombreEmpleado() {
        System.out.println("Cálculo de Descuentos de:");
        System.out.println("Nombre Completo      : " + getNombres() + " " + getApellidos());
    }

// Imprimiendo datos   
    public void Imprimir() {
        
        System.out.println("No Nit               : " + getNoNit());
        System.out.println("Apellidos            : " + getApellidos());
        System.out.println("Nombres              : " + getNombres());
        System.out.println("Direccion            : " + getDireccion());
        System.out.println("Bandera (Estado)     : " + getBandera());
        System.out.println("Salario Devengado    : " + dolar.format(getSalarioDevengado()));
    }
}
