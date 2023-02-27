/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

import java.util.ArrayList;

/**
 *
 * @author Saúl Valencia
 */
public class EjemploArrayList {
   public static void main (String[ ] args) {
       ArrayList miArrayList= new ArrayList();
   miArrayList.add("Bienvenidos");
   miArrayList.add("     a     ");
   miArrayList.add("   Java    ");
   for(int i=0 ; i<miArrayList.size(); i++)
       System.out.println(miArrayList.get(i));
   }
}

