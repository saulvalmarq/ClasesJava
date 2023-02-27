/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

import java.util.Scanner;

/**
 *
 * @author Saul Valencia
 */
public class MenuPlanilla {
    // Clase Principal
    public static void main(String[] args) {
// Instancias de la clase principal y secundaria

        MantenimientoPlanillaSP manto = new MantenimientoPlanillaSP();
        Planilla planilla = new Planilla();
        
// Usando la Clase Scanner y el Menú solicitado
         Scanner sc2 = new Scanner(System.in);
        int flag = 0; // Salida de circulación
        while (flag == 0) {
        System.out.println("");
        System.out.println("------ MENU MANTENIMIENTO PLANILLA --------");
        System.out.println("1 -Insertar Información a Planilla");
        System.out.println("2 -Consultar Información de Planilla");
        System.out.println("3 -Modificar Información de Planilla");
        System.out.println("4 -Eliminar Información de Planilla");
        System.out.println("5 -Salir");
        System.out.println("Ingrese el número de la Opción Seleccionada:");   
         
            switch (sc2.nextInt()) {
                case 1:
                    System.out.println("");
                    manto.insertarPlanilla(planilla);
                    System.out.println("------- Fin de Insertar ------------");
                    break;
                case 2:
                    System.out.println("");
                    manto.consultarPlanilla();
                    System.out.println("------- Fin de Consultar ------------");
                    break;                    
                case 3:
               //     manto.modificarPlanilla(Planilla planilla, String tmpNombre, String tmpDir, Double tmpIngr, Double tmpImp);
                    System.out.println("------- Fin de Modificar ------------");
                    break;
                case 4:
                    System.out.println("");
                    manto.eliminarPlanilla(planilla);
                    System.out.println("------- Fin de Eliminar ------------");
                    break; 
                case 5:
                    flag = 1;
                    break;
                default:
            }
        }
    } 
}
