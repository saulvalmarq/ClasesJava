/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.tareados;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaAgenda {
// Declarando el Método Principal
    public static void main(String[] args) {
// Creando una instancia de la Clase ProcesosAgenda
        ProcesosAgenda per = new ProcesosAgenda();
// Usando la Clase Scanner como fue solicitado 
         Scanner sc1 = new Scanner(System.in);
        int flag = 0; // Salida de circulación
        while (flag == 0) {

        System.out.println("Menu Agenda Electronica");
        System.out.println("1 -Adicionar Nueva Persona");
        System.out.println("2 -Consultar Persona");
        System.out.println("3 -Eliminar Persona");
        System.out.println("4 -Mostrar Agenda");
        System.out.println("5 -Salir");
        System.out.println("Ingrese el número de la Opción Seleccionada:");   
         
            switch (sc1.nextInt()) {
                case 1:
                    per.agregarPersona();
                    break;
                case 2:
                    per.consultarPersona();
                    break;                    
                case 3:
                    per.eliminarPersona();
                    break;
                case 4:
                    per.mostrarAgenda();
                    break;
                case 5:
                //    per.archivarAgenda();
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
