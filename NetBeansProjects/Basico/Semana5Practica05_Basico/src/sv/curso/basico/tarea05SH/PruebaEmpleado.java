/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea05SH;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaEmpleado {
// Metodo main

    public static void main(String[] args) {

// Instancia de la clase Empleado
        Empleado emp = new Empleado();

// Asignando datos        
        emp.setNoNit("06143010901108");
        emp.setApellidos("Perez Lopez");
        emp.setNombres("Jose Antonio");
        emp.setDireccion("Colonia Futura, Calle Delfin, Polígono F, Casa # 34, San Salvador");
        emp.setSalarioDevengado(900.00);
        emp.setSalarioConDescuento(0.0);
        emp.setBandera("Activo");

// Imprimiendo nombre completo        
        emp.ImprimirNombreEmpleado();
// Imprimiendo todos los Datos       
        emp.ImprimirEmpleado();

    }
}
