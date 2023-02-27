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
public class FacturaElectrica {
// Creando instancias de la Clase NumberFormat para formatiar datos     
    NumberFormat formato = new DecimalFormat(" #,###.##");
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

    public void setConsumoMensual(double consumoMensual) {
            this.consumoMensual = consumoMensual;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(double consumoDiario) {
          this.consumoDiario = consumoDiario;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
          this.valorFactura = valorFactura;
    }
// Creando el método solicitado    
    public void ConsumoMensual(){
      this.consumoMensual = (this.lecturaActual - this.lecturaAnterior) * this.multiplicador;
      System.out.println("Consumo Mensual               : " + getConsumoMensual());
        
    }
// Creando el método solicitado    
    public void ConsumoDiario(){
        this.consumoDiario = this.consumoMensual / 30;
        System.out.println("Consumo Diario              : " + formato.format(getConsumoDiario()));
        
    }
// Creando el método solicitado      
    public void ValorFactura() {
        this.valorFactura = this.consumoMensual * 0.20;
        System.out.println("Valor de la Factura         : " + dolar.format(getValorFactura()));
    }
    
    
    
    
}
