/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica02;

/**
 *
 * @author Saúl Valencia
 */
public class DeclaracionVariables {

    public static void main(String[] args) {
        //Declaramos las Variables sin inicializarlas
        int edadEmpleado;
        double salarioEmpleado;
        String nombreEmpleado;
        char inicialEmpleado;
        boolean empleadoEsActivo;

        //Inicializamos las Variables
        edadEmpleado = 21;
        salarioEmpleado = 800.00;
        nombreEmpleado = "Jose";
        // El metodo charAt extrae el primer caracter
        // del nombre del empleado
        inicialEmpleado = nombreEmpleado.charAt(0);
        empleadoEsActivo = true;

        //Ahora imprimimos las Variables
        System.out.println("Edad Empleado:" + edadEmpleado);
        System.out.println("Salario Empleado:" + salarioEmpleado);
        System.out.println("Nombre Empleado:" + nombreEmpleado);
        System.out.println("Inicial Empleado:" + inicialEmpleado);
        System.out.println("Estado Empleado:" + empleadoEsActivo);
    }
}
