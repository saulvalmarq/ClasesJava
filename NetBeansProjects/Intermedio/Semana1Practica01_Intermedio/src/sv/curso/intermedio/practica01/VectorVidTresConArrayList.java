/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica01;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Saúl Valencia
 */
public class VectorVidTresConArrayList {

    public static void main(String[] args) {
        ArrayList<EmpleadoVidTres> datos = new ArrayList<EmpleadoVidTres>();

        datos.add(new EmpleadoVidTres("02100089", "Jose Lopez", 800.0));
        datos.add(new EmpleadoVidTres("02100069", "Daniel Gonzalez", 600.0));
        datos.add(new EmpleadoVidTres("02100039", "Verónica Aguirre", 1000.0));

        Iterator it = datos.iterator();

        while (it.hasNext()) {
            EmpleadoVidTres dato = (EmpleadoVidTres) it.next();

            System.out.print("No Dui: " + dato.noDui);
            System.out.print("  Nombre: " + dato.nombre);
            System.out.println("  Salario: " + dato.salario);
        }
    }
}

class EmpleadoVidTres {

    String noDui;
    String nombre;
    double salario;

    public EmpleadoVidTres(String noDui, String nombre, double salario) {
        this.noDui = noDui;
        this.nombre = nombre;
        this.salario = salario;
    }


}
