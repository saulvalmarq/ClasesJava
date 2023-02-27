/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Saúl Valencia
 */
public class VectorVid {

    public static void main(String[] args) {
        Vector<String> datos = new Vector<String>();
        datos.add("Andres");
        datos.add("Daniel");
        datos.add("Jose");
        datos.add("Veronica");

        Iterator it = datos.iterator();
        
        while (it.hasNext()){
            String dato = (String) it.next();
            
            System.out.println("Dato: " + dato);
        }
    }
}
