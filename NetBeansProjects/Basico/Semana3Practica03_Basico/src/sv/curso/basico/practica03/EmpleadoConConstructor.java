/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.pruebas03;

/**
 *
 * @author Saúl Valencia
 */
public class EmpleadoConConstructor {
    String noDui;
    String nombre;
    double salario;

    public EmpleadoConConstructor(String noDui, String nombre, double salario) {
        this.noDui = noDui;
        this.nombre = nombre;
        this.salario = salario;
    }  

    public EmpleadoConConstructor(String noDui, String nombre) {
        this.noDui = noDui;
        this.nombre = nombre;
    }
    
    
    public static void main(String[] args) {
        EmpleadoConConstructor emp1 = new EmpleadoConConstructor("021000089","Jose Lopez", 800.0);    
        EmpleadoConConstructor emp2 = new EmpleadoConConstructor("021000089","Jose Lopez");
        emp1.imprimirEmpleado();
        emp2.imprimirEmpleado();
    }

    public void imprimirEmpleado() {
        System.out.println("No Dui : " + this.noDui);
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Salario: " + this.salario);
    }
}
