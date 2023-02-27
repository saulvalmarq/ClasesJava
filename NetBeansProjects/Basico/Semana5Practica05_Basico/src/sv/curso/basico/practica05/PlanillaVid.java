/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Saúl Valencia
 */
//public class PlanillaVid {
    public class PlanillaVid extends ClienteVid{
    private String noNit;
    private double ingresos;
     private double impuestos;

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
     
    public void imprimirPlanilla(){
        System.out.println("No Nit   : " + this.noNit);
        System.out.println("Ingresos : " + this.ingresos);
        System.out.println("Impuestos: " + this.impuestos);
    } 
     
}
