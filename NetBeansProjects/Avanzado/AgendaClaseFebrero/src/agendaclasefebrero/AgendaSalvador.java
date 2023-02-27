/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaclasefebrero;

import agendasalvador.Agenda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class AgendaSalvador {

    public static void main(String[] args) {
        AgendaSalvador a = new AgendaSalvador();
        a.guardarDatos();
    }

    public void guardarDatos() {
        HashMap<String, Agenda> datos = new HashMap<String, Agenda>();

        Scanner lector = new Scanner(System.in);
        System.out.println("digite dui:");
        String noDui = lector.nextLine();
        System.out.println("digite nombre ");
        String nombre = lector.nextLine();
        System.out.println("digite telefono");
        String telefono = lector.nextLine();
        System.out.println("digite salario");
        double Salario = lector.nextDouble();

        datos.add(noDui, new Agenda(noDui, nombre, telefono, Salario));
        
         Iterator it = datos.iterator();
        while (it.hasNext()){
            Agenda a = (Agenda) it.next();
        
        System.out.print("Consulta de un solo contacto \n");
        Agenda x = datos.get(noDui);
            System.out.print("No Dui:" + a.noDui);
            System.out.print("  Nombre:" + a.nombre);
            System.out.println("  Telefono:" + a.telefono);
            System.out.println("Salario" + Salario);
        }
         System.out.print("Consulta de todos los contactos de la agenda \n");
        for (Agenda a : datos.values()) {
            System.out.print("No Dui:" + noDui);
            System.out.print("  Nombre:" + nombre);
            System.out.println("  Telefono:" + telefono);
            System.out.println("Salario" + Salario);
        }
        }
    

    class Agenda2 {

        String noDui;
        String nombre;
        String telefono;
        double Salario;

        public Agenda2(String noDui, String nombre, String telefono, double Salario) {
            this.noDui = noDui;
            this.nombre = nombre;
            this.telefono = telefono;
            this.Salario = Salario;
        }

    
    }

}