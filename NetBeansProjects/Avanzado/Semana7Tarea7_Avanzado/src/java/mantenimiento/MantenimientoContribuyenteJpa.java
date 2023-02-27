/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import persistencia.Contribuyente;

/**
 *
 * @author Saúl Valencia
 */
public class MantenimientoContribuyenteJpa {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        //Logica para probar los metodos
        MantenimientoContribuyenteJpa man = new MantenimientoContribuyenteJpa();
//        Contribuyente cont = new Contribuyente();
// Guardar
//        Contribuyente cont = new Contribuyente();
//        cont.setNoNit("06141807471321");
//        cont.setNombreContribuyente("Maria Hortensia Burgos Ramirez");
//        cont.setRazonSocial("Empresa Margot");
//        cont.setRepresentanteLegal("Javier Ulises Melendez Turcios");
//        cont.setRentaAnual(BigDecimal.valueOf(7777.77));
//       cont.setFechaRegistro(formato.parse("18/07/1967"));
//        cont.setEstadoContribuyente("Inactivo");
//
//        System.out.println("Respuesta: " + man.guardarContribuyente(cont));

// Consultar
//      Contribuyente cont = man.consultarContribuyente("06141807471321");
//      System.out.println("");
//      System.out.println("  Numero de Nit    " +  "    Nombre de Contribuyente    " + "    Razon Social    " + "      Representante Legal    " + "       Renta Anual  " + "Fecha de Registro " + "  Estado  ");
//      System.out.println(cont.getNoNit() + "     " + cont.getNombreContribuyente()  + "     " + cont.getRazonSocial()  + "     " + cont.getRepresentanteLegal() + "     " + cont.getRentaAnual()  + "     " + formato.format(cont.getFechaRegistro())  + "     " + cont.getEstadoContribuyente());

// Modificar
//        Contribuyente cont = man.consultarContribuyente("06141807471321");
//        System.out.println("  Numero de Nit    " +  "    Nombre de Contribuyente    " + "    Razon Social    " + "      Representante Legal    " + "       Renta Anual  " + "Fecha de Registro " + "  Estado  ");
//        System.out.println(cont.getNoNit() + "     " + cont.getNombreContribuyente()  + "     " + cont.getRazonSocial()  + "     " + cont.getRepresentanteLegal() + "     " + cont.getRentaAnual()  + "     " + formato.format(cont.getFechaRegistro())  + "     " + cont.getEstadoContribuyente());
//        System.out.println("");
//        man.modificarContribuyente(cont.getNoNit());
//        System.out.println("Respuesta: " + man.modificarContribuyente(cont.getNoNit()));
//        cont.setNombreContribuyente("Maria Antonia Burgos Ramirez");
//        System.out.println("  Numero de Nit    " +  "    Nombre de Contribuyente    " + "    Razon Social    " + "      Representante Legal    " + "       Renta Anual  " + "Fecha de Registro " + "  Estado  ");
//        System.out.println(cont.getNoNit() + "     " + cont.getNombreContribuyente()  + "     " + cont.getRazonSocial()  + "     " + cont.getRepresentanteLegal() + "     " + cont.getRentaAnual()  + "     " + formato.format(cont.getFechaRegistro())  + "     " + cont.getEstadoContribuyente());

// Eliminar
//       System.out.println("Respuesta:" + man.eliminarContribuyente("06141807471321"));

// Consultar Todos
//       man.consultarTodosContribuyentes();

    }

    public int guardarContribuyente(Contribuyente contribuyente) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(contribuyente);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();

            flag = 0;
        } finally {
            em.close();
        }
        return flag;
    }

    public Contribuyente consultarContribuyente(String noNit) {
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        //Contribuyente cont = new Contribuyente();
        Contribuyente contribuyente = null;
        em.getTransaction().begin();
        try {
            contribuyente = em.find(Contribuyente.class, noNit);//Select Where
           em.getTransaction().commit();          
     } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
        return contribuyente;
    }

    public Contribuyente modificarContribuyente(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        //Contribuyente cont = new Contribuyente();
        Contribuyente contribuyente = null;
        int flag = 0;
        em.getTransaction().begin();
        contribuyente = em.find(Contribuyente.class, noNit);
        try {
            contribuyente.setNombreContribuyente(contribuyente.getNombreContribuyente());
            em.merge(contribuyente);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return contribuyente;
    }

    public int eliminarContribuyente(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Contribuyente contribuyente = null;
        em.getTransaction().begin();
        int flag = 0;
        try {
            contribuyente = em.find(Contribuyente.class, noNit);
            em.remove(contribuyente);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.close();
        }
        return flag;
    }

    public List consultarTodosContribuyentes() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List listaContribuyente = null;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Query query = em.createQuery("SELECT c FROM Contribuyente c");
            em.getTransaction().commit();
            listaContribuyente = query.getResultList();
            Iterator it = listaContribuyente.iterator();
            System.out.println("");
            System.out.println("  Numero de Nit    " +  "    Nombre de Contribuyente    " + "    Razon Social    " + "      Representante Legal    " + "       Renta Anual  " + "Fecha de Registro " + "  Estado  ");
            while (it.hasNext()) {
                Contribuyente cont = (Contribuyente) it.next();
                System.out.println(cont.getNoNit() + "     " + cont.getNombreContribuyente()  + "     " + cont.getRazonSocial()  + "     " + cont.getRepresentanteLegal() + "     " + cont.getRentaAnual()  + "     " + formato.format(cont.getFechaRegistro())  + "     " + cont.getEstadoContribuyente());
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
        }
        em.close();
        return listaContribuyente;
        }
    }
