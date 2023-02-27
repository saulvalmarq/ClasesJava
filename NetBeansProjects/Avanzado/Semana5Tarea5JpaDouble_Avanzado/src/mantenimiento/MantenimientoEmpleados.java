/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import java.util.Scanner;
import persistencia.Empleados;

/**
 *
 * @author Saul Valencia
 */
public class MantenimientoEmpleados {

// Método Guardar (Update)
    public int guardarEmpleado(Empleados empleados) {
        // Instancias de la clase principal y jpautil
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Empleados emp = new Empleados();
// Ingreso de datos necesarios mediante teclado para el guardar nuevos Empleados
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
        BigDecimal sala = new BigDecimal(sal);
        System.out.println("Descuento Renta Mensual:");
        String des = dato.nextLine();
        BigDecimal desc = new BigDecimal(des);

// Asignando los valores ingresados a las variables de los atributos 
        emp.setNoNit(nit);
        emp.setNombreEmpleado(nom);
        emp.setFechaContratacion(fec);
        emp.setCargo(car);
        emp.setSalarioMensual(sala);
        emp.setDescuentoRentaMensual(desc);

        int flag = 0;

        em.getTransaction().begin();
        try {
            em.persist(emp);  //Insert Into
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }
        return flag;
    }
// Método Consultar (Read)

    public Empleados consultarEmpleado(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Empleados empleado = null;
        Scanner dato1 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Empleado a Consultar:");
        String nit = dato1.nextLine();
        em.getTransaction().begin();
        try {
            empleado = em.find(Empleados.class, nit);
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
// Método Modificar (Update)

    public Empleados modificarEmpleado(String nit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Empleados empleado = null;
        Scanner dato2 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Empleado a Modificar:");
        nit = dato2.nextLine();
        em.getTransaction().begin();
        try {
            empleado = em.find(Empleados.class, nit);
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
                            empleado = em.find(Empleados.class, nit);
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
                            empleado = em.find(Empleados.class, nit);
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
                            empleado = em.find(Empleados.class, nit);
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
                        BigDecimal sala = new BigDecimal(sal);
                        
                        em.getTransaction().begin();
                        try {
                            empleado = em.find(Empleados.class, nit);
                            empleado.setSalarioMensual(sala);
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
                        BigDecimal desc = new BigDecimal(des);
                        em.getTransaction().begin();
                        try {
                            empleado = em.find(Empleados.class, nit);
                            empleado.setDescuentoRentaMensual(desc);
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
// Método Eliminar (Delete)

    public int eliminarEmpleado(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Empleados empleado = null;
        Scanner dato3 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Empleado a Eliminar:");
        String nit = dato3.nextLine();
        int flag = 0;
        em.getTransaction().begin();
        try {
            empleado = em.find(Empleados.class, nit);
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
