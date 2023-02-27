/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Saúl Valencia
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setAbonoCuenta(100);
        cuenta.setCargoCuenta(25);
        cuenta.setSaldoCuenta(0);
        
        cuenta.setNoDui(21000080);
        cuenta.setNombre("Juan Perez");
        cuenta.setTelefono("22405555");

        System.out.println("Abono: " + cuenta.getAbonoCuenta());
        System.out.println("Cargo: " + cuenta.getCargoCuenta());
        System.out.println("Saldo: " + cuenta.getSaldoCuenta());
        
        System.out.println("NoDui   : " + cuenta.getNoDui());
        System.out.println("Nombre  : " + cuenta.getNombre());
        System.out.println("Telefono: " + cuenta.getTelefono());


        
    }
}
