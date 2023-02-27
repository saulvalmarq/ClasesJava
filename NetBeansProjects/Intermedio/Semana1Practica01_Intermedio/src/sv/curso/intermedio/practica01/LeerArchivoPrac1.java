/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.practica01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Saúl Valencia
 */
public class LeerArchivoPrac1 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("/home/levita/Documents/edutech/archivos/CursoJava.txt"));
// Para Windows
//          BufferedReader lector = new BufferedReader(new FileReader("C:/CursoJava.txt"));
            String linea = lector.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = lector.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al Abrir el Archivo");
        } catch (Exception e) {
            System.out.println("Error al Leer Datos");
        }

    }

}
