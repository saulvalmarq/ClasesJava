/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import java.util.Scanner;
import javax.persistence.Query;
import persistencia.Contribuyente;

/**
 *
 * @author Saul Valencia
 */
public class MantenimientoContribuyente {

// Método Guardar (Update)
    public int guardarContribuyente(Contribuyente contribuyente) throws ParseException {
       
        // Instancias de la clase principal y jpautil
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Contribuyente cont = new Contribuyente();
// Ingreso de datos necesarios mediante teclado para el guardar nuevos Empleados
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese por favor los Datos del Contribuyente:");
        System.out.println("Número de Nit:");
        String nit = dato.nextLine();

        System.out.println("Nombre del Contribuyente:");
        String nom = dato.nextLine();

        System.out.println("Razon Social:");
        String raz = dato.nextLine();

        System.out.println("Representante Legal:");
        String rep = dato.nextLine();

        System.out.println("Renta Anual:");
        String ren = dato.nextLine();
        BigDecimal renta = new BigDecimal(ren);
        System.out.println("Fecha de Registro (dia/mes/año):");
        String fec = dato.nextLine();
        Date fecha = formato.parse(fec);
        System.out.println("Estado Contribuyente (Activo / Inactivo):");
        String est = dato.nextLine();

// Asignando los valores ingresados a las variables de los atributos 
        cont.setNoNit(nit);
        cont.setNombreContribuyente(nom);
        cont.setRazonSocial(raz);
        cont.setRepresentanteLegal(rep);
        cont.setRentaAnual(renta);
        cont.setFechaRegistro(fecha);
        cont.setEstadoContribuyente(est);

        int flag = 0;

        em.getTransaction().begin();
        try {
            em.persist(cont);  //Insert Into
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }
        return flag;
    }
// Método Consultar (Read)

    public Contribuyente consultarContribuyente(String noNit) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Contribuyente contribuyente = null;
        Scanner dato1 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Contribuyente a Consultar:");
        String nit = dato1.nextLine();
        em.getTransaction().begin();
        try {
            contribuyente = em.find(Contribuyente.class, nit);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        if (contribuyente == null) {
            System.out.println("Datos no encontrados...");
        } else {
            System.out.println("Numero de Nit             :" + contribuyente.getNoNit());
            System.out.println("Nombre del Contribuyente  :" + contribuyente.getNombreContribuyente());
            System.out.println("Razon Social              :" + contribuyente.getRazonSocial());
            System.out.println("Representante Legal       :" + contribuyente.getRepresentanteLegal());
            System.out.println("Fecha de Registro         :" + formato.format(contribuyente.getFechaRegistro()));
            System.out.println("Estado del Contribuyente  :" + contribuyente.getEstadoContribuyente());
        }
        return contribuyente;
    }
// Método Modificar (Update)

