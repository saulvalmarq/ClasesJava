/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

// import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author Saúl Valencia
 */
public class EjemploHashTable {

    public static void main(String arg[]) {
        Hashtable<String, Estudiante > hashTable = new 
                                     Hashtable<String, Estudiante>();
//         HashMap<String, Estudiante > hashTable = new 
//                                     HashMap<String, Estudiante>();

    hashTable.put (
    "PP010100", new Estudiante("PP010100", "Perez", "Juan"));
    hashTable.put (
    "OO020210", new Estudiante("OO020210", "Ordimales", "Pedro"));
    hashTable.put (
    "GG030310", new Estudiante("GG030310", "Gomez", "Javier"));//Sigue en la siguiente pagina}}
    for(Estudiante o: hashTable.values()) {
        Estudiante e = (Estudiante) o;
        System.out.println("No Carnet: " + e.getNoCarnet());
        System.out.println("Apellidos: " + e.getApellidos());
        System.out.println("Nombres  : " + e.getNombres());
        System.out.println("---------------------");
 
    }
  }
}
