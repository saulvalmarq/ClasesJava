/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.curso.intermedio.semana5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;
/**
 *
 * @author Saúl Valencia
 */
public class MantenimientoMotursa {

// Constructor para llamar al método que carga el Driver de la base de datos
   public MantenimientoMotursa(){
       cargarDriver();
   }
// Método para carga de Driver de la base de datos
   public void cargarDriver(){
       try{
           Class.forName("org.postgresql.Driver");
           System.out.println("Driver Cargado Satisfactoriamente...");
       } catch (ClassNotFoundException ex){
           System.out.println("Driver No Pudo ser Cargado...");
       }                          
   }
// Método para proporcionar los datos de conexión a la base y asegurar que conecta  
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
// Método Principal
    public static void main(String[] args) {
// Instancias de la clase principal y secundaria         
        MantenimientoMotursa mantenimiento = new MantenimientoMotursa();
        Motursa motursa = new Motursa();
        
        //mantenimiento.conectarBaseDatos();
// Información quemada para la inserción a la base de datos        
        motursa.setNoNit("06143010901159");
        motursa.setNombre("José Gregorio Martinez Ayala");
        motursa.setDireccion("Calle Antiguo Ferrocarril, Pasaje Maracaibo, No.12");
        motursa.setTelefono("87654321");
        motursa.setSalario(1000.00);
        motursa.setDescuentoRenta(100.00);
        
//    System.out.println("Respuesta: " + mantenimiento.guardarMotursa(motursa));
//--------------- 
// Consulta de la información guardada 
       Motursa motursas = mantenimiento.consultarMotursa("06143010901159");
        if (motursas==null){
            System.out.println("Datos de Motursa No Encontrados...");
        } else {
            System.out.println("No Nit             : " + motursas.getNoNit());
            System.out.println("Nombre             : " + motursas.getNombre());
            System.out.println("Dirección          : " + motursas.getDireccion());
            System.out.println("Teléfono           : " + motursas.getTelefono());
            System.out.println("Salario            : " + motursas.getSalario());
            System.out.println("Descuento de Renta : " + motursas.getDescuentoRenta());  
//--------------- 
// Modificación de la información guardada, en este caso el nombre
        //    motursa.setNombre("Saul Valencia");
            
//            Motursa motur = new Motursa();
//            //motur.setNoNit("06143010901159");
//            motur.setNoNit("06142110681159");
//            motur.setNombre("Antonio Marquez");
//            
//        System.out.println(mantenimiento.modificarMotursa(motur));
        
      } //---- Fin de Consulta      
    }
// Método para guardar Información    
    public int guardarMotursa(Motursa motursa) {
        int flag = 0;
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
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
        return flag;
    }
// Método para Consultar Información    
    public Motursa consultarMotursa(String noNit){
        Statement stmt = null;
        ResultSet rs = null;
        Motursa motursa = null;
        Connection conn = conectarBaseDatos();
        try {
            String sql = "select * from public.sv_motursa where no_nit='" + noNit + "'";
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
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
        return motursa;
    }
// Método para modificar Información
    public int modificarMotursa(Motursa motursa) {
        int flag = 0;
        PreparedStatement ps = null;
        Connection conn = conectarBaseDatos();
        try {
            String sSql = "";
            sSql = sSql + "update public.sv_motursa ";
            sSql = sSql + "set nombre=?, direccion=?, ";
            sSql = sSql + "telefono=?, salario=?, descuento_renta=? ";
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
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
            }
        }
        return flag;
    }
}

