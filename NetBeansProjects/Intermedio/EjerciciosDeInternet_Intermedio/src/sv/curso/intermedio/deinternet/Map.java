/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.deinternet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */

    public class Map {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("ingresa a");
            Integer a = in.nextInt();
            System.out.println("ingresa a");
            Integer b = in.nextInt();
            
            hmap.put(a, b);

            System.out.println(hmap.put(a, b));
        }
        hmap.entrySet().forEach(pair -> {
            System.out.println(pair.getKey() + "->" + pair.getValue());
        });
        }
    }

