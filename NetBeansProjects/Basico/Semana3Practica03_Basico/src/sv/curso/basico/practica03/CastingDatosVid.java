/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

/**
 *
 * @author Saúl Valencia
 */
public class CastingDatosVid {
    public static void main(String[] args) {
        
       String dato = "25";
        System.out.println(dato + dato);
//Casting de clases es lo mas comun
        int unInt = Integer.parseInt(dato);
        double unDouble = Double.parseDouble(dato);
        float unFloat = Float.parseFloat (dato);
//Casting de datos primitivos no es muy comun
        int edad = 18;
        double edadDouble = edad;
        
        int otraEdad = (int) edadDouble;
        
        double salario = 600.0;
        String salarioString = String.valueOf(salario);
        
        System.out.println(unDouble + unDouble);

    }
}
