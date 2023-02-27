/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

import javax.persistence.EntityManager;
import persistencia.Empleados;

/**
 *
 * @author Saul Valencia
 */
public class MantenimientoEmpleados {
// Clase Principal para ejecución de los métodos 
    public static void main(String[] args) {
// Instancia de la clase generada por ingenieria inversa       
       Empleados empleado = new Empleados();
// Instancia esta clase para invocar sus métodos porque no son static
        MantenimientoEmpleados manto = new MantenimientoEmpleados();
    }  
// Método guardar (Create)
    public int guardarEmpleado(Empleados empleado) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
//        Empleados empleado = new Empleados();
        int flag = 0;

        em.getTransaction().begin();
        try {
            em.persist(empleado);  //Insert Into
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }

        return flag;
    }
// Método consultar (Read)
    public Empleados consultarEmpleado(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Empleados empleado = null;

        em.getTransaction().begin();
        try {
            empleado = em.find(Empleados.class, noNit);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

        return empleado;
    }
// Método modificar (Update)
    public Empleados modificarEmpleado(String noNit, String cargo) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Empleados empleado = null;
        em.getTransaction().begin();
        try {
            empleado = em.find(Empleados.class, noNit);
            empleado.setCargo(cargo);
            em.merge(empleado); //Update tabla de bd
            em.getTransaction().commit();
            //System.out.println("Modificado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            //System.out.println("No Modificado");
        }
        return empleado;
    }
// Método eliminar (Delete)
    public int eliminarEmpleado(String noNit) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        Empleados empleado = null;
        int flag = 0;
        em.getTransaction().begin();
        try {
            empleado = em.find(Empleados.class, noNit);
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


