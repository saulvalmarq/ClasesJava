/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        
        emp.setNoCarnet(2820);
        emp.setNombres("Juan");
        emp.setApellidos("Perez");
        
        System.out.println("Carnet    :" + emp.getNoCarnet());
        System.out.println("Nombres   :" + emp.getNombres());
        System.out.println("Apellidos :" + emp.getApellidos());
        
    }
}
