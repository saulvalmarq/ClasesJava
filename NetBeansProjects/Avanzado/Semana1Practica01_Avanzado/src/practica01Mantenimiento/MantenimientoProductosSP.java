/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01Mantenimiento;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Saul Valencia
 */
public class MantenimientoProductosSP {

    private static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static String DB_CONNECTION = "jdbc:oracle:thin:@orcljava.coehxub0jkfc.us-east-2.rds.amazonaws.com:1521:ORCL";
    private static String DB_USER = "saul_valencia";
    private static String DB_PASSWORD = "w123456w";

    private static Connection getDBConnetion() {
        Connection dbConnection = null;

        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            dbConnection = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return dbConnection;
    }

    public static void main(String[] args) {
        MantenimientoProductosSP m = new MantenimientoProductosSP();
        Productos producto = new Productos();

        producto.setDescripcion("Televisor Xiomi");
        producto.setMarca("Xiaomi");
        producto.setModelo("AA01033303");
        producto.setPrecio(550.00);
        producto.setExistencia(100);
        producto.setCodigoDepartamento("05");
        producto.setCodigoSucursal("05");

//        m.insertarProducto(producto);

        m.consultarProducto();
        
//       m.modificarProducto();
        
//        m.eliminarProducto();

    }

    public void insertarProducto(Productos producto) {

        Connection dbConnection = null;
        CallableStatement callableStatement = null;
        int flag = 0;
        String StringSql = "{call SP_INSERTAR_PRODUCTOS(?, ?, ?, ?, ?, ?, ?)}";

        try {
            dbConnection = getDBConnetion();
            callableStatement = dbConnection.prepareCall(StringSql);

            callableStatement.setString(1, producto.getDescripcion());
            callableStatement.setString(2, producto.getMarca());
            callableStatement.setString(3, producto.getModelo());
            callableStatement.setDouble(4, producto.getPrecio());
            callableStatement.setInt(5, producto.getExistencia());
            callableStatement.setString(6, producto.getCodigoDepartamento());
            callableStatement.setString(7, producto.getCodigoSucursal());

            flag = callableStatement.executeUpdate();

            if (flag == 1) {
                System.out.println("Registrado satisfactoriamente...");
            } else {
                System.out.println("Los datos no pudieron ser registrados...");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (callableStatement != null) {
                    callableStatement.close();
                }

                if (dbConnection != null) {
                    dbConnection.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public void consultarProducto() {
        Statement stmt = null;
        ResultSet rs = null;
        Connection dbConnection = null;

        try {
            dbConnection = getDBConnetion();
            stmt = dbConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM PRODUCTOS");

            while (rs.next()) {
                System.out.println("Descripcion:" + rs.getString("Descripcion")
                        + " Marca: " + rs.getString("Marca")
                        + " Modelo: " + rs.getString("Modelo")
                + " Codigo de Departamento: " + rs.getString("Codigo_Departamento"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (stmt != null) {
                    stmt.close();
                }

                if (dbConnection != null) {
                    dbConnection.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public void modificarProducto() {
        Connection dbConnection = null;
        CallableStatement callableStatement = null;
        int flag = 0;
        String StringSql = "{call SP_MODIFICAR_PRODUCTOS(?, ?, ?, ?, ?, ?)}";

        try {
            dbConnection = getDBConnetion();
            callableStatement = dbConnection.prepareCall(StringSql);

//            callableStatement.setString(1, producto.getDescripcion());
//            callableStatement.setString(2, producto.getMarca());
//            callableStatement.setString(3, producto.getModelo());
//            callableStatement.setDouble(4, producto.getPrecio());
//            callableStatement.setInt(5, producto.getExistencia());
//            callableStatement.setString(6, producto.getCodigoDepartamento());
//            callableStatement.setString(7, producto.getCodigoSucursal());

            flag = callableStatement.executeUpdate();

            if (flag == 1) {
                System.out.println("Modificado satisfactoriamente...");
            } else {
                System.out.println("Los datos no pudieron ser modificados...");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (callableStatement != null) {
                    callableStatement.close();
                }

                if (dbConnection != null) {
                    dbConnection.close();
                }
            } catch (Exception e) {
            }
        }
    }
//
//    public void eliminarProducto() {
//        Connection dbConnection = null;
//        CallableStatement callableStatement = null;
//        int flag = 0;
//        String StringSql = "{call SP_ELIMINAR_PRODUCTOS(?, ?, ?, ?, ?, ?, ?)}";
//
//        try {
//            dbConnection = getDBConnetion();
//            callableStatement = dbConnection.prepareCall(StringSql);
//
//            callableStatement.setString(1, producto.getDescripcion());
//            callableStatement.setString(2, producto.getMarca());
//            callableStatement.setString(3, producto.getModelo());
//            callableStatement.setDouble(4, producto.getPrecio());
//            callableStatement.setInt(5, producto.getExistencia());
//            callableStatement.setString(6, producto.getCodigoDepartamento());
//            callableStatement.setString(7, producto.getCodigoSucursal());
//
//            flag = callableStatement.executeUpdate();
//
//            if (flag == 1) {
//                System.out.println("Eliminado satisfactoriamente...");
//            } else {
//                System.out.println("Los datos no pudieron ser eliminados...");
//            }
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        } finally {
//            try {
//                if (callableStatement != null) {
//                    callableStatement.close();
//                }
//
//                if (dbConnection != null) {
//                    dbConnection.close();
//                }
//            } catch (Exception e) {
//            }
//        }
//    }
}
