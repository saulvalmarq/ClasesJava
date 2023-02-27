package sv.curso.basico.tar05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


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
        consumoMensual = (this.lecturaActual - this.lecturaAnterior) * this.multiplicador;
        return consumoMensual;
    }

    public void setConsumoMensual(double consumoMensual) {
        this.consumoMensual = consumoMensual;
    }

    public double getConsumoDiario() {
        consumoDiario = this.consumoMensual / 30;
        return consumoDiario;
    }

    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public double getValorFactura() {
        valorFactura = this.consumoMensual * 0.20;
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }
}
