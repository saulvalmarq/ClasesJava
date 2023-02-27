/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mantenimiento;

//Importación de librerías necesarias
import java.util.Scanner;
import javax.persistence.EntityManager;
import persistencia.SvEstudiantes;

/**
 *
 * @author Saúl Valencia
 */
// Clase Principal
public class MantenimientoEstudiantesJpa {
// Método para guardar (Create)  

    public int guardarEstudiante(SvEstudiantes estudiante) {
// Instancias de la clase principal y secundaria           
        SvEstudiantes c = new SvEstudiantes();
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
// Ingreso de datos necesarios mediante teclado para el guardado de nuevos Estudiantes
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese por favor los Datos del Estudiante:");
        System.out.println("Número de Carnet:");
        String car = dato.nextLine();

        System.out.println("Apellidos:");
        String ape = dato.nextLine();

        System.out.println("Nombres:");
        String nom = dato.nextLine();

        System.out.println("Dirección:");
        String dir = dato.nextLine();

        System.out.println("Teléfono:");
        String tel = dato.nextLine();

        System.out.println("Código de Carrera:");
        String carr = dato.nextLine();

        System.out.println("Codigo de Departamento:");
        String dep = dato.nextLine();

// Asignando los valores ingresados a las variables de los atributos 
        c.setCarnet(car);
        c.setApellidos(ape);
        c.setNombres(nom);
        c.setDireccion(dir);
        c.setTelefono(tel);
        c.setCodigoCarrera(carr);
        c.setCodigoDepartamento(dep);

// Envío hacia la base de datos mediante EntityManager      
        int flag = 0;

        em.getTransaction().begin();
        try {
            em.persist(c);  //Insert Into
            em.getTransaction().commit();
            flag = 1;
            System.out.println("Guardado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
            System.out.println("No Guardado");
        }
        return flag;

    }
// Método Consultar (Read)

    public SvEstudiantes consultarEstudiante(String Carnet) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvEstudiantes estudiante = null;
        Scanner dato1 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Carnet del Estudiante a Consultar:");
        String car = dato1.nextLine();

        // SvEstudiantes estudiante = consultarEstudiante(car);
        em.getTransaction().begin();
        try {
            estudiante = em.find(SvEstudiantes.class, car);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        if (estudiante == null) {
            System.out.println("Datos no encontrados...");
        } else {
            System.out.println("No Carnet              :" + estudiante.getCarnet());
            System.out.println("Apellidos              :" + estudiante.getApellidos());
            System.out.println("Nombres                :" + estudiante.getNombres());
            System.out.println("Dirección              :" + estudiante.getDireccion());
            System.out.println("No Teléfono            :" + estudiante.getTelefono());
            System.out.println("Código de Carrera      :" + estudiante.getCodigoCarrera());
            System.out.println("Código de Departamento :" + estudiante.getCodigoDepartamento());
        }
        return estudiante;
    }

// Método Modificar (Update)
    public SvEstudiantes modificarEstudiante(String Carnet, String telefono) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvEstudiantes estudiante = null;
        Scanner dato2 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Carnet del Estudiante a Modificar:");
        String carn = dato2.nextLine();
        em.getTransaction().begin();
        try {
            estudiante = em.find(SvEstudiantes.class, carn);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        if (estudiante == null) {
            System.out.println("Datos de Estudiante No Encontrados...");
        } else {

            int flag2 = 0; // Salida de circulación
            while (flag2 == 0) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Dato a modificar?");
                System.out.println("2 -Apellidos");
                System.out.println("3 -Nombres");
                System.out.println("4 -Dirección");
                System.out.println("5 -Telefono");
                System.out.println("6 -Código de Carrera");
                System.out.println("7 -Código de Departamento");
                System.out.println("Ingrese el número de la Opción Seleccionada:");

                switch (sc1.nextInt()) {
                    case 2:
                        System.out.println("Ingrese cambio en Apellidos:");
                        Scanner dato3 = new Scanner(System.in);
                        String ape = dato3.nextLine();
                        em.getTransaction().begin();
                        try {
                            estudiante = em.find(SvEstudiantes.class, carn);
                            estudiante.setApellidos(ape);
                            em.merge(estudiante); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 3:
                        System.out.println("Ingrese cambio en Nombres:");
                        Scanner dato4 = new Scanner(System.in);
                        String nom = dato4.nextLine();
                        em.getTransaction().begin();
                        try {
                            estudiante = em.find(SvEstudiantes.class, carn);
                            estudiante.setNombres(nom);
                            em.merge(estudiante); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 4:
                        System.out.println("Ingrese cambio en Dirección:");
                        Scanner dato5 = new Scanner(System.in);
                        String direc = dato5.nextLine();
                        em.getTransaction().begin();
                        try {
                            estudiante = em.find(SvEstudiantes.class, carn);
                            estudiante.setDireccion(direc);
                            em.merge(estudiante); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 5:
                        System.out.println("Ingrese cambio en Número de Teléfono:");
                        Scanner dato6 = new Scanner(System.in);
                        String telef = dato6.nextLine();
                        em.getTransaction().begin();
                        try {
                            estudiante = em.find(SvEstudiantes.class, carn);
                            estudiante.setTelefono(telef);
                            em.merge(estudiante); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 6:
                        System.out.println("Ingrese cambio en Código de Carrera:");
                        Scanner dato7 = new Scanner(System.in);
                        String carr = dato7.nextLine();
                        em.getTransaction().begin();
                        try {
                            estudiante = em.find(SvEstudiantes.class, carn);
                            estudiante.setCodigoCarrera(carr);
                            em.merge(estudiante); //Update tabla de bd
                            em.getTransaction().commit();
                            System.out.println("Modificado");
                        } catch (Exception e) {
                            em.getTransaction().rollback();
                            System.out.println("No Modificado");
                        }
                        flag2 = 1;
                        break;
                    case 7:
                        System.out.println("Ingrese cambio en Código de Departamento:");
                        Scanner dato8 = new Scanner(System.in);
                        String dep = dato8.nextLine();
                        em.getTransaction().begin();
                        try {
                            estudiante = em.find(SvEstudiantes.class, carn);
                            estudiante.setCodigoDepartamento(dep);
                            em.merge(estudiante); //Update tabla de bd
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
        return estudiante;
    }
// Método Eliminar (Delete)

    public int eliminarEstudiante(String Carnet) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        SvEstudiantes estudiante = null;
        Scanner dato3 = new Scanner(System.in);
        System.out.println("Ingrese el Número de Carnet del Estudiante a Eliminar:");
        String carne = dato3.nextLine();
        int flag = 0;
        em.getTransaction().begin();
        try {
            estudiante = em.find(SvEstudiantes.class, carne);
            em.remove(estudiante);
            em.getTransaction().commit();
            flag = 1;
            System.out.println("Eliminado");
        } catch (Exception e) {
            em.getTransaction().rollback();
            flag = 0;
            System.out.println("No Eliminado");
        }
        return flag;
    }
}
