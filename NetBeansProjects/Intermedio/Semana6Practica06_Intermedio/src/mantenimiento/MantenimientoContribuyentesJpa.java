/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import persistencia.SvContribuyentes;

/**
 *
 * @author Saúl Valencia
 */
public class MantenimientoContribuyentesJpa {

    public static void main(String[] args) {
        SvContribuyentes c = new SvContribuyentes();
        MantenimientoContribuyentesJpa man = new MantenimientoContribuyentesJpa();

        c.setNoNit("06142409731020");
        c.setNombreContribuyente("Ricardo Acevedo");
        c.setRazonSocial("Soporte a Software Libre");
        c.setRentaAnual(new BigDecimal(5000.0));
        c.setRepresentanteLegal("Víctor García");

       System.out.println(man.guardarContribuyente(c));
//       SvContribuyentes contribuyente = man.consultarContribuyente("06142902011020");
        
//        if (contribuyente==null){
//            System.out.println("Datos no encontrados...");
//        } else {
//            System.out.println("No Nit       :" + contribuyente.getNoNit());
//            System.out.println("Nombret      :" + contribuyente.getNombreContribuyente());
//            System.out.println("Renta        :" + contribuyente.getRentaAnual());
//            System.out.println("Representante:" + contribuyente.getRepresentanteLegal());
//            
         //   man.modificarContribuyente("06143010701992", "Oscar Ramirez");
         //   man.eliminarContribuyente("06142902011020");              
//        }

    }

    public int guardarContribuyente(SvContribuyentes contribuyente) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;

        em.getTransaction().begin();
        try {
            em.persist(contribuyente);  //Insert Into
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }

        return flag;
    }

    public SvContribuyentes consultarContribuyente(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvContribuyentes contribuyente = null;

        em.getTransaction().begin();
        try {
            contribuyente = em.find(SvContribuyentes.class, noNit);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

        return contribuyente;
    }

    public SvContribuyentes modificarContribuyente(String noNit, String representanteLegal) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvContribuyentes contribuyente = null;
        em.getTransaction().begin();
        try {
            contribuyente = em.find(SvContribuyentes.class, noNit);
            contribuyente.setRepresentanteLegal(representanteLegal);
            em.merge(contribuyente); //Update tabla de bd
            em.getTransaction().commit();
            System.out.println("Modificado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("No Modificado");
        }
        return contribuyente;
    }

    public int eliminarContribuyente(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvContribuyentes contribuyente = null;
        int flag = 0;
        em.getTransaction().begin();
        try {
            contribuyente = em.find(SvContribuyentes.class, noNit);
            em.remove(contribuyente); //Deele Where
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }
        return flag;
    }
}
