/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.prueba04;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
//        Cliente propietario = new Cliente("02100093", "Juan Perez", 22405000);
        CuentaBancaria cuenta = new CuentaBancaria(14812345,new Cliente("02100093", "Juan Perez", 22405000),100.00);
        
//        cuenta.propietarioCuenta=propietario;
        
//        String montoDinero;
//        montoDinero = JOptionPane.showInputDialog("Ingresa el monto de dinero a abonar");
//        cuenta.abonar(Double.parseDouble(montoDinero));
//
//        montoDinero = JOptionPane.showInputDialog("Ingresa el monto de dinero a Retirar");
//        cuenta.retirar(Double.parseDouble(montoDinero));
//        
//        JOptionPane.showMessageDialog(null, "El Saldo de la Cuenta es:" + cuenta.saldoCuenta);
        JOptionPane.showMessageDialog(null, "Datos del propietario de la Cuenta:\n" + cuenta.datosPropietarioCuenta());      

    }
}
