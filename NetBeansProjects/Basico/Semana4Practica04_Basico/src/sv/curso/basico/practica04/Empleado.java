/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica04;

/**
 *
 * @author Saúl Valencia
 */
public class Empleado {
    //Declaramos los 3 atributos
    long noCarnet;
    String nombres;
    String apellidos;  
    
    public void registrarEmpleado(){
        System.out.println("Metodo para registrar empleado...");
    }

    public void consultarEmpleado(){
        System.out.println("Metodo para consultar empleado...");
    }

    public void eliminarEmpleado(){
        System.out.println("Metodo para eliminar empleado...");
    }     
    
    public static void main(String[] args) {
    // Creamos el objeto emp para acceder a los atributos de clase
    // que es una instancia de la clase Empleado
        
        Empleado emp = new Empleado();
        
    // les asignamos un valor a cada atributo
        emp.noCarnet = 2817;
        emp.apellidos = "Perez";
        emp.nombres = "Juan";
    
    // Invocamos los metodos desde el metodo main
    // por medio del objeto emp
    // que es una instancia de la clase Empleado
        emp.registrarEmpleado();
        emp.consultarEmpleado();
        emp.eliminarEmpleado();
    
    
    // Los imprimimos
        System.out.println("No Carnet: " + emp.noCarnet);
        System.out.println("Apellidos: " + emp.apellidos);
        System.out.println("Nombres  : " + emp.nombres);
    }
}
