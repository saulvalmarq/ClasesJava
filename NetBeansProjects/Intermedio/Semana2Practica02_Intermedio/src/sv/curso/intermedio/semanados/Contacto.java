/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

/**
 *
 * @author Saúl Valencia
 */
public class Contacto {
    private String nombre;
    private int telefono;

    public Contacto()
    {
    this.nombre=null;
    this.telefono=0;
    }
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public void set_nombre(String nomb){        
        this.nombre=nomb.toUpperCase();
    }
    public void set_telefono(int telf){
        this.telefono=telf;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}

