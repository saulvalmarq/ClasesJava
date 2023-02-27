/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana3;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author levita
 */
public class Sem3Prac3EscribirFichero {

    public class EscribirFichero {

        public static void main(String[] args) {
            File fichero = null;
            FileWriter writer = null;
            PrintWriter pw = null;
            try {
        // con Windows        
        //        fichero = new File("C:\\directorioArchivo\\archivo.txt");
                fichero = new File("/home/levita/Documents/edutech/archivo.txt");
                writer = new FileWriter(fichero);
                pw = new PrintWriter(writer);
                for (int i = 0; i < 10; i++) {
                    pw.println("Linea " + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fichero) {
                        writer.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
