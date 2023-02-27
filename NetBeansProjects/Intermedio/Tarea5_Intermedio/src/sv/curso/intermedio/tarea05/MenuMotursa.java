/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.tarea05;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author Saúl Valencia
 */
public class MenuMotursa {
// Clase Principal
    public static void main(String[] args) throws SQLException {
// Instancias de la clase principal y secundaria         
        MantenimientoMotursa mantenimiento = new MantenimientoMotursa();
        Motursa motursa = new Motursa();      
        
// Usando la Clase Scanner como fue solicitado 
         Scanner sc2 = new Scanner(System.in);
        int flag = 0; // Salida de circulación
        while (flag == 0) {
        System.out.println("");
        System.out.println("------ Menu Motursa --------");
        System.out.println("1 -Guardar Información Motursa");
        System.out.println("2 -Consultar Información Motursa");
        System.out.println("3 -Modificar Información Motursa");
        System.out.println("4 -Eliminar Información Motursa");
        System.out.println("5 -Salir");
        System.out.println("Ingrese el número de la Opción Seleccionada:");   
         
            switch (sc2.nextInt()) {
                case 1:
                    System.out.println("");
                    mantenimiento.GuardarMotursa(motursa);
                    System.out.println("------- Fin de Guardar ------------");
                    break;
                case 2:
                    System.out.println("");
                    mantenimiento.ConsultarMotursa(motursa.getNoNit());
                    System.out.println("------- Fin de Consulta ------------");
                    break;                    
                case 3:
                    mantenimiento.ModificarMotursa(motursa);
                    System.out.println("------- Fin de Modificación ------------");
                    break;
                case 4:
                    System.out.println("");
                    mantenimiento.EliminarMotursa();
                    System.out.println("------- Fin de Eliminación ------------");
                    break; 
                case 5:
                    flag = 1;
                    break;
                default:
            }
        }
    } 
}        
   

