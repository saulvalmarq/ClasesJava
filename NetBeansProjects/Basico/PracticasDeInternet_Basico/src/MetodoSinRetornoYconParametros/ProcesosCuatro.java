/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodoSinRetornoYconParametros;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
//Métodos sin Retorno y sin Parámetros
public class ProcesosCuatro {
    
// Al invocar el método desde el constructor y ejecutar la clase Principal
// se ejecuta automáticamente el proceso de calculo 
    public ProcesosCuatro() {
        sumarNumeros();
        restarNumeros(4,2,"Operación");
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







