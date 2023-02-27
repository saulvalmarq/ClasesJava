/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.prueba04;

/**
 *
 * @author Saúl Valencia
 */
public class Empleado {

    long noCarnet;
    String nombres;
    String apellidos;

    public void registrarEmpleado() {
        System.out.println("Metodo para registrar al empleado...");
    }

    public void consultarEmpleado() {
        System.out.println("Metodo para consutar al empleado...");
    }

    public void eliminarEmpleado() {
        System.out.println("Metodo para eliminar al empleado...");
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.noCarnet = 2817;
        emp.apellidos = "Perez";
        emp.nombres = "Juan";

        emp.registrarEmpleado();
        emp.consultarEmpleado();
        emp.eliminarEmpleado();

        System.out.println("No Carnet: " + emp.noCarnet);
        System.out.println("Apellidos: " + emp.apellidos);
        System.out.println("Nombres  : " + emp.nombres);
    }
}
