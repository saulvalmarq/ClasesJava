/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.text.ParseException;
import java.util.Scanner;
import persistencia.Contribuyente;


/**
 *
 * @author Saúl Valencia
 */
public class MenuMantoContribuyente {

    private static String nit;
// Método Principal
    public static void main(String[] args) throws ParseException {
// Instancias de la clase principal y secundaria   
        MantenimientoContribuyente mantenimiento = new MantenimientoContribuyente();
        Contribuyente contribuyente = new Contribuyente();
// Usando la Clase Scanner
        Scanner sc2 = new Scanner(System.in);
        int flag = 0; // Salida de circulación
        while (flag == 0) {

            System.out.println("-----Menu Mantenimiento Contribuyente--------");
            System.out.println("1 -Adicionar Contribuyente(C)");
            System.out.println("2 -Consultar Contribuyente(R)");
            System.out.println("3 -Modificar Contribuyente(U)");
            System.out.println("4 -Eliminar  Contribuyente (D)");
            System.out.println("5 -Consultar Todos los Contribuyentes");
            System.out.println("6 -Salir");
            System.out.println("Ingrese el número de la Opción Seleccionada:");

            switch (sc2.nextInt()) {
                case 1:
                    System.out.println("");
                    mantenimiento.guardarContribuyente(contribuyente);
                    System.out.println("");
                    System.out.println("------- Fin de Guardar ------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    mantenimiento.consultarContribuyente(nit);
                    System.out.println("");
                    System.out.println("------- Fin de Consultar ------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    mantenimiento.modificarContribuyente(nit);
                    System.out.println("");
                    System.out.println("------- Fin de Modificar ------------");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    mantenimiento.eliminarContribuyente(nit);
                    System.out.println("");
                    System.out.println("------- Fin de Eliminar ------------");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    mantenimiento.consultarTodosContribuyentes();
                    System.out.println("");
                    System.out.println("------- Fin de Consultar Todos ------------");
                    System.out.println("");
                    break;    
                case 6:
                    flag = 1;
                    break;
                default:
                    break;
            }
        }
    }  
}
