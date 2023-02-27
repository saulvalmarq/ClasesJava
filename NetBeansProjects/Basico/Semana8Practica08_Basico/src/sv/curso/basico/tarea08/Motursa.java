/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea08;

/**
 *
 * @author DGA
 */
public class Motursa {

    public static void main(String[] args) {
        double precioDelActivo = 12000.00;
        double depreciacionAnual = precioDelActivo / 5;
        double PrimerAnio = precioDelActivo - depreciacionAnual;
        double SegundoAnio = PrimerAnio - depreciacionAnual;
        double TercerAnio = SegundoAnio - depreciacionAnual;
        double CuartoAnio = TercerAnio - depreciacionAnual;
        double QuintoAnio = CuartoAnio - depreciacionAnual;

        System.out.println("Depreciación de Activo Empresa Motursa \n");
        System.out.println("Precio inicial del Activo      : " + precioDelActivo);
        System.out.println("Depreciación Anual             : " + depreciacionAnual + "\n");
        System.out.println("El Valor del Activo con Depreciación en el Primer Año es  : " + PrimerAnio);
        System.out.println("El Valor del Activo con Depreciación en el Segundo Año es : " + SegundoAnio);
        System.out.println("El Valor del Activo con Depreciación en el Tercer Año es  : " + TercerAnio);
        System.out.println("El Valor del Activo con Depreciación en el Cuarto Año es  : " + CuartoAnio);
        System.out.println("El Valor del Activo con Depreciación en el Quinto Año es  : " + QuintoAnio);

    }
}
