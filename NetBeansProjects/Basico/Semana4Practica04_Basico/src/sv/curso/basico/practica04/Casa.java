/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica04;

/**
 *
 * @author Saúl Valencia
 */
public class Casa {
// Declaramos los atributos
    String numeroCasa;
    String numeroPasaje;
    String nombreCalle;

// Constructor
    public Casa(String numeroCasa, String numeroPasaje, String nombreCalle) {
        this.numeroCasa = numeroCasa;
        this.numeroPasaje = numeroPasaje;
        this.nombreCalle = nombreCalle;
    }

// Metodo para crear casa e imprimir resultados
    public void crearCasa() {
        System.out.println("Creando Casa :");
        System.out.println("El numero de la casa es :" + numeroCasa);
        System.out.println("El numero del pasaje es :" + numeroPasaje);
        System.out.println("El nombre de la calle es:" + nombreCalle);
    }

//Metodo Principal
    public static void main(String[] args) {
        // Creamos el objeto crear para acceder a los atributos de clase
        // que es una instancia de la clase Casa
        // Asignamos valor a cada atributo
        Casa crear = new Casa("27A", "5", "Arce");
        // Mandamos a llamar el metodo solicitado para impresion
        crear.crearCasa();
    }
}
