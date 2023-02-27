/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana5;
/**
 *
 * @author Saúl Valencia
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
    
//import java.sql.*;

public class MantenimientoContribuyentes {
   
   
   public MantenimientoContribuyentes(){
       cargarDriver();
   }
   
   public void cargarDriver(){
       try{
           Class.forName("org.postgresql.Driver");
           System.out.println("Driver Cargado Satisfactoriamente...");
       } catch (ClassNotFoundException ex){
           System.out.println("Driver No Pudo ser Cargado...");
       }                          
   }
   
   public Connection conectarBaseDatos(){
      String url = "jdbc:postgresql://proyectos.coehxub0jkfc.us-east-2.rds.amazonaws.com:5432/proyectos";
      String usuario = "Edutech";
      String password = "practicaEdu";
      Connection conn=null;
      
      try{
        conn = DriverManager.getConnection(url, usuario , password);
        System.out.println("Conexion Satisfactoria a la Base de Datos...");
      } catch (SQLException ex){
          System.out.println("Conexion a la Base de Datos no se pudo establecer...");      
      }
      
      return conn;
   }

    public static void main(String[] args) {
        MantenimientoContribuyentes mantenimiento = new MantenimientoContribuyentes();
        Contribuyentes contribuyente = new Contribuyentes();
        
       // mantenimiento.conectarBaseDatos();
        
        contribuyente.setNoNit("06142902011020");
        contribuyente.setNombreContribuyente("De Fuente Libre");
        contribuyente.setRazonSocial("Servicios de Mantenimiento al Software Libre");
        contribuyente.setRepresentanteLegal("Saul Valencia");
        contribuyente.setRentaAnual(5000);
     //   System.out.println("Respuesta: " + mantenimiento.guardarContribuyente(contribuyente));
        
//        Contribuyentes contribuyentes=mantenimiento.consultarContribuyente("06143010901159");
//        if (contribuyentes==null){
//            System.out.println("Datos del Contribuyente No Encontrados...");
//        } else {
//            System.out.println("No Nit              : " + contribuyentes.getNoNit());
//            System.out.println("Nombre Contribuyente: " + contribuyentes.getNombreContribuyente());
//            System.out.println("Razon Social        : " + contribuyentes.getRazonSocial());
//            System.out.println("Representante Legal : " + contribuyentes.getRepresentanteLegal());
//            System.out.println("Renta Anual         : " + contribuyentes.getRentaAnual());  
            
        //   contribuyente.setRepresentanteLegal("Saul Valencia");
            
            Contribuyentes contri = new Contribuyentes();
            //contri.setNoNit("06143010901159");
            contri.setNoNit("06142110681159");
        //    contri.setRepresentanteLegal("Antonio Marquez");
            
        //System.out.println(mantenimiento.modificarContribuyente(contri));
        
//        }        
    }
    
    public int guardarContribuyente(Contribuyentes contribuyentes) {
        int flag = 0;
        PreparedStatement ps = null;
        Connection conn = conectarBaseDatos();
        try {
            String sSql = "";
            sSql = sSql + "insert into public.sv_contribuyentes ";
            sSql = sSql + "(no_nit, nombre_contribuyente, razon_social, ";
            sSql = sSql + "representante_legal, renta_anual)";
            sSql = sSql + " VALUES ";
            sSql = sSql + "(?, ?, ?, ?, ?)";
                        
            ps = conn.prepareStatement(sSql);
            ps.setString(1, contribuyentes.getNoNit());
            ps.setString(2, contribuyentes.getNombreContribuyente());
            ps.setString(3, contribuyentes.getRazonSocial());
            ps.setString(4, contribuyentes.getRepresentanteLegal());
            ps.setDouble(5, contribuyentes.getRentaAnual());
            flag = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
        return flag;
    }
    
    public Contribuyentes consultarContribuyente(String noNit){
        Statement stmt = null;
        ResultSet rs = null;
        Contribuyentes contribuyentes = null;
        Connection conn = conectarBaseDatos();
        try {
            String sql = "select * from public.sv_contribuyentes where no_nit='" + noNit + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                contribuyentes = new Contribuyentes();
                contribuyentes.setNoNit(rs.getString(1));
                contribuyentes.setNombreContribuyente(rs.getString(2));
                contribuyentes.setRazonSocial(rs.getString(3));
                contribuyentes.setRepresentanteLegal(rs.getString(4));
                contribuyentes.setRentaAnual(rs.getDouble(5));
            }
        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
        return contribuyentes;
    }

    public int modificarContribuyente(Contribuyentes contribuyentes) {
        int flag = 0;
        PreparedStatement ps = null;
        Connection conn = conectarBaseDatos();
        try {
            String sSql = "";
            sSql = sSql + "update public.sv_contribuyentes ";
            sSql = sSql + "set nombre_contribuyente=?, razon_social=?, ";
            sSql = sSql + "representante_legal=?, renta_anual=? ";
            sSql = sSql + "where no_nit=?";
                        
            ps = conn.prepareStatement(sSql);            
            ps.setString(1, contribuyentes.getNombreContribuyente());
            ps.setString(2, contribuyentes.getRazonSocial());
            ps.setString(3, contribuyentes.getRepresentanteLegal());
            ps.setDouble(4, contribuyentes.getRentaAnual());
            ps.setString(5, contribuyentes.getNoNit());
            flag = ps.executeUpdate(); //Actualizacion -
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
        return flag;
    }
}

