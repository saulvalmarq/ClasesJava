/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Saúl Valencia
 */
public class EjemploLinkedList {
    public static void main(String[] args) {
       List lista = new LinkedList();
       lista.add("Elemento No 1");
       lista.add("Elemento No 2");
       lista.add("Elemento No 3");
       Iterator iterador= lista.iterator();
       while(iterador.hasNext()) {
           String elemento = (String) iterador.next();
           System.out.println(elemento + " ");
       }
    }
}
