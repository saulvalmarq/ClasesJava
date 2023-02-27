/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea05;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaEmpleado {
// Metodo main

    
    
    public static void main(String[] args) {
// Declarando instancia de la clase Impresiones
        ImpresionesEmpleado imp = new ImpresionesEmpleado();
// Asignando datos
        imp.setNoNit("06143010901108");
        imp.setApellidos("Perez Lopez");
        imp.setNombres("Jose Antonio");
        imp.setDireccion("Colonia Futura, Calle Delfin, Polígono F, Casa # 34, San Salvador");
        imp.setBandera("Activo");
        imp.setSalarioDevengado(900.00);

// Imprimiendo nombre completo
        imp.ImprimirNombreEmpleado();
// Imprimiendo linea en blanco        
        System.out.println("");
// Imprimiendo los datos       
        imp.Imprimir();
        imp.descuento();
    }
}
