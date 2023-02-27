/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.tareados;


//import java.io.DataOutputStream;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Saúl Valencia
 */
public class ProcesosAgenda {
// Uso de HashMap como fue solicitado
    HashMap<String, DatosAgenda> datos = new HashMap<String, DatosAgenda>();

// Método para agregar Personas en la Agenda
    public void agregarPersona() {
// Usando la Clase Scanner como fue solicitado 
        Scanner dato = new Scanner(System.in);
        System.out.println("------ Agregar a Agenda Electrónica ------");

        System.out.println("Numero de Dui:");
        String noDui = dato.nextLine();

        System.out.println("Teléfono:");
        String telefono = dato.nextLine();

        System.out.println("Nombre:");
        String nombre = dato.nextLine();

        System.out.println("Salario：");
        Double salario = dato.nextDouble();

        DatosAgenda d = new DatosAgenda(noDui, telefono, nombre, salario);

        if (datos.containsKey(noDui)) {
            System.out.println("No se puede introducir datos. Número de Dui repetido.");
            System.out.println("------------------------- \n");
        } else {
            datos.put(noDui, d);

            System.out.println("Agregado correctamente");
            System.out.println("------------------------- \n");
        }
    }
    
// Método para consultar Personas en la Agenda
    public void consultarPersona() {
        Scanner mostrar = new Scanner(System.in);
        System.out.println("------ Búsqueda en la Agenda Electrónica ------");
        System.out.println("Ingrese el numero de Dui:");
        String noDui = mostrar.nextLine();
        if (datos.containsKey(noDui)) {
            System.out.println(datos.get(noDui) + "Datos:" + datos.keySet());
        } else {
            System.out.println("Número de Dui: " + noDui + " no Existe");
            System.out.println("------------------------- \n");
        }
    }

// Método para eliminar Personas de la Agenda
    public void eliminarPersona() {
        Scanner dato1 = new Scanner(System.in);
        System.out.println("------ Eliminar de Agenda Electrónica ------");
        System.out.println("Numero de Dui:");
        String noDui = dato1.next();
        if (datos.containsKey(noDui)) {
            datos.remove(noDui);
            System.out.println("Persona Eliminada de la Agenda");
            System.out.println("------------------------- \n");
        } else {
            System.out.println("No hay ninguna Persona con ese número de Dui");
            System.out.println("------------------------- \n");
        }
    }
    public void mostrarAgenda(){
//        Scanner mostrar = new Scanner(System.in);
        System.out.println("------ Mostrar Todas las Personas de la Agenda Electrónica ------");
        //System.out.println(datos);
        System.out.println(Collections.singletonList(datos));
    }    
//    public void archivarAgenda(){
//        try {
//// Abrimos el archivo para guardar informacion
//        Gson gson = new Gson();
//        String json = gson.toJson(cliente);
//        try {
//            try (//Escribimos en el archivo de json
//                FileWriter Filewriter = new FileWriter("/home/levita/Documents/edutech/ArchivoGSON.json", true)) {
//                Filewriter.write("[");
//                Filewriter.write(json);
//                Filewriter.write("]");
//                Filewriter.write("\r\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//            FileOutputStream fstream = new FileOutputStream("/home/levita/Documents/edutech/archivos/insaforp/ArchivoBinario.dat", true);
//            try ( DataOutputStream archivoSalida = new DataOutputStream(fstream)) {
//                System.out.println("Escribiendo datos en el archivo binario");
//                archivoSalida.writeUTF(noDui);
//                archivoSalida.writeUTF(telefono);
//                archivoSalida.writeUTF(nombre);
//                archivoSalida.writeDouble(salario);
//            }
//
//            System.out.println("Se ha escrito datos en el archivo binario");
//        } catch (IOException e) {
//            System.out.println("Error al escribir");
//            e.getMessage();
//        }
//    }
}
//public void save1() throws Exception{
//		System.out.println ("Guardar ...");
//		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("contact1.txt"));
//		Iterator iter = hm.entrySet().iterator();
//		while (iter.hasNext()) {
//			Map.Entry entry = (Map.Entry) iter.next();
//			Contact val = (Contact) entry.getValue();
//			out.writeObject(val);
//		}
//		out.close();
//		System.out.println ("Guardar correctamente");
//	}