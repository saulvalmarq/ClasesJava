/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea05;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */
public class Empleado {
// Creando instancias de la Clase NumberFormat para formatiar datos     
    NumberFormat dolar = new DecimalFormat("$ #,###.##");
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

    public void setSalarioConDescuento(double salarioConDescuento) {
        this.salarioConDescuento= salarioConDescuento;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }
// Creando el método solicitado    
    public void descuento(){
        this.salarioConDescuento = this.salarioDevengado * (1 - 0.10);
        System.out.println("Salario con Descuento: " + dolar.format(getSalarioConDescuento()));  
    }
}

