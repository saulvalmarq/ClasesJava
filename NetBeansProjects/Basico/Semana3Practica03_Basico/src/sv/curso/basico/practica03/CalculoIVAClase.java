/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */
public class CalculoIVAClase {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double precioSinIva;
        double precioConIva;
        NumberFormat formato = new DecimalFormat("$#,###.##");
        
    try{
        System.out.println("Digite precio Sin Iva:");
        precioSinIva = Double.parseDouble(in.readLine());
        precioConIva = precioSinIva * 1.13;
      
        System.out.println("Precio Sin Iva :" + precioSinIva);
        System.out.println("Precio Con Iva :" + precioConIva);
        System.out.println("Precio Con Iva con dos decimales : " + formato.format(precioConIva));
    } catch (Exception e){
        System.out.println("Error al capturar datos desde teclado…");
    }
  }
}
