/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodoSinRetornoYsinParametrosConSaltoEntreMetodos;

/**
 *
 * @author Saúl Valencia
 */

public class PrincipalDos {
// public es el modificador de acceso
// static es el modificador de uso
// void es el tipo de retorno, no tiene retorno
// siempre se llamará main
// Tiene parámetros String[] args
    public static void main(String[] args) {
// Se crea una instancia de la clase ProcesosUno para invocar ese método
// desde la clase PrincipalUno
// ProcesosUno() es un método constructor
// Cuando se vean paréntesis es que es un método
// Por regla una clase siempre tiene un constructor, si no está declarado es implicito sin parámetros
    ProcesosDos misProcesosDos=new ProcesosDos();
        misProcesosDos.iniciar();
//        misProcesosDos.sumarNumeros();
    }

}