package sv.curso.basico.tar05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Saúl Valencia
 */
//Dando herencia a la clase Impresiones
public class ImpresionesEmpleado extends Empleado {

// Metodo solicitado para imprimir nombre completo
    public void ImprimirNombreEmpleado() {
        System.out.println("Nombre Completo del Contribuyente : " + getNombres() + " " + getApellidos());
    }

// Imprimiendo todos los datos   
    public void Imprimir() {
        System.out.println("No Nit               : " + getNoNit());
        System.out.println("Apellidos            : " + getApellidos());
        System.out.println("Nombres              : " + getNombres());
        System.out.println("Direccion            : " + getDireccion());
        System.out.println("Bandera (Estado)     : " + getBandera());

// Imprimiendo Salarios   
        System.out.println("Salario Devengado    : " + getSalarioDevengado());
        System.out.println("Salario con Descuento: " + getSalarioConDescuento());
    }
}
