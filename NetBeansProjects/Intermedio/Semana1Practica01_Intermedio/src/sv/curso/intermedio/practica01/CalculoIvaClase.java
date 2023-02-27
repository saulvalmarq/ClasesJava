/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Saúl Valencia
 */
public class CalculoIvaClase {
 public static void main(String[] args) {
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     double precioSinIva;
     double precioConIva;
     try {
         System.out.println("Digite Precio Sin Iva: ");
     precioSinIva= Double.parseDouble(in.readLine());
     precioConIva= precioSinIva* 1.13;
     System.out.println("Precio Sin Iva : " + precioSinIva);
     System.out.println("Precio Con Iva : " + precioConIva);
     } catch (Exception e) { 
         System.out.println("Error al capturar datos desde el teclado...");
         System.out.println(e.getMessage());
     }
 }
}
