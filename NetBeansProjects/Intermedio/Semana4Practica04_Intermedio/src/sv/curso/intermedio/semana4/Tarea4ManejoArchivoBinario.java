/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Saúl Valencia
 */
public class Tarea4ManejoArchivoBinario {
// Método Principal para Ejecución
    public static void main(String[] args) throws IOException {
// Instancia de la Clase Principal para poder llamar los métodos de ella
        Tarea4ManejoArchivoBinario c = new Tarea4ManejoArchivoBinario();
// Probando Métodos Escribir y Leer
        //c.escribirArchivoBinario("06142909011020", "Carlos Pérez", "Colonia Los Angeles, Rpto. Los Naranjos", 700.0);
        c.leerArchivoBinario();     
    }
// Método para Escribir el Archivo Binario
    private void escribirArchivoBinario(String no_nit, String nombre, String direccion, double ingresos_mensuales) throws IOException {
        try {
// Abrimos el archivo para guardar informacion
            FileOutputStream fstream = new FileOutputStream("/home/levita/Documents/edutech/archivos/insaforp/ArchivoBinario.dat", true);
            try ( DataOutputStream archivoSalida = new DataOutputStream(fstream)) {
                System.out.println("Escribiendo datos en el archivo binario");
                archivoSalida.writeUTF(no_nit);
                archivoSalida.writeUTF(nombre);
                archivoSalida.writeUTF(direccion);
                archivoSalida.writeDouble(ingresos_mensuales);
            }

            System.out.println("Se ha escrito datos en el archivo binario");
        } catch (IOException e) {
            System.out.println("Error al escribir");
            e.getMessage();
        }
    }
// Método para Leer el Archivo Binario
    private void leerArchivoBinario() throws FileNotFoundException, IOException {
// Flag de fin del archivo
        boolean endOfFile = false; 
// Manejo de errores de archivo con try catch
        try{
// Abriendo archivo binario desde ruta linux
            FileInputStream fstream = new FileInputStream("/home/levita/Documents/edutech/archivos/insaforp/ArchivoBinario.dat");
            DataInputStream archivoEntrada = new DataInputStream(fstream);
            System.out.println("Lectura de datos del archivo binario");
// Lectura del Archivo Binario
// Mientras no se llegue al final del archivo leer
            while (!endOfFile) {
// Manejo de errores de lectura con try catch
                try {
                    String no_nit = archivoEntrada.readUTF();
                    String nombre = archivoEntrada.readUTF();
                    String direccion = archivoEntrada.readUTF();
                    double ingresos_mensuales = archivoEntrada.readDouble();
                    System.out.println("No nit: " + no_nit + " Nombre: " + nombre + " Direccion: " + direccion + " Ingresos Mensuales: " + ingresos_mensuales);
                } catch (EOFException e) {
                    endOfFile = true;
                }
            }
                archivoEntrada.close();
            }catch (IOException e){
                System.out.println("Error al leer");
                e.printStackTrace();
            }
        }
    }

