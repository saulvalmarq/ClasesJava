/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.util.Scanner;
import persistencia.Trabajador;

/**
 *
 * @author Saúl Valencia
 */
public class MenuMantoTrabajador {

    private static String nit;
      // Declarando el Método Principal
    public static void main(String[] args) {
// Instancias de la clase principal y secundaria   
        MantenimientoTrabajador mantenimiento = new MantenimientoTrabajador();
        Trabajador trabajador = new Trabajador();
// Usando la Clase Scanner
        Scanner sc2 = new Scanner(System.in);
        int flag = 0; // Salida de circulación
        while (flag == 0) {

            System.out.println("-----Menu Mantenimiento Trabajadores--------");
            System.out.println("1 -Adicionar Trabajador(C)");
            System.out.println("2 -Consultar Trabajador(R)");
            System.out.println("3 -Modificar Trabajador(U)");
            System.out.println("4 -Eliminar  Trabajador(D)");
            System.out.println("5 -Salir");
            System.out.println("Ingrese el número de la Opción Seleccionada:");

            switch (sc2.nextInt()) {
                case 1:
                    System.out.println("");
                    mantenimiento.guardarTrabajador(trabajador);
                    System.out.println("");
                    System.out.println("------- Fin de Guardar ------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    mantenimiento.consultarTrabajador(nit);
                    System.out.println("");
                    System.out.println("------- Fin de Consultar ------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    mantenimiento.modificarTrabajador(nit);
                    System.out.println("");
                    System.out.println("------- Fin de Modificar ------------");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    mantenimiento.eliminarTrabajador(nit);
                    System.out.println("");
                    System.out.println("------- Fin de Eliminar ------------");
                    System.out.println("");
                    break;
                case 5:
                    flag = 1;
                    break;
                default:
                    break;
            }
        }
    }  
}
