package sv.curso.basico.pruebas03;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Saúl Valencia
 */
public class LecturaDatos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
        System.out.println("Digite su nombre:");
        String nombre = lector.nextLine();

        System.out.println("Digite su edad:");
        int edad = lector.nextInt();

        System.out.println("Digite su salario:");
        double salario = lector.nextDouble();

            System.out.println("Digite Direccion:");
        String direccion = br.readLine();
        } catch (Exception e) {
            System.out.println("Error al leer datos...");
      }
   }
}

