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

    public int guardarDepartamento(Departamentos departamento) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;
        JpaUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
        try {

            em.persist(departamento);
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
            departamentos = em.find(Departamentos.class, codDepartamento);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return departamentos;
    }

    public int modificarDepartamento(String codDepartamento) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Departamentos d = new Departamentos();
        Departamentos departamento = null;
        int flag = 0;
        em.getTransaction().begin();
        try {
            departamento = em.find(Departamentos.class, d.getCodDepartamento());
            departamento.setCodDepartamento(d.getNombreDepartamento());
            em.merge(departamento);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return flag;
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
            Query query = em.createQuery("SELECT e FROM Departamentos e");
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
