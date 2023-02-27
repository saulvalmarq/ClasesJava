/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class Menu {
    public static void main(String[] args) {
    
    String flag = "Si";

    while(flag.equalsIgnoreCase("Si")){
        System.out.println("Menu Agenda Electronica");
        System.out.println("1 -Adicionar Nueva Persona");
        System.out.println("2 -Consultar Persona");
        System.out.println("3 -Eliminar Persona");
        System.out.println("4 -Guardar Información en Archivo");
        System.out.println("5 -Salir");
        
    Scanner lector = new Scanner(System.in);
    String opcion = lector.next();
    
    switch (opcion) {
        case "1":
            System.out.println("Guardando datos...");
        break;
        case "2":
            System.out.println("Consultando datos...");
        break;
        case "3":
            System.out.println("Eliminando datos...");
        break;
        case "4":
            System.out.println("Enviando datos a Archivo...");
        break;
        case "5" :
            System.out.println("Saliendo");
        break;
    }

        System.out.println("Desea Continuar? Si - No");
        flag = lector.next();
    }
        
        System.out.println("Saliendo del Menú...");           
    }
}
