/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Saúl Valencia
 */
public class TestVid {
    public static void main(String[] args) {
    EmpleadoVid emp = new EmpleadoVid();
    
    emp.setNoDui("021000089");
    emp.setNombre("Jose Lopez");
    emp.setSalario(800.0);
    
    emp.imprimirEmpleado();

   
//    Planilla pla = new Planilla();
        
    emp.setNoNit("06143010901108");
    emp.setIngresos(5000.0);
    emp.setImpuestos(800.00);   
    
    emp.imprimirPlanilla();
// Ya con Cliente extendido a PlanillaVid y Planilla extendido a EmpleadoVid    
    emp.setNoDuiCliente("021000099");
    emp.setNombreCliente("Jesus Lopez");
    
    emp.imprimirCliente();
//run:
//No Dui : 021000089
//Nombre : Jose Lopez
//Salario: 800.0
//No Nit   : 06143010901108
//Ingresos : 5000.0
//Impuestos: 800.0
//No Dui Cliente : 021000099
//Nombre Cliente : Jesus Lopez
//BUILD SUCCESSFUL (total time: 0 seconds)
    }           
}
