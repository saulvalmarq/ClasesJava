/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana3;

import java.io.File;

/**
 *
 * @author levita
 */
public class Sem3Prac3FicheroEjemplo {

    public static void main(String args[]) {
        File fichero = new File("FicheroEjemplo.txt");
        if (fichero.exists()) {
            System.out.println("Nombre del archivo " + fichero.getName());
            System.out.println("Ruta " + fichero.getPath());
            System.out.println("Ruta absoluta " + fichero.getAbsolutePath());
            System.out.println("Se puede escribir " + fichero.canRead());
            System.out.println("Se puede leer " + fichero.canWrite());
            System.out.println("Tamaño " + fichero.length());
        }
        fichero.close();
    }
}
