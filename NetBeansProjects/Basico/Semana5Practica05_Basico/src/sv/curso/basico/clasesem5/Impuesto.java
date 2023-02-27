/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.clasesem5;

/**
 *
 * @author Saúl Valencia
 */
public class Impuesto {
    private String codigoProducto;
    private String nombreProducto;
    private double precio;

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void calcularIvaProducto(){
        double precioConIva = this.precio * 1.13;
        System.out.println("El precio con iva es:" + precioConIva);
    }
    
    public static void main(String[] args) {
        
        Impuesto i = new Impuesto();
                        
        i.setCodigoProducto("00001");
        i.setNombreProducto("Babydolls");
        i.setPrecio(25.00);
        
        i.calcularIvaProducto();
    } 
}
