/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

/**
 *
 * @author Saúl Valencia
 */
public class Prac1Ejer4EmpleadoCalzado {

    public static void main(String[] args) {
        double sueldoBase = 365.00;
        double renta = 0.10;
        double afp = 0.0725;
        double seguroSocial = 0.03;
        double sueldoConDescuento = sueldoBase * (1 - renta - afp - seguroSocial);

        System.out.println("Calculo de Descuentos aplicados en Empresa de Calzado \n");
        System.out.println("Sueldo Base                : " + sueldoBase);
        System.out.println("Descuento de Renta         : " + renta);
        System.out.println("Descuento de afp           : " + afp);
        System.out.println("Descuento de Seguro Social : " + seguroSocial);
        System.out.println("Sueldo Neto con Descuentos : " + sueldoConDescuento);

    }
}
