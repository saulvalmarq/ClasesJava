/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.prueba04;

/**
 *
 * @author Saúl Valencia
 */
public class CuentaBancaria {
    long numeroCuenta;
//    String propietarioCuenta;
    Cliente propietarioCuenta;
    double saldoCuenta;

    public CuentaBancaria(long numeroCuenta, Cliente propietarioCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.propietarioCuenta = propietarioCuenta;
        this.saldoCuenta = saldoCuenta;
    }   
    
    public void abonar (double cantidad){
        saldoCuenta += cantidad; // Lógica de Negocio
    }
    
    public void retirar (double cantidad){
    if (cantidad>saldoCuenta){
        System.out.println("Saldo Insuficiente");
    } else {
        saldoCuenta -= cantidad; // Lógica de Negocio
    }    
    }
public String datosPropietarioCuenta(){
    String informacion="";
    informacion += "Dui      : " + propietarioCuenta.noDui + "\n";
    informacion += "Nombre   : " + propietarioCuenta.nombre + "\n";
    informacion += "Telefono : " + propietarioCuenta.telefono + "\n";
    return informacion;
    
    
}    
}
