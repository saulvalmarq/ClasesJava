/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica04;

/**
 *
 * @author Saúl Valencia
 */
public class Bus {
    String matricula;
    int numeroAsientos;
    int numeroBusesCreados;

    public Bus(String matricula, int numeroAsientos, int numeroBusesCreados) {
        this.matricula = matricula;
        this.numeroAsientos = numeroAsientos;
        this.numeroBusesCreados = numeroBusesCreados;
    }
    
    public void crearBus() {
        System.out.println("Creando Bus :");
        System.out.println("El numero de la matricula es :" + matricula);
        System.out.println("El numero de asientos es     :" + numeroAsientos);
        System.out.println("El numero de Buses Creados es:" + numeroBusesCreados);
    }

//Metodo Principal
    public static void main(String[] args) {
        // Creamos el objeto crear para acceder a los atributos de clase
        // que es una instancia de la clase Casa
        // Asignamos valor a cada atributo
        Bus crear = new Bus("A2022SV", 55, 1);
        // Mandamos a llamar el metodo solicitado para impresion
        crear.crearBus();
    } 
}


