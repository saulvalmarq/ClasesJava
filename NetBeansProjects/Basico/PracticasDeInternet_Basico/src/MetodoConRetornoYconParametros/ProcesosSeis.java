/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodoConRetornoYconParametros;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
//Métodos sin Retorno y sin Parámetros
public class ProcesosSeis {
    
// Al invocar el método desde el constructor y ejecutar la clase Principal
// se ejecuta automáticamente el proceso de calculo 
    public ProcesosSeis() {
//    sumarNumeros();
//    restarNumeros(4,2,"Operación");
//        String resultado=multiplicar();   
//        JOptionPane.showMessageDialog(null, resultado);
//        String nombre="Cristian David";
//        String resp=saludar(nombre);
//        JOptionPane.showMessageDialog(null, resp);
        JOptionPane.showMessageDialog(null, imprimirEdad(26));
    }

     private int imprimirEdad(int edad) {
         JOptionPane.showMessageDialog(null, "Método con retorno y con parámetros");
      return edad;  
    }   
    
    
    
    public String saludar(String nombre){
        JOptionPane.showMessageDialog(null, "Método con retorno y con parámetros");
        return "Hola su nombre es:"+nombre;
    }
    
    private String multiplicar(){
        JOptionPane.showMessageDialog(null, "Método con retorno y sin parámetros");
        int a=2;
        int b=8;
        int multiplicacion=a*b;  
    return "La multiplicación es:"+multiplicacion;
    }
    
    public void restarNumeros(int a, int b, String opera){
         JOptionPane.showMessageDialog(null, "está en el método sin retorno y con parámetros");
         JOptionPane.showMessageDialog(null, "los valores que le llega son:"+a+","+b+","+opera);
    }
    
    public void sumarNumeros(){
        JOptionPane.showMessageDialog(null, "está en el método sin retorno y sin parámetros");
        int x=5;
        int y=4;
        int suma=x+y;
        JOptionPane.showMessageDialog(null, "suma:"+suma);
    }


}







