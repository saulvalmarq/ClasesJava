/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.deinternet;

import java.util.Scanner;

/**
 *
 * @author Saúl Valencia
 */
public class ContactTest {

    public static void main(String[] args) throws Exception {
        ContactPro con = new ContactPro();

        int flag = 0; // Salida de circulación
        while (flag == 0) {
            System.out.println("---------------------- Sistema de gestión de la agenda telefónica ----------------- ----- ");
            System.out.println("1. Agregar  2. Eliminar  3. Modificar  4. Mostrar todo  5. Buscar por nombre  6. Leer y mostrar  7. Guardar directorio telefónico  8. Borrar  0. Salir ");
			System.out.println("---------------------- Sistema de gestión de la agenda telefónica ----------------- ----- ");
            System.out.println("Seleccione la operación");
            Scanner sc1 = new Scanner(System.in);
            switch (sc1.nextInt()) {
                case 1:
                    con.add();
                    break;
                case 2:
                    con.del();
                    break;
                case 3:
                    con.change();
                    break;
                case 4:
                    con.show();
                    break;
                case 5:
                    con.search();
                    break;
                case 6:
                    con.open1();
                    con.show();
                    break;
                case 7:
                    con.save1();
                    break;
                case 8:
                    con.clear();
                    break;
                case 0:
                    flag = 1;
                    break;
                default:
                    break;
            }
        }
    }
}
