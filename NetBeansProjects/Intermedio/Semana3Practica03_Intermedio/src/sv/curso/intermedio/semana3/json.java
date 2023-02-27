/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana3;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Saúl Valencia
 */
public class json {

    public void crearArchivoJSon(Clientes cliente) {
        Gson gson = new Gson();
        String json = gson.toJson(cliente);
        try {
            try (//Escribimos en el archivo de json
                    FileWriter Filewriter = new FileWriter("/home/levita/Documents/edutech/ArchivoGSON.json", true)) {
                Filewriter.write("[");
                Filewriter.write(json);
                Filewriter.write("]");
                Filewriter.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   public void Clientes(){
    
} 
    
}
