package sv.curso.basico.pruebas03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Saúl Valencia
 */
public class EmpleadoSinconstructor {
    String noDui;
    String nombre;
    double salario;
   
    public static void main(String[] args) {
        EmpleadoSinconstructor emp = new EmpleadoSinconstructor();
     
        emp.noDui="021000089";
        emp.nombre="Jose Lopez";
        emp.salario=800.0;
        
        emp.imprimirEmpleado();
     
    }

    public void imprimirEmpleado() {
        System.out.println("No Dui : " + noDui);
        System.out.println("Nombre : " + nombre);
        System.out.println("Salario: " + salario);
    }
}
