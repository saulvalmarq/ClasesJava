/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import persistencia.Departamentos;

/**
 *
 * @author Saúl Valencia
 */
public class MantenimientoDepartamentosJpa {

    public static void main(String[] args) {
        //Implementamos la logica para probar los metodos

        MantenimientoDepartamentosJpa man = new MantenimientoDepartamentosJpa();       
// Guardar
//        Departamentos d = new Departamentos();
//        //java.util.Date hoy = new java.util.Date();
//        d.setCodDepartamento ("10");
//        d.setNombreDepartamento("San Vicente");
//        //d.setFechaCreacion(hoy);
//        System.out.println("Respuesta: " + man.guardarDepartamento(d));


//        Departamentos d = new Departamentos();
//        //java.util.Date hoy = new java.util.Date();
//        d.setCodDepartamento ("11");
//        d.setNombreDepartamento("San Miguel");
//        //d.setFechaCreacion(hoy);
//        System.out.println("Respuesta: " + man.guardarDepartamento(d));
                
// Consultar

      Departamentos d = man.consultarDepartamento("10");
      System.out.println("Codigo Departamento:" + d.getCodDepartamento()); 
      System.out.println("Nombre Departamento:" + d.getNombreDepartamento());
   
// Modificar
//        Departamentos d = new Departamentos();
//        d.setCodDepartamento("10");
//        d.setNombreDepartamento("SAN VICENTE DOS");
////        d.getCodDepartamento();
////        d.getNombreDepartamento();
//        System.out.println("CodDepartamento: " + d.getCodDepartamento());
//        System.out.println("NombreDepartamento: " + d.getNombreDepartamento());
//        
//        System.out.println("Respuesta: " + man.modificarDepartamento(d.getCodDepartamento()));
    
// Eliminar

//        System.out.println("Respuesta:" + man.eliminarDepartamento("10"));

// Consultar Todos
//          man.consultarTodosDepartamentos();
          
          
//        List listaDepartamentos = man.consultarTodosDepartamentos();
//        Iterator it = listaDepartamentos.iterator();
//        while (it.hasNext()) {
//            Departamentos d = (Departamentos) it.next();
//            
//        //    System.out.println("Codigo Departamento: " + d.getCodDepartamento()+ " Nombre Departamento: " + d.getNombreDepartamento());
//        //   System.out.println("Nombre Departamento: " + d.getNombreDepartamento());
//           System.out.println(d);
//        }

    }

    public int guardarDepartamento(Departamentos departamentos) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(departamentos);
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

    public Departamentos consultarDepartamento(String codDepartamento) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Departamentos departamentos = null;
        em.getTransaction().begin();
        try {
            departamentos = em.find(Departamentos.class, codDepartamento);//Select Where
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return departamentos;
    }

    public Departamentos modificarDepartamento(String codDepartamento) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Departamentos d = new Departamentos();
        Departamentos departamento = null;
        int flag = 0;
        em.getTransaction().begin();
        try {
            departamento = em.find(Departamentos.class, d.getCodDepartamento());
            departamento.setNombreDepartamento(d.getNombreDepartamento());
            em.merge(departamento);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return departamento;
    }
    public int eliminarDepartamento(String codDepartamento) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Departamentos departamento = null;
        em.getTransaction().begin();
        int flag = 0;
        try {
            departamento = em.find(Departamentos.class, codDepartamento);
            em.remove(departamento);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.close();
        }
        return flag;
    }

    public List consultarTodosDepartamentos() {

        List listaDepartamentos = null;
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {
            Query query = em.createQuery("SELECT d FROM Departamentos d");
            em.getTransaction().commit();
            listaDepartamentos = query.getResultList();
            Iterator it = listaDepartamentos.iterator();
            while (it.hasNext()) {
                Departamentos d = (Departamentos) it.next();
                System.out.println("Codigo Departamento: " + d.getCodDepartamento());
                System.out.println("NombreDepartamento: " + d.getNombreDepartamento());
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
        }
        em.close();
        return listaDepartamentos;
    }
}
