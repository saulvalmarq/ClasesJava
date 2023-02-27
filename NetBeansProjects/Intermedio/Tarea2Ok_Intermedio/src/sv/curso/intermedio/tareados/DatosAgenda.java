/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.tareados;

/**
 *
 * @author Saúl Valencia
 */
public class DatosAgenda {
// Declarando Atributos Solicitados
    private String noDui;
    private String telefono;
    private String nombre;
    private double salario;

//Declarando el Constructor
    public DatosAgenda(String noDui, String telefono, String nombre, double salario) {
        this.noDui = noDui;
        this.telefono = telefono;
        this.nombre = nombre;
        this.salario = salario;
    }
// Declarando los métodos getter y setter 
    public String getNoDui() {
        return noDui;
    }

    public void setNoDui(String noDui) {
        this.noDui = noDui;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    	// método toString
	public String toString() {
		return "Persona [  \n No.Dui   : " + noDui + "\n" +
                                 " Nombre   :" + nombre + "\n" +
                                 " Teléfono :" + telefono + "\n" +
                                 " Salario  :" + salario + "]";
	}
}
