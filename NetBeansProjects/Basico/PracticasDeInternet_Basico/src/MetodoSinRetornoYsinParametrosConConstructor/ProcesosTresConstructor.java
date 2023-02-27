/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodoSinRetornoYsinParametrosConConstructor;

import javax.swing.JOptionPane;

/**
 *
 * @author Saúl Valencia
 */
//Métodos sin Retorno y sin Parámetros
public class ProcesosTresConstructor {
// Al invocar el método desde el constructor y ejecutar la clase Principal
// se ejecuta automáticamente el proceso de calculo 
    public ProcesosTresConstructor() {
// Invocando el método desde el constructor
// El constructor se llama igual que la clase
        sumarNumeros();
    }
    public void sumarNumeros(){
        JOptionPane.showMessageDialog(null, "está en el método sin retorno y sin parámetros");
        int x=5;
        int y=4;
        int suma=x+y;
        JOptionPane.showMessageDialog(null, "suma:"+suma);   
    }       
}







