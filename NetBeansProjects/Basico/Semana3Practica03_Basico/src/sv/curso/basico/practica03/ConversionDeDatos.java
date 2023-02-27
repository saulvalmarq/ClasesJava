/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

/**
 *
 * @author Saúl Valencia
 */
public class ConversionDeDatos {
    public static void main(String[] args) {
        String valorString = "21";

    //Convirtiendo de String a numero
    int valorInt = Integer.parseInt (valorString);
    long valorLong = Long.parseLong (valorString);
    float valorFloat = Float.parseFloat (valorString);
    double valorDouble = Double.parseDouble (valorString);

    System.out.println("Entero:" + valorInt);
    System.out.println("Long:" + valorLong);
    System.out.println("Float:" + valorFloat);
    System.out.println("Double:" + valorDouble);
    }
    
}
