/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.tarea05;

/**
 *
 * @author Saúl Valencia
 */
// Clase Principal 
public class Motursa {
// Atributos solicitados en la tarea
    private String noNit;
    private String nombre;
    private String direccion;
    private String telefono;
    private double salario;
    private double descuentoRenta;

// Setters y Getters creados
    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDescuentoRenta() {
        return descuentoRenta;
    }

    public void setDescuentoRenta(double descuentoRenta) {
        this.descuentoRenta = descuentoRenta;
    }
}
