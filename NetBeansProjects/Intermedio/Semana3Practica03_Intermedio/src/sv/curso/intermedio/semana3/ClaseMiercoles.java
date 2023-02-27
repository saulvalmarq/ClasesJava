/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana3;

import java.io.File;

/**
 *
 * @author Saúl Valencia
 */
public class ClaseMiercoles {
    public static void main(String[] args) {
        File folder = new File("/home/levita/Documents/edutech/archivos/noviembre");
        if (folder.exists()) { //Verificamos si existe o no la carpeta
            System.out.println("La carpeta Ya Existe...");
        } else {
            System.out.println("La carpeta No Existe y es Creada...");
            folder.mkdirs(); //Esto crea la carpeta y requiere que exista la ruta
        }
    }
}
