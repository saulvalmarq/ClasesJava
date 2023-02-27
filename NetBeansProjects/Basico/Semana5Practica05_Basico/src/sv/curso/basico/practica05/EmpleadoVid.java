/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica05;


/**
 *
 * @author Saúl Valencia
 */
//public class EmpleadoVid {
public class EmpleadoVid extends PlanillaVid{
   private String noDui;
   private String nombre;
   private double salario;

    public String getNoDui() {
        return noDui;
    }

    public void setNoDui(String noDui) {
        this.noDui = noDui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
   
    public void imprimirEmpleado(){
        System.out.println("No Dui : " + this.noDui);
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Salario: " + this.salario);
    }
    
    
}
