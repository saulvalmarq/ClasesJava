/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

import java.util.HashMap;

/**
 *
 * @author Saúl Valencia
 */
public class EjemploHashMap {
    public static void main(String[] args) {
    HashMap<Integer, String> mapa = new HashMap<Integer, String>();
    mapa.put(1, "Elemento 1");
    mapa.put(2, "Elemento 2");
    mapa.put(3, "Elemento 3");
    for(String e : mapa.values()){
        System.out.println(e);
//        System.out.println(mapa.get(1));
//        System.out.println(mapa.get(2));
//        System.out.println(mapa.get(3));
    }// Otra forma de recuperar los valoresSystem.out.println(mapa.get(2));
  }
}
