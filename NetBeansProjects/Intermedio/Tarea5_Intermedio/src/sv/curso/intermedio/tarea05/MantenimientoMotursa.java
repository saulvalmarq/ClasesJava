/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.tarea05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//import java.sql.*;

/**
 *
 * @author Saúl Valencia
 */
// Segunda Clase Creada para incluir todos los métodos a usar
public class MantenimientoMotursa {

// Constructor para llamar al método que carga el Driver de la base de datos
    public MantenimientoMotursa() {
        cargarDriver();
    }
// Método para carga de Driver de la base de datos

    public void cargarDriver() {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Cargado Satisfactoriamente...");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver No Pudo ser Cargado...");
        }
    }
// Método para proporcionar los datos de conexión a la base y asegurar que conecta  

    public Connection conectarBaseDatos() {
        String url = "jdbc:postgresql://proyectos.coehxub0jkfc.us-east-2.rds.amazonaws.com:5432/proyectos";
        String usuario = "Edutech";
        String password = "practicaEdu";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, usuario, password);
            System.out.println("");
            System.out.println("Conexion Satisfactoria a la Base de Datos...\n");
        } catch (SQLException ex) {
            System.out.println("Conexion a la Base de Datos no se pudo establecer...\n");
        }
        return conn;
    }
// Método para guardar Información    

    public int GuardarMotursa(Motursa motursa) {
        int flag = 0; // Salida de circulación
        // Usando la Clase Scanner como fue solicitado 
        Scanner dato = new Scanner(System.in);
        System.out.println("------ Mantenimiento Motursa Guardar  ------");

        System.out.println("Numero de Nit:");
        String nit = dato.nextLine();

        System.out.println("Nombre:");
        String nom = dato.nextLine();

        System.out.println("Dirección:");
        String direc = dato.nextLine();

        System.out.println("Teléfono:");
        String telef = dato.nextLine();

        System.out.println("Salario：");
        Double salar = dato.nextDouble();
// Considerando un 10% de Descuento de Renta
        Double descuento = salar * 0.10;
        //System.out.println("Respuesta: " + GuardarMotursa(motursa));
        motursa.setNoNit(nit);
        motursa.setNombre(nom);
        motursa.setDireccion(direc);
        motursa.setTelefono(telef);
        motursa.setSalario(salar);
        motursa.setDescuentoRenta(descuento);

        PreparedStatement ps = null;
        Connection conn = conectarBaseDatos();
        try {
            String sSql = "";
            sSql = sSql + "insert into public.sv_motursa ";
            sSql = sSql + "(no_nit, nombre, direccion, ";
            sSql = sSql + "telefono, salario_mensual, descuento_renta)";
            sSql = sSql + " VALUES ";
            sSql = sSql + "(?, ?, ?, ?, ?, ?)";

            ps = conn.prepareStatement(sSql);
            ps.setString(1, motursa.getNoNit());
            ps.setString(2, motursa.getNombre());
            ps.setString(3, motursa.getDireccion());
            ps.setString(4, motursa.getTelefono());
            ps.setDouble(5, motursa.getSalario());
            ps.setDouble(6, motursa.getDescuentoRenta());

            flag = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }

        return flag;
    }

