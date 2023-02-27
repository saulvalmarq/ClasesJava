/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class MainBiciesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Introduce año: ");
        año = sc.nextInt();
        if(esBisiesto(año)){  //llamada al método
           System.out.println("Bisiesto");
        }else{
           System.out.println("No es bisiesto");
        }
    }

    /*
     * método que calcula si un año es o no bisiesto                                               
     */     
    public static boolean esBisiesto(int a){    
        if(a%4==0 && a%100!=0 || a%400==0)
           return true;
        else
           return false;
    }
}
