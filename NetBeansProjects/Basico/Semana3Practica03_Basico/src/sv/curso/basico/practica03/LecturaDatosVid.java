/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class LecturaDatosVid {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite su nombre:");
        String nombre = lector.nextLine();

        System.out.println("Digite su edad:");
        int edad = lector.nextInt();

        System.out.println("Digite su salario:");
        double salario = lector.nextDouble();

        try {
            System.out.println("Digite su direccion");
            String direccion = br.readLine();
        } catch (Exception e) {
            System.out.println("Error al leer datos...");
        }
    }

}

