/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

/**
 *
 * @author Saúl Valencia
 */
public class ResistenciaVidDos {
    public static void main(String[] args) {
        double re1 = 2000.00;
        double re2 = 1000.00;
        double re = 1 / (1 / re1 + 1 / re2);

        System.out.println("Re: " + re);
    }
}