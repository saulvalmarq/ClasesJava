/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tarea05SH;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Saúl Valencia
 */
public class FacturaElectrica {
// Creando instancias de la Clase NumberFormat para formatiar datos       
    NumberFormat formato = new DecimalFormat("#,###.##");
    NumberFormat dolar = new DecimalFormat("$ #,###.##");
// Declarando Atributos
    private String noCuenta;
    private long lecturaActual;
    private long lecturaAnterior;
    private long multiplicador;
    private int diasDeFacturacion;
    private double consumoMensual;
    private double consumoDiario;
    private double valorFactura;

// Encapsulamiento
    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public long getLecturaActual() {
        return lecturaActual;
    }

    public void setLecturaActual(long lecturaActual) {
        this.lecturaActual = lecturaActual;
    }

    public long getLecturaAnterior() {
        return lecturaAnterior;
    }

    public void setLecturaAnterior(long lecturaAnterior) {
        this.lecturaAnterior = lecturaAnterior;
    }

    public long getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(long multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getDiasDeFacturacion() {
        return diasDeFacturacion;
    }

    public void setDiasDeFacturacion(int diasDeFacturacion) {
        this.diasDeFacturacion = diasDeFacturacion;
    }

    public double getConsumoMensual() {       
        return consumoMensual;
    }
// Adicionando el Cálculo del Consumo Mensual
    public void setConsumoMensual(double consumoMensual) {
        this.consumoMensual = (this.lecturaActual - this.lecturaAnterior) * this.multiplicador;
    }

    public double getConsumoDiario() {       
        return consumoDiario;
    }
// Adicionando el Cálculo del Consumo Diario
    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = this.consumoMensual / 30;
    }

    public double getValorFactura() {       
        return valorFactura;
    }
// Adicionando el Cálculo del Valor de la Factura
    public void setValorFactura(double valorFactura) {
        this.valorFactura = this.consumoMensual * 0.20;
    }

// Metodo para imprimir los Datos
    public void ImprimirDatos() {
        System.out.println("Cálculos del Valor de la Factura Electrica:\n");
        System.out.println("Datos del Abonado:");
        System.out.println("No Cuenta                   : " + this.noCuenta);
        System.out.println("Lectura Actual del Medidor  : " + this.lecturaActual);
        System.out.println("Lectura Anterior del Medidor: " + this.lecturaAnterior);
        System.out.println("Multiplicador               : " + this.multiplicador);
        System.out.println("Días de Facturación         : " + this.diasDeFacturacion);
        // Imprimiendo Consumos y el Valor de la Factura 
        System.out.println("Consumo Mensual             : " + this.consumoMensual);
        System.out.println("Consumo Diario              : " + formato.format(this.consumoDiario));
        System.out.println("Valor de la Factura         :" + dolar.format(this.valorFactura));
    }
}
