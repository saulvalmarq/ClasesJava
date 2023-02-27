/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Saúl Valencia
 */
public class Polimorfismo {

    
    public String convertirAString(int valorInt) {
        String conversion = String.valueOf(valorInt);
        return conversion;
    }

    public String convertirAString(double valorDouble) {
        String conversion = String.valueOf(valorDouble);
        return conversion;
    }

    public String convertirAString(float valorFloat) {
        String conversion = String.valueOf(valorFloat);
        return conversion;
    }
            
    public static void main(String[] args) {
        Polimorfismo p = new Polimorfismo();
        System.out.println("Valor Int en String     :" + p.convertirAString(10));
        System.out.println("Valor Double en String  :" + p.convertirAString(10));
        System.out.println("Valor Float en String   :" + p.convertirAString(10));
    }
    
}
