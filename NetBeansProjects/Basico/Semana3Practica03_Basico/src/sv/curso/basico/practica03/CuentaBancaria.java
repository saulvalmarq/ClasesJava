/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

/**
 *
 * @author Saúl Valencia
 */
public class CuentaBancaria {
    long numeroCuenta; 
    String propietarioCuenta;
    
    double saldoCuenta;

    public CuentaBancaria(long numeroCuenta, String propietarioCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.propietarioCuenta = propietarioCuenta;
        this.saldoCuenta = saldoCuenta;
    }
            
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(14802279, "Juan Perez", 100.0);
        
        cuentaBancaria.abonar(100);
        cuentaBancaria.cargar(50);
        
        System.out.println("Saldo cuenta:" + cuentaBancaria.saldoCuenta);
    }
    
    public void abonar(double cantidad) {
        saldoCuenta += cantidad; //Lógica
    }
    
    public void cargar(double cantidad) {
        if (cantidad > saldoCuenta) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldoCuenta -= cantidad; //Lógica
        }
    }
    
}

