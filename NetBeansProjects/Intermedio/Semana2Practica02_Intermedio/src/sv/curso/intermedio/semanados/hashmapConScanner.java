/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;


import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Saúl Valencia
 */
public class hashmapConScanner {



    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca valores enteros");
        for (int i = 0; i < 3; i++) {
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            
            hmap.put(a, b);

            System.out.println(hmap.put(a, b));
        }

    }

}

