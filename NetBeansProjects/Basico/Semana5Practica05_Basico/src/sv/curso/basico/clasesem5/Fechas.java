/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.clasesem5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Saúl Valencia
 */
public class Fechas {
    public static void main(String[] args) {
        Fechas f = new Fechas();
        
        f.fechaVencimiento("15/10/2021");
        f.fechaVencimiento(new java.util.Date());
    }
    
    public void fechaVencimiento(String fecha){
        System.out.println("Fecha: " + fecha);
    }

    public void fechaVencimiento(Date fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        
        System.out.println("Fecha: " + formato.format(fecha));
    } 
}
