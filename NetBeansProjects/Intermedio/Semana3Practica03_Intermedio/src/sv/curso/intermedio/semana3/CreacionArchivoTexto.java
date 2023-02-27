/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Saúl Valencia
 */
public class CreacionArchivoTexto {

    public static void main(String[] args) {
        CreacionArchivoTexto c = new CreacionArchivoTexto();
        c.LeerArchivo();
        c.CrearArchivo("Este es un saludo de los Java developers...");
        //c.leerArchivo();
    }
    
    public void LeerArchivo() {
        //Creamos un String que va a contener todo el texto del archivo
        String texto;
        try {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector = new FileReader("/home/levita/Documents/edutech/archivos/noviembre/ArchivoTexto.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido = new BufferedReader(lector);
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while ((texto = contenido.readLine()) != null) {
                System.out.println(texto);
            }
        } //Si se causa un error al leer cae aqui
        catch (IOException e) {
            System.out.println("Error al leer");
            System.out.println("El archivo no existe");
        //    e.printStackTrace();
        //    crearArchivo("Este es un saludo de los Java developers...");
        }
    }

    
    public void CrearArchivo(String texto) {
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su 
            File archivo = new File("/home/levita/Documents/edutech/archivos/noviembre/ArchivoTexto.txt");
            //Escribimos en el archivo con el metodo write
            try ( //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                    FileWriter escribir = new FileWriter(archivo, true)) {
                //Escribimos en el archivo con el metodo write
                escribir.write(texto + "\r\n");
                System.out.println("Archivo Creado");
            }
        } //Si existe un problema al escribir cae aqui
        catch (IOException e) {
            System.out.println("Error al escribir");
        }
    }  
}