    public Contribuyente modificarContribuyente(String noNit) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Contribuyente contribuyente = null;
        Scanner dato2 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Contribuyente a Modificar:");
        String nit = dato2.nextLine();
        em.getTransaction().begin();
        try {
            contribuyente = em.find(Contribuyente.class, nit);
            //    empleado.setCargo(cargo);
            //    em.merge(empleado); //Update tabla de bd
            em.getTransaction().commit();
            //System.out.println("Modificado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            //System.out.println("No Modificado");
        }
        if (contribuyente == null) {
            System.out.println("Datos de Contribuyente No Encontrados...");
        } else {

            int flag2 = 0; // Salida de circulación
            while (flag2 == 0) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Dato a modificar?");
                System.out.println("2 -Nombre del Contribuyente");
                System.out.println("3 -Razon Social");
                System.out.println("4 -Representante Legal");
                System.out.println("5 -Renta Anual");
                System.out.println("6 -Fecha de Registro");
                System.out.println("7 -Estado del Contribuyente(Activo o Inactivo)");

                System.out.println("Ingrese el número de la Opción Seleccionada:");

                switch (sc1.nextInt()) {
                    case 2:
                        System.out.println("Ingrese cambio en Nombre del Contribuyente:");
                        Scanner dato3 = new Scanner(System.in);
                        String nom = dato3.nextLine();
                        em.getTransaction().begin();
                        try {
                        //    contribuyente = em.find(Contribuyente.class, nit);
                            contribuyente.setNombreContribuyente(nom);
                            em.merge(contribuyente); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 3:
                        System.out.println("Ingrese cambio en Razon Social:");
                        Scanner dato4 = new Scanner(System.in);
                        String raz = dato4.nextLine();
                        em.getTransaction().begin();
                        try {
                        //    contribuyente = em.find(Contribuyente.class, nit);
                            contribuyente.setRazonSocial(raz);
                            em.merge(contribuyente); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 4:
                        System.out.println("Ingrese cambio en Representante Legal:");
                        Scanner dato5 = new Scanner(System.in);
                        String rep = dato5.nextLine();
                        em.getTransaction().begin();
                        try {
                        //    contribuyente = em.find(Contribuyente.class, nit);
                            contribuyente.setRepresentanteLegal(rep);
                            em.merge(contribuyente); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 5:
                        System.out.println("Ingrese cambio en Renta Anual:");
                        Scanner dato6 = new Scanner(System.in);
                        String ren = dato6.nextLine();
                        BigDecimal renta = new BigDecimal(ren);
                        
                        em.getTransaction().begin();
                        try {
                        //    contribuyente = em.find(Contribuyente.class, nit);
                            contribuyente.setRentaAnual(renta);
                            em.merge(contribuyente); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 6:
                        System.out.println("Ingrese cambio en Fecha de Registro (dia/mes/año):");
                        Scanner dato7 = new Scanner(System.in);
                        String fec = dato7.nextLine();
                        Date fecha = formato.parse(fec);
                        em.getTransaction().begin();
                        try {
                        //    contribuyente = em.find(Contribuyente.class, nit);
                            contribuyente.setFechaRegistro(fecha);
                            em.merge(contribuyente); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 7:
                        System.out.println("Ingrese cambio Estado del Contribuyente (Activo / Inactivo:");
                        Scanner dato8 = new Scanner(System.in);
                        String est = dato8.nextLine();                      
                        em.getTransaction().begin();
                        try {
                        //    contribuyente = em.find(Contribuyente.class, nit);
                            contribuyente.setEstadoContribuyente(est);
                            em.merge(contribuyente); //Update tabla de bd
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
        return contribuyente;
    }
// Método Eliminar (Delete)

    public int eliminarContribuyente(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Contribuyente contribuyente = null;
        Scanner dato3 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Nit del Contribuyente a Eliminar:");
        String nit = dato3.nextLine();
        int flag = 0;
        em.getTransaction().begin();
        try {
            contribuyente = em.find(Contribuyente.class, nit);
            em.remove(contribuyente);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }
        return flag;
    }
    public List consultarTodosContribuyentes() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List listaContribuyente = null;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Query query = em.createQuery("SELECT d FROM Contribuyente d");
            em.getTransaction().commit();
            listaContribuyente = query.getResultList();
            Iterator it = listaContribuyente.iterator();
            System.out.println("");
            System.out.println("  Numero de Nit  " +  "  Nombre de Contribuyente  " + "  Razon Social  " + "  Representante Legal  " + "  Renta Anual  " + "  Fecha de Registro  " + "  Estado  ");
            while (it.hasNext()) {
                Contribuyente d = (Contribuyente) it.next();
                System.out.println(d.getNoNit() + "     " + d.getNombreContribuyente()  + "     " + d.getRazonSocial()  + "     " + d.getRepresentanteLegal() + "     " + d.getRentaAnual()  + "     " + formato.format(d.getFechaRegistro())  + "     " + d.getEstadoContribuyente());
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
        }
        em.close();
        return listaContribuyente;
    }
}
