/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

/**
 *
 * @author Saúl Valencia
 */
public class ConversionMonedas {

    public static void main(String[] args) {
        //1 USD 0.70 Europa 0.61 Reino Unido 0.95 Australia 0.97 Canadá
        double monedaDolares = 75.00;
        double monedaEuropa = monedaDolares * 0.70;
        double monedaReinoUnido = monedaDolares * 0.61;
        double monedaAustralia = monedaDolares * 0.95;
        double monedaCanada = monedaDolares * 0.97;
        System.out.println("Moneda Europa      :" + monedaEuropa);
        System.out.println("Moneda Reino Unido :" + monedaReinoUnido);
        System.out.println("Moneda Australia   :" + monedaAustralia);
        System.out.println("Moneda Canada      :" + monedaCanada);
    }
}
