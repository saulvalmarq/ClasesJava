/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

/**
 *
 * @author Saúl Valencia
 */
public class Trabajador {
    String noCarnet;
    String nombre;
    double salario;

    public Trabajador(String noCarnet, String nombre, double salario) {
        this.noCarnet = noCarnet;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Trabajador(String noCarnet, double salario) {
        this.noCarnet = noCarnet;
        this.salario = salario;
    }
                    
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("OA1817", "Armando Lopez", 1000.0);
        Trabajador t2 = new Trabajador("OA1817", 1000.0);
        
//        t.noCarnet="OA1817";
//        t.nombre="Armando Lopez";
//        t.salario=1000.0;
        
        t1.imprimirEmpleado();
        t2.imprimirEmpleado();
    }
    
    public void imprimirEmpleado(){
        System.out.println("No Carnet:" + this.noCarnet);
        System.out.println("Nombre   :" + this.nombre);
        System.out.println("Salario  :" + this.salario);
    }
            
}

