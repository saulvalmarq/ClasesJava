/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Saúl Valencia
 */
public class ClienteVid {
    private String noDuiCliente;
    private String nombreCliente;

    public String getNoDuiCliente() {
        return noDuiCliente;
    }

    public void setNoDuiCliente(String noDuiCliente) {
        this.noDuiCliente = noDuiCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

public void imprimirCliente(){
        System.out.println("No Dui Cliente : " + this.noDuiCliente);
        System.out.println("Nombre Cliente : " + this.nombreCliente);
    } 


    
    
    
    
}
