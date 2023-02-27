/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tare05;

/**
 *
 * @author Saúl Valencia
 */
public class Empleado {
// Declarando Atributos

    private String noNit;
    private String apellidos;
    private String nombres;
    private String direccion;
    private double salarioDevengado;
    private double salarioConDescuento;
    private String bandera;

// Encapsulamiento
    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public double getSalarioConDescuento() {
        return salarioConDescuento;
    }
// Incluyendo el Cálculo del Salario

    public void setSalarioConDescuento(double salarioConDescuento) {
        this.salarioConDescuento = this.getSalarioDevengado() * (1 - 0.10);
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }
}
