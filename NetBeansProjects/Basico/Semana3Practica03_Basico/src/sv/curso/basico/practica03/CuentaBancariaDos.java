/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

/**
 *
 * @author Saúl Valencia
 */
public class CuentaBancariaDos {
//    long numeroCuenta; 
    Cliente propietarioCuenta;  
    double saldoCuenta;

//    public CuentaBancaria(long numeroCuenta, String propietarioCuenta, double saldoCuenta) {
//        this.numeroCuenta = numeroCuenta;
//        this.propietarioCuenta = propietarioCuenta;
//        this.saldoCuenta = saldoCuenta;
//    }

    public CuentaBancariaDos(Cliente propietarioCuenta, double saldoCuenta) {
        this.propietarioCuenta = propietarioCuenta;
        this.saldoCuenta = saldoCuenta;
    }
 
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente(148022100, "Jose Lopez", "21000089");
        CuentaBancariaDos cuenta = new CuentaBancariaDos(cliente, 100.0);
        
//        cuenta.abonar(100.0);
//        cuenta.retirar(250.0);
        System.out.println("Saldo: " + cuenta.saldoCuenta);
        
    }
    public void abonar(double cantidad) {
        saldoCuenta += cantidad; //Lógica
    }

    public void retirar(double cantidad) {
        if (cantidad > saldoCuenta) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldoCuenta -= cantidad; //Lógica
        }
    }  
}