// Método para Consultar Información guardada   
    public Motursa ConsultarMotursa(String noNit) {
        Scanner dato = new Scanner(System.in);
        System.out.println("------ Mantenimiento Motursa Consultar  ------");
        System.out.println("Numero de Nit:");
        String nit = dato.nextLine();

        Statement stmt = null;
        ResultSet rs = null;
        Motursa motursa = null;
        Connection conn = conectarBaseDatos();
        try {
            String sql = "select * from public.sv_motursa where no_nit='" + nit + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                motursa = new Motursa();
                motursa.setNoNit(rs.getString(1));
                motursa.setNombre(rs.getString(2));
                motursa.setDireccion(rs.getString(3));
                motursa.setTelefono(rs.getString(4));
                motursa.setSalario(rs.getDouble(5));
                motursa.setDescuentoRenta(rs.getDouble(6));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
        //    Motursa motursas = mantenimiento.consultarMotursa(nit);
        if (motursa == null) {
            System.out.println("Datos de Motursa No Encontrados...");
        } else {
            System.out.println("No Nit             : " + motursa.getNoNit());
            System.out.println("Nombre             : " + motursa.getNombre());
            System.out.println("Dirección          : " + motursa.getDireccion());
            System.out.println("Teléfono           : " + motursa.getTelefono());
            System.out.println("Salario            : " + motursa.getSalario());
            System.out.println("Descuento de Renta : " + motursa.getDescuentoRenta());
        }
        return motursa;
    }

// Método para modificar Información
    public int ModificarMotursa(Motursa motursa) throws SQLException {
        int flag = 0; // Salida de circulación
        Scanner dato = new Scanner(System.in);
        System.out.println("------ Mantenimiento Motursa Modificar  ------");
        System.out.println("Numero de Nit:");
        String nit = dato.nextLine();

        Statement stmt = null;
        ResultSet rs = null;
        motursa = null;
        Connection conn = conectarBaseDatos();
        
        String sql = "select * from public.sv_motursa where no_nit='" + nit + "'";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            motursa = new Motursa();
            motursa.setNoNit(rs.getString(1));
            motursa.setNombre(rs.getString(2));
            motursa.setDireccion(rs.getString(3));
            motursa.setTelefono(rs.getString(4));
            motursa.setSalario(rs.getDouble(5));
            motursa.setDescuentoRenta(rs.getDouble(6));
        }

        if (motursa == null) {
            System.out.println("Datos de Motursa No Encontrados...");
        } else {

            int flag2 = 0; // Salida de circulación
            while (flag2 == 0) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Dato a modificar?");
                System.out.println("2 -Nombre");
                System.out.println("3 -Dirección");
                System.out.println("4 -Telefono");
                System.out.println("5 -Salario Mensual");
                System.out.println("6 -Salir");
                System.out.println("Ingrese el número de la Opción Seleccionada:");

                switch (sc1.nextInt()) {
                    case 2:
                        System.out.println("Ingrese nuevo Nombre:");
                        String nom = dato.nextLine();
                        motursa.setNoNit(nit);
                        motursa.setNombre(nom);
                        flag2 = 1;
                        break;
                    case 3:
                        System.out.println("Ingrese nueva Dirección:");
                        String direc = dato.nextLine();
                        motursa.setDireccion(direc);
                        flag2 = 1;
                        break;
                    case 4:
                        System.out.println("Ingrese nuevo Teléfono:");
                        String telef = dato.nextLine();
                        motursa.setTelefono(telef);
                        flag2 = 1;
                        break;
                    case 5:
                        System.out.println("Ingrese nuevo Salario Mensual:");
                        Double sal = dato.nextDouble();
                        motursa.setSalario(sal);
                        Double des = sal * 0.10;
                        motursa.setDescuentoRenta(des);
                        flag2 = 1;
                        break;
                    default:
                        break;
                }

                PreparedStatement ps = null;
                try {
                    String sSql = "";
                    sSql = sSql + "update public.sv_motursa ";
                    sSql = sSql + "set nombre=?, direccion=?, ";
                    sSql = sSql + "telefono=?, salario_mensual=?, descuento_renta=? ";
                    sSql = sSql + "where no_nit=?";

                    ps = conn.prepareStatement(sSql);
                    ps.setString(1, motursa.getNombre());
                    ps.setString(2, motursa.getDireccion());
                    ps.setString(3, motursa.getTelefono());
                    ps.setDouble(4, motursa.getSalario());
                    ps.setDouble(5, motursa.getDescuentoRenta());
                    ps.setString(6, motursa.getNoNit());
                    flag = ps.executeUpdate(); //Actualizacion -
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (rs != null) {
                            rs.close();
                        }
                        if (stmt != null) {
                            stmt.close();
                        }              
                        if (ps != null) {
                            ps.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (SQLException ex) {
                    }
                }
            }
        }
        return flag;
    }
// Método para eliminar Información (fila completa según el nit proporcionado)

    public int EliminarMotursa() {
        Scanner dato = new Scanner(System.in);
        System.out.println("------ Mantenimiento Motursa Eliminar  ------");
        System.out.println("Numero de Nit:");
        String nit = dato.nextLine();
        //String noNit = nit;
        int flag = 0;
        PreparedStatement ps = null;
        Connection conn = conectarBaseDatos();
        try {
            String sSql = "";
            sSql = sSql + "delete from public.sv_motursa where no_nit=?";

            ps = conn.prepareStatement(sSql);
            ps.setString(1, nit);
            flag = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
        return flag;
    }
}
