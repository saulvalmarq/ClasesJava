/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.clasesem5;

/**
 *
 * @author Saúl Valencia
 */
public class Contribuyente {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente();
        
        c.calcularImpuesto(800);
        c.calcularImpuesto(800.0);
        c.calcularImpuesto(800.0f);
    }
    
    public void calcularImpuesto(int salario){
        System.out.println("Salario Int: " + salario * 0.15);
    }
    
    public void calcularImpuesto(float salario){
        System.out.println("Salario Float: " + salario*0.10);
    }
    public void calcularImpuesto(double salario){
        System.out.println("Salario Double: " + salario*0.12);
    }
}
