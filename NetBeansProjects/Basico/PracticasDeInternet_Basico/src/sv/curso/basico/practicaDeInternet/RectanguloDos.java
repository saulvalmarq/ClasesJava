/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practicaDeInternet;

/**
 *
 * @author Saúl Valencia
 */
public class RectanguloDos {

private int lado1;
private int lado2;

public RectanguloDos (int lado1, int lado2) {
 super();
 this.lado1 = lado1;
 this.lado2 = lado2;
 }

public int getLado1() {
 return lado1;
 }
 
public void setLado1(int lado1) {
 this.lado1 = lado1;
 }
 
public int getLado2() {
 return lado2;
 }
 
public void setLado2(int lado2) {
 this.lado2 = lado2;
 }
 public double area () {
 return Rectangulo.area(getLado1(), getLado2());
 }
 
 public double perimetro() {
 return Rectangulo.perimetro(getLado1(), getLado2());
 }
 public static double area(int lado1,int lado2) {
 return lado1*lado2;
 }
 
 public static double perimetro(int lado1,int lado2) {
 return lado1*2+lado2*2;
 }
}

