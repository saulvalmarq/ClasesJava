/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.util.Scanner;
import persistencia.Departamentos;


/**
 *
 * @author Saúl Valencia
 */
public class MenuMantoDepartamentos {

    private static String codDepto;
// Método Principal

    public static void main(String[] args) {
// Instancias de la clase principal y secundaria   
 //Implementamos la logica para probar los metodos
        mantenimiento.MantenimientoDepartamentosJpa m = new mantenimiento.MantenimientoDepartamentosJpa();
        Departamentos d = new Departamentos();
        persistencia.Departamentos depto = new persistencia.Departamentos();
// Usando la Clase Scanner
        Scanner sc2 = new Scanner(System.in);
        int flag = 0; // Salida de circulación
        while (flag == 0) {

            System.out.println("-----Menu Mantenimiento Departamentos--------");
            System.out.println("1 -Adicionar Departamento(C)");
            System.out.println("2 -Consultar Departamento(R)");
            System.out.println("3 -Modificar Departamento(U)");
            System.out.println("4 -Eliminar  Departamento(D)");
            System.out.println("5 -Consultar Todos los Departamentos");
            System.out.println("6 -Salir");
            System.out.println("Ingrese el número de la Opción Seleccionada:");

            switch (sc2.nextInt()) {
                case 1:
                    System.out.println("");
                    m.guardarDepartamento(depto);
                    System.out.println("");
                    System.out.println("------- Fin de Guardar ------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    m.consultarDepartamento(codDepto);
                    System.out.println("");
                    System.out.println("------- Fin de Consultar ------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    m.modificarDepartamento(codDepto);
                    System.out.println("");
                    System.out.println("------- Fin de Modificar ------------");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    m.eliminarDepartamento(codDepto);
                    System.out.println("");
                    System.out.println("------- Fin de Eliminar ------------");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    m.consultarTodosDepartamentos();
                    System.out.println("");
                    System.out.println("------- Fin de Consultar ------------");
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
