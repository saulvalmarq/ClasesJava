package sv.curso.basico.tar05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Saúl Valencia
 */
public class PruebaFacturaElectrica {
// Metodo main
    public static void main(String[] args) {
// Declarando instancia de la clase ImpresionFactura
        ImpresionFactura impFac = new ImpresionFactura();
// Asignando datos
        impFac.setNoCuenta("NIC 22277184");
        impFac.setLecturaActual(3025);
        impFac.setLecturaAnterior(2010);
        impFac.setMultiplicador(10);
        impFac.setDiasDeFacturacion(30);

// Imprimiendo todos los datos       
        impFac.ImprimirFactura();
    }
}
