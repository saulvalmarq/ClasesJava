/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.tare05;

/**
 *
 * @author Saúl Valencia
 */
public class FacturaElectrica {
// Declarando Atributos

    private String noCuenta;
    private long lecturaActual;
    private long lecturaAnterior;
    private long multiplicador;
    private int diasDeFacturacion;
    private double consumoMensual;
    private double consumoDiario;
    private double valorFactura;

//Encapsulamiento
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
// Adicionando el Calculo del Consumo Mensual

    public void setConsumoMensual(double consumoMensual) {
        this.consumoMensual = (this.lecturaActual - this.lecturaAnterior) * this.multiplicador;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }
// Adicionando el Calculo del Consumo Diario

    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = this.consumoMensual / 30;
    }

    public double getValorFactura() {

        return valorFactura;
    }
// Adicionando el Calculo del Valor de la Factura

    public void setValorFactura(double valorFactura) {
        this.valorFactura = this.consumoMensual * 0.20;
    }
}
