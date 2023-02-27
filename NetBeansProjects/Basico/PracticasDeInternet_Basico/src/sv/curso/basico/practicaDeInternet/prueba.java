/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

/**
 *
 * @author Saúl Valencia
 */
public class prueba {

    public static void main(String[] args) {
        double labs = 20;
        double pars = 20;
        Colectar(labs, pars, pars, pars);
    }
    public static double Calculo1(double labs) {
        double promedio1 = (labs / 4) * 0.4;
        System.out.println("Promedio1 =" + promedio1);
        return promedio1;
    }

    public static double Calculo2(double pars) {
        double promedio2 = (pars / 4) * 0.6;
        System.out.println("Promedio2 =" + promedio2);
        return promedio2;
    }

    public static double Calculo3(double promedio1, double promedio2) {
        double notaFinal = promedio1 + promedio2;
        System.out.println("Nota Final =" + notaFinal);
        return notaFinal;

    }
    public static void Colectar(double labs, double pars, double promedio1, double promedio2) {
    //    for (i = 1; i <= 3; i++) {

            //    Calculo1(labs);
            //    Calculo2(pars);
                  Calculo3(Calculo1(labs), Calculo2(pars));
    //    }
}
}