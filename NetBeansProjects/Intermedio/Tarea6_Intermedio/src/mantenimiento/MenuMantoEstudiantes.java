/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.util.Scanner;
import persistencia.SvEstudiantes;

/**
 *
 * @author Saúl Valencia
 */
public class MenuMantoEstudiantes {

    // Declarando el Método Principal
    public static void main(String[] args) {
// Instancias de la clase principal y secundaria   
        MantenimientoEstudiantesJpa mantenimiento = new MantenimientoEstudiantesJpa();
        SvEstudiantes estudiante = new SvEstudiantes();
// Usando la Clase Scanner
        Scanner sc2 = new Scanner(System.in);
        int flag = 0; // Salida de circulación
        while (flag == 0) {

            System.out.println("-----Menu Mantenimiento Estudiantes--------");
            System.out.println("1 -Adicionar Estudiante(C)");
            System.out.println("2 -Consultar Estudiante(R)");
            System.out.println("3 -Modificar Estudiante(U)");
            System.out.println("4 -Eliminar  Estudiante(D)");
            System.out.println("5 -Salir");
            System.out.println("Ingrese el número de la Opción Seleccionada:");

            switch (sc2.nextInt()) {
                case 1:
                    System.out.println("");
                    mantenimiento.guardarEstudiante(estudiante);
                    System.out.println("");
                    System.out.println("------- Fin de Guardar ------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    mantenimiento.consultarEstudiante(estudiante.getCarnet());
                    System.out.println("");
                    System.out.println("------- Fin de Consultar ------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    mantenimiento.modificarEstudiante(estudiante.getCarnet(), estudiante.getTelefono());
                    System.out.println("");
                    System.out.println("------- Fin de Modificar ------------");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    mantenimiento.eliminarEstudiante(estudiante.getCarnet());
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