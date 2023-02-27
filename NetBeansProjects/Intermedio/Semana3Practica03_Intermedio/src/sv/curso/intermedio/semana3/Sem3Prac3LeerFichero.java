/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author levita
 */
public class Sem3Prac3LeerFichero {
        public static void main(String[] arg) {
            File archivo = null;
            FileReader reader = null;
            BufferedReader buffer = null;
            try {
//                archivo = new File("C:\\directorioArchivo\\archivo.txt");
            archivo = new File("/home/levita/Documents/edutech/archivo.txt");
                reader = new FileReader(archivo);
                buffer = new BufferedReader(reader);
                String linea;
                while ((linea = buffer.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

