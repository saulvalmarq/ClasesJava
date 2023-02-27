/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Saúl Valencia
 */
public class ArrayListIterator {
   public static void main(String[ ] args) {
    ArrayList miArrayList= new ArrayList();
    miArrayList.add ("Bienvenidos");
    miArrayList.add(" a ");
    miArrayList.add("Java");
    Iterator it = miArrayList.iterator();
    while (it.hasNext())
// Si se agrega \n al final hace un salto por cada iteración       
//        System.out.print((it.next()) + "\n");
        System.out.print((it.next()));
        System.out.println("");
   }
}

