/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaclasefebrero;


import java.util.HashMap;

/**
 *
 * @author Saúl Valencia
 */
public class AgendaClaseFebrero {


    public static void main(String[] args) {
        HashMap<String,Agenda> datos = new HashMap<String,Agenda>();
        
        datos.put("021000050",new Agenda("021000050", "Armando Hoyos", "22405050"));       
        datos.put("021000060",new Agenda("021000060", "Jose Perez", "78528090"));       
        datos.put("021000070", new Agenda("021000070", "Kevin Mong", "70205080"));       
        
        System.out.print("Datos de un solo contacto \n");
        Agenda x = datos.get("021000070");
            System.out.print("No Dui:" + x.noDui);
            System.out.print("  Nombre:" + x.nombre);
            System.out.println("  Telefono:" + x.telefono);
            
        System.out.print("Datos de toda la Agenda \n");    
        for (Agenda a : datos.values()){   
            System.out.print("No Dui:" + a.noDui);
            System.out.print("  Nombre:" + a.nombre);
            System.out.println("  Telefono:" + a.telefono);
        }
            
            
        }
    }


class Agenda{
    String noDui;
    String nombre;
    String telefono;

    public Agenda(String noDui, String nombre, String telefono) {
        this.noDui = noDui;
        this.nombre = nombre;
        this.telefono = telefono;
    }
        
}
