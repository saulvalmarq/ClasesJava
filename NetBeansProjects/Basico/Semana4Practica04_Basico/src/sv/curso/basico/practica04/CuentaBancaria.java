/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica04;

/**
 *
 * @author Saúl Valencia
 */
public class CuentaBancaria {
    // Declaramos los atributos
    long numeroCuenta; 
    Cliente propietarioCuenta; 
    double saldoCuenta;
    
    // Declaramos los métodos abonar y retirar los cuales reciben 
    // comp parámetro la cantidad de dinero a abonar o retirar
    public void abonar(double cantidad) {
        saldoCuenta += cantidad; //Lógica de Negocio
    }
    
    public void retirar(double cantidad) {
        if (cantidad > saldoCuenta) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldoCuenta -= cantidad; //Lógica de Negocio
        }
    }
    
    public String datosPropietarioCuenta(){
        String informacion = "";
        informacion += "Dui:" + propietarioCuenta.noDui + "\n";
        informacion += "Nombre:" + propietarioCuenta.nombre + "\n";
        informacion += "Telefono:" + propietarioCuenta.telefono;
        return informacion;
    }
    
}
