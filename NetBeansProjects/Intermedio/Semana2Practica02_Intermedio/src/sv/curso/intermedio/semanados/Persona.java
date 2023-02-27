/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

/**
 *
 * @author Saúl Valencia
 */
public class Persona {

    private String noDui;
    private String telefono;
    private String nombre;
    private String salario;

    public Persona(String noDui, String telefono, String nombre, String salario) {
        this.noDui = noDui;
        this.telefono = telefono;
        this.nombre = nombre;
        this.salario = salario;
    }

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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
