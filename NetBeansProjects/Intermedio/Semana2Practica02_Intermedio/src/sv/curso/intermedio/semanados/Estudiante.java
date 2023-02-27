/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semanados;

/**
 *
 * @author Saúl Valencia
 */
public class Estudiante {

    private String noCarnet;
    private String apellidos;
    private String nombres;

    public Estudiante(String noCarnet, String apellidos, String nombres) {
        this.noCarnet = noCarnet;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getNoCarnet() {
        return noCarnet;
    }

    public void setNoCarnet(String noCarnet) {
        this.noCarnet = noCarnet;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    

}
