/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica04;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        Cliente propietario = new Cliente();
        CuentaBancaria cuenta = new CuentaBancaria();
        
        propietario.noDui="021000093";
        propietario.nombre="Juan Perez";
        propietario.telefono=22405000;
        
        cuenta.propietarioCuenta = propietario;

        String montoDinero;
        montoDinero = JOptionPane.showInputDialog("Ingresa el monto de dinero a Abonar:");    
        cuenta.abonar(Double.parseDouble(montoDinero));   
        
        montoDinero = JOptionPane.showInputDialog("Ingresa el monto de dinero a Retirar:");    
        cuenta.retirar(Double.parseDouble(montoDinero));   
        
        JOptionPane.showMessageDialog(null, "El Saldo de la Cuenta es:" +cuenta.saldoCuenta);        
    }          
}

