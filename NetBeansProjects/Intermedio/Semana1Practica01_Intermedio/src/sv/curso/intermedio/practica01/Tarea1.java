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
public class Tarea1 {
// Clase Principal
    public static void main(String[] args) throws FileNotFoundException {
// Uso de excepciones utilizando try catch y finally
        try {
// En Sistema Operativo Linux
//            BufferedReader archivo = new BufferedReader(new FileReader("/home/levita/Documents/edutech/archivos/Excepciones.txt"));
// Para Windows
              BufferedReader archivo = new BufferedReader(new FileReader("C:\\Excepciones.txt"));
// Asignando a la variable linea el contenido del archivo Excepciones.txt
            String linea = archivo.readLine();
// Ejecutando hasta que no hayan líneas que leer en el archivo 
            while (linea != null) {
// Imprimiendo lineas del archivo
                System.out.println(linea);
// Asignando la siguiente línea, ya que todas las líneas del archivo pasarán por la variable linea                
                linea = archivo.readLine();
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Error al Abrir el Archivo");
        } catch (Exception e2) {
            System.out.println("Error al Leer Datos");
        } finally {
            System.out.println("\n Ejecutando Cierre de los recursos, ocurra lo que ocurra...\n");
        }

    }

}
