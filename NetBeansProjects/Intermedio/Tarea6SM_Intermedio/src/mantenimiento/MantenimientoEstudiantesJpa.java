/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

//Importación de librerías necesarias
import javax.persistence.EntityManager;
import persistencia.SvEstudiantes;

/**
 *
 * @author Saúl Valencia
 */
public class MantenimientoEstudiantesJpa {
// Clase Principal para ejecución de los métodos 
    public static void main(String[] args) {
// Instancia de la clase generada por ingenieria inversa       
        SvEstudiantes c = new SvEstudiantes();
// Instancia esta clase para invocar sus métodos porque no son static
        MantenimientoEstudiantesJpa man = new MantenimientoEstudiantesJpa();
// Seteo quemado de la información a guardar en la base de datos
        c.setCarnet("EG20151010");
        c.setApellidos("Gutierrez Enriquez");
        c.setNombres("Esteban Arnoldo");
        c.setDireccion("Santísima Trinidad 1, Ayutuxtepeque, No. 51");
        c.setTelefono("77776666");
        c.setCodigoCarrera("CI");
        c.setCodigoDepartamento("ME");
// Invocación del método guardar (Equivalente a Create)
//        System.out.println(man.guardarEstudiante(c));
// Invocación del método consultar (Equivalente a Read)
//       SvEstudiantes estudiante = man.consultarEstudiante("EG20151010");
//        
//        if (estudiante==null){
//            System.out.println("Datos no encontrados...");
//        } else {
//            System.out.println("No Carnet              :" + estudiante.getCarnet());
//            System.out.println("Apellidos              :" + estudiante.getApellidos());
//            System.out.println("Nombres                :" + estudiante.getNombres());
//            System.out.println("Dirección              :" + estudiante.getDireccion());
//            System.out.println("No Teléfono            :" + estudiante.getTelefono());
//            System.out.println("Código de Carrera      :" + estudiante.getCodigoCarrera());
//            System.out.println("Código de Departamento :" + estudiante.getCodigoDepartamento());
// Invocación del método modificar (Equivalente a Update)
            man.modificarEstudiante("LR20105040", "78513521");
// Invocación del método eliminar (Equivalente a Delete, con esto se completa el CRUD)            
        //    man.eliminarEstudiante("JE20013020");              
//        }

    }  
// Método guardar (Create)
    public int guardarEstudiante(SvEstudiantes estudiante) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        int flag = 0;

        em.getTransaction().begin();
        try {
            em.persist(estudiante);  //Insert Into
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }

        return flag;
    }
// Método consultar (Read)
    public SvEstudiantes consultarEstudiante(String Carnet) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvEstudiantes estudiante = null;

        em.getTransaction().begin();
        try {
            estudiante = em.find(SvEstudiantes.class, Carnet);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

        return estudiante;
    }
// Método modificar (Update)
    public SvEstudiantes modificarEstudiante(String Carnet, String telefono) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvEstudiantes estudiante = null;
        em.getTransaction().begin();
        try {
            estudiante = em.find(SvEstudiantes.class, Carnet);
            estudiante.setTelefono(telefono);
            em.merge(estudiante); //Update tabla de bd
            em.getTransaction().commit();
            System.out.println("Modificado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("No Modificado");
        }
        return estudiante;
    }
// Método eliminar (Delete)
    public int eliminarEstudiante(String Carnet) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvEstudiantes estudiante = null;
        int flag = 0;
        em.getTransaction().begin();
        try {
            estudiante = em.find(SvEstudiantes.class, Carnet);
            em.remove(estudiante);
            em.getTransaction().commit();
            flag = 1;
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
        }
        return flag;
    }
}
