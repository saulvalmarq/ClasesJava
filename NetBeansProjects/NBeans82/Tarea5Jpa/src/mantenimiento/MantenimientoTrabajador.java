/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import javax.persistence.EntityManager;
import java.util.Scanner;
import persistencia.Trabajador;

/**
 *
 * @author Saul Valencia
 */
public class MantenimientoTrabajador {
// Clase Principal para ejecución de los métodos 

//    public static void main(String[] args) {
// Instancia de la clase generada por ingenieria inversa       

// Instancia esta clase para invocar sus métodos porque no son static
//        MantenimientoTrabajador man = new MantenimientoTrabajador();
// Registro 
//        trab.setNoNit("06142409731020");
//        trab.setNombreEmpleado("Ricardo Acevedo");
//        trab.setCargo("Tecnico de Soporte");
//        trab.setFechaContratacion("02/02/2023");
//        trab.setSalarioMensual("5000.00");
//        trab.setDescuentoRentaMensual("500.00");
//
//        System.out.println(man.guardarEmpleado(trab));
//Consultar solo verifica que existe pero no presenta nada
//          System.out.println(man.consultarEmpleado("06142409731020"));
//        man.consultarEmpleado("06142409731020");
        //           System.out.println(man.consultarEmpleado("06142409731020"));
//    }
// Método guardar (Create)

    public int guardarEmpleado(Trabajador trabajador) {
        // Instancias de la clase principal y jpautil
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Trabajador trab = new Trabajador();
// Ingreso de datos necesarios mediante teclado para el guardado de nuevos Estudiantes
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese por favor los Datos del Empleado:");
        System.out.println("Número de Nit:");
        String nit = dato.nextLine();

        System.out.println("Nombre del Empleado:");
        String nom = dato.nextLine();

        System.out.println("Fecha de Contratacion (dia/mes/año):");
        String fec = dato.nextLine();

        System.out.println("Cargo:");
        String car = dato.nextLine();

        System.out.println("Salario Mensual:");
        String sal = dato.nextLine();

        System.out.println("Descuento Renta Mensual:");
        String des = dato.nextLine();

// Asignando los valores ingresados a las variables de los atributos 
        trab.setNoNit(nit);
        trab.setNombreEmpleado(nom);
        trab.setFechaContratacion(fec);
        trab.setCargo(car);
        trab.setSalarioMensual(sal);
        trab.setDescuentoRentaMensual(des);

        int flag = 0;

        em.getTransaction().begin();
        try {
            em.persist(trab);  //Insert Into
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }
        return flag;
    }
// Método consultar (Read)

    public Trabajador consultarEmpleado(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Trabajador empleado = null;
        Scanner dato1 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Empleado a Consultar:");
        String nit = dato1.nextLine();
        em.getTransaction().begin();
        try {
            empleado = em.find(Trabajador.class, nit);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        if (empleado == null) {
            System.out.println("Datos no encontrados...");
        } else {
            System.out.println("Numero de Nit           :" + empleado.getNoNit());
            System.out.println("Nombre del Empleado     :" + empleado.getNombreEmpleado());
            System.out.println("Fecha de Contratacion   :" + empleado.getFechaContratacion());
            System.out.println("Cargo                   :" + empleado.getCargo());
            System.out.println("Salario Mensual         :" + empleado.getSalarioMensual());
            System.out.println("Descuento Renta Mensual :" + empleado.getDescuentoRentaMensual());
        }
        return empleado;
    }
// Método modificar (Update)

    public Trabajador modificarEmpleado(String nit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Trabajador empleado = null;
        Scanner dato2 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Empleado a Modificar:");
        nit = dato2.nextLine();
        em.getTransaction().begin();
        try {
            empleado = em.find(Trabajador.class, nit);
            //    empleado.setCargo(cargo);
            //    em.merge(empleado); //Update tabla de bd
            em.getTransaction().commit();
            //System.out.println("Modificado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            //System.out.println("No Modificado");
        }
        if (empleado == null) {
            System.out.println("Datos de Empleado No Encontrados...");
        } else {

            int flag2 = 0; // Salida de circulación
            while (flag2 == 0) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Dato a modificar?");
                System.out.println("2 -Nombre del Empleado");
                System.out.println("3 -Fecha de Contratacion");
                System.out.println("4 -Cargo");
                System.out.println("5 -Salario Mensual");
                System.out.println("6 -Descuento de la Renta Mensual");

                System.out.println("Ingrese el número de la Opción Seleccionada:");

                switch (sc1.nextInt()) {
                    case 2:
                        System.out.println("Ingrese cambio en Nombre:");
                        Scanner dato3 = new Scanner(System.in);
                        String nom = dato3.nextLine();
                        em.getTransaction().begin();
                        try {
                            empleado = em.find(Trabajador.class, nit);
                            empleado.setNombreEmpleado(nom);
                            em.merge(empleado); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 3:
                        System.out.println("Ingrese cambio en Fecha de Contratacion:");
                        Scanner dato4 = new Scanner(System.in);
                        String fec = dato4.nextLine();
                        em.getTransaction().begin();
                        try {
                            empleado = em.find(Trabajador.class, nit);
                            empleado.setFechaContratacion(fec);
                            em.merge(empleado); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 4:
                        System.out.println("Ingrese cambio en Cargo:");
                        Scanner dato5 = new Scanner(System.in);
                        String car = dato5.nextLine();
                        em.getTransaction().begin();
                        try {
                            empleado = em.find(Trabajador.class, nit);
                            empleado.setCargo(car);
                            em.merge(empleado); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 5:
                        System.out.println("Ingrese cambio en Salario Mensual:");
                        Scanner dato6 = new Scanner(System.in);
                        String sal = dato6.nextLine();
                        em.getTransaction().begin();
                        try {
                            empleado = em.find(Trabajador.class, nit);
                            empleado.setSalarioMensual(sal);
                            em.merge(empleado); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 6:
                        System.out.println("Ingrese cambio en Descuento de la Renta Mensual:");
                        Scanner dato7 = new Scanner(System.in);
                        String des = dato7.nextLine();
                        em.getTransaction().begin();
                        try {
                            empleado = em.find(Trabajador.class, nit);
                            empleado.setDescuentoRentaMensual(des);
                            em.merge(empleado); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    default:
                        break;
                }
            }
        }
        return empleado;
    }
// Método eliminar (Delete)

    public int eliminarEmpleado(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Trabajador empleado = null;
        Scanner dato3 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Empleado a Eliminar:");
        String nit = dato3.nextLine();
        int flag = 0;
        em.getTransaction().begin();
        try {
            empleado = em.find(Trabajador.class, nit);
            em.remove(empleado);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }
        return flag;
    }
}
