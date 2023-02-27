/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.deinternet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 *
 * @author Saúl Valencia
 */
public class ejemplohashmap {
     public static void main(String[] args){
         
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
 
        // 1. Usando un iterador
        Iterator<String> itr = map.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println("------------------------- \n");
        }
 
        // 2. Bucle for-each
        for (String key: map.values()) {
            System.out.println(key);
        }
 
        // 3. Java 8 – Collection.iterator() + Iterator.forEachRemaining()
        map.values().iterator()
            .forEachRemaining(System.out::println);
        System.out.println("------------------------- \n");
 
        // 4. Java 8 – Collection.stream() + Stream.forEach()
        map.values().stream()
            .forEach(System.out::println);
        System.out.println("------------------------- \n");
 
        // Java 8 – Stream.of() + Collection.toArray() + Stream.forEach()
        Stream.of(map.values().toArray())
            .forEach(System.out::println);
        System.out.println("------------------------- \n");
 
        // 5. Convertir a una string
        System.out.println(map.values().toString());
        System.out.println("------------------------- \n");
 
        // 6. Java 8
        Stream.of(map.values().toString())
            .forEach(System.out::println);
        System.out.println("------------------------- \n");
    }
}
