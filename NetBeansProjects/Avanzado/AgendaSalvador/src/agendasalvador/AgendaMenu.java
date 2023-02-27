/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendasalvador;

import java.util.HashMap;
import java.util.Scanner;

public class AgendaMenu {

    public static void main(String[] args) {

       
        HashMap<String, Agenda> datos = new HashMap<String, Agenda>();
          String opcion = "";


        System.out.println("""
                                 digite el tipo de operacion:
                                 1 - consultar contacto;
                                 2 - agregar contacto;
                                 3 - eliminar contacto""");

        int opc;
        opc = Integer.parseInt(opcion);

        if (opc == 1) {
            datos.put("12456", new Agenda(" 123456", " karla mirtanda", "22405050", 700.00));
        }

        for (Agenda a : datos.values()) {
            System.out.print("No Dui:" + a.noDui);
            System.out.print("  Nombre:" + a.nombre);
            System.out.println("  Telefono:" + a.telefono);
            System.out.println("Salario: " + a.salario);
        }
        if (opc == 2) {
            Scanner lector = new Scanner(System.in);
            System.out.println("ingresa DUI:");
            String noDUI = lector.nextLine();
            System.out.println("ingresa el NOMBRE:");
            String NOMBRE = lector.nextLine();
            System.out.println("ingresa TELEFONO:");
            String TELEFONO = lector.nextLine();
            System.out.println("ingresa el SALARIO:");
            double SALARIO = lector.nextDouble();
            System.out.println("EL CONTACTO AH SIDO AGREGADO EXITOSAMENTE");
            System.out.println("NUMERO DUI INGRESADO" + noDUI);
            System.out.println("NOMBRE INGRESADO" + NOMBRE);
            System.out.println("TELEFONO INGRESADO" + TELEFONO);
            System.out.println("SALARIO INGREADO" + SALARIO);
            System.out.println("_______________");

        } else if (opc == 3) {
            System.out.println("EL CONTACTO HA SIDO ELIMINADO");

        }

    }

}
