///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package sv.curso.intermedio.semana5;
//
//import java.util.Scanner;
//
///**
// *
// * @author Saúl Valencia
// */
//public class MenuContribuyentes {
//    public static void main(String[] args) {
//     // Creando una instancia de la Clase procesosAgenda
//        MantenimientoContribuyentes mantenimiento = new MantenimientoContribuyentes();
//        Contribuyentes contribuyente = new Contribuyentes();
//        
//// Usando la Clase Scanner como fue solicitado 
//         Scanner sc1 = new Scanner(System.in);
//        int flag = 0; // Salida de circulación
//        while (flag == 0) {
//
//        System.out.println("Menu Contribuyente");
//        System.out.println("1 -guardarContribuyente");
//        System.out.println("2 -consultarContribuyente");
//        System.out.println("3 -modificarContribuyente");
//        System.out.println("4 -Salir");
//        System.out.println("Ingrese el número de la Opción Seleccionada:");   
//         
//            switch (sc1.nextInt()) {
//                case 1:
//                    mantenimiento.guardarContribuyente(contribuyente);
//                    
//                    break;
//                case 2:
//                    mantenimiento.consultarContribuyente(noNit);
//                    break;                    
//                case 3:
//                    mantenimiento.modificarContribuyente(contribuyente);
//                    break;
//                case 4:
//                    flag = 1;
//                    break;
//                default:
//                    break;
//            }
//        }
//
//        //mantenimiento.conectarBaseDatos();
//        
//        contribuyente.setNoNit("06143010901159");
//        contribuyente.setNombreContribuyente("Open Source Soluctions");
//        contribuyente.setRazonSocial("Servicios de Mantenimiento");
//        contribuyente.setRepresentanteLegal("Saul Valencia");
//        contribuyente.setRentaAnual(5000);
//        //System.out.println("Respuesta: " + mantenimiento.guardarContribuyente(contribuyente));
//        
//        Contribuyentes contribuyentes=mantenimiento.consultarContribuyente("06143010901159");
//        if (contribuyentes==null){
//            System.out.println("Datos del Contribuyente No Encontrados...");
//        } else {
//            System.out.println("No Nit              : " + contribuyentes.getNoNit());
//            System.out.println("Nombre Contribuyente: " + contribuyentes.getNombreContribuyente());
//            System.out.println("Razon Social        : " + contribuyentes.getRazonSocial());
//            System.out.println("Representante Legal : " + contribuyentes.getRepresentanteLegal());
//            System.out.println("Renta Anual         : " + contribuyentes.getRentaAnual());  
//            
//            contribuyente.setRepresentanteLegal("Saul Valencia");
//            
//            Contribuyentes contri = new Contribuyentes();
//            //contri.setNoNit("06143010901159");
//            contri.setNoNit("06142110681159");
//            contri.setRepresentanteLegal("Antonio Marquez");
//            
//        System.out.println(mantenimiento.modificarContribuyente(contri));
//        
//        }        
//    }
//}
