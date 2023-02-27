/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Saúl Valencia
 */
public class EntradaPorTecladoClase {
    public static void main (String[] args) {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	try {  // try catch es un manejador de errores que posteriormente estudiaremos
            System.out.println("Digite primer valor: ");
            String valor1 = in.readLine();

            System.out.println("Digite segundo valor: ");
            String valor2 = in.readLine();

            int intValor1=Integer.parseInt(valor1);
            double doubleValor2=Double.parseDouble(valor2);
     
            System.out.println(intValor1);
            System.out.println(doubleValor2);
	} catch (Exception e){
            System.out.println("Error al capturar datos desde teclado…");          
            System.out.println(e.getMessage());
	}
    }
}

