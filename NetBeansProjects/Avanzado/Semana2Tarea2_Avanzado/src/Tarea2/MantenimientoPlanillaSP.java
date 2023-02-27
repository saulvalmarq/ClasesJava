/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Saul Valencia
 */
public class MantenimientoPlanillaSP {
     Planilla planilla = new Planilla();
// Datos de conexión a la Base

    private static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static String DB_CONNECTION = "jdbc:oracle:thin:@orcljava.coehxub0jkfc.us-east-2.rds.amazonaws.com:1521:ORCL";
    private static String DB_USER = "saul_valencia";
    private static String DB_PASSWORD = "w123456w";

// Método para la Conexión a la Base
    private static Connection getDBConnection() {
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
// Método para insertar

    public void insertarPlanilla(Planilla planilla) {
        //int flag = 0; // Salida de circulación
        // Usando la Clase Scanner
        Scanner dato = new Scanner(System.in);
        System.out.println("------ Mantenimiento Planilla Insertar  ------");

        System.out.println("Numero de Nit:");
        String nit = dato.nextLine();

        System.out.println("Nombre del Contribuyente:");
        String nom = dato.nextLine();

        System.out.println("Dirección:");
        String direc = dato.nextLine();

        System.out.println("Ingresos Anuales:");
        Double ingres = dato.nextDouble();

        System.out.println("Impuestos：");
        Double impues = dato.nextDouble();
        //System.out.println("Respuesta: " + GuardarMotursa(motursa));
        planilla.setNoNit(nit);
        planilla.setNombreContribuyente(nom);
        planilla.setDireccion(direc);
        planilla.setIngresosAnuales(ingres);
        planilla.setImpuestos(impues);

        Connection dbConnection = null;
        CallableStatement callableStatement = null;
        int flag = 0;
        String StringSql = "{call SP_INSERTAR_PLANILLA(?, ?, ?, ?, ?)}";

        try {
            dbConnection = getDBConnection();
            callableStatement = dbConnection.prepareCall(StringSql);

            callableStatement.setString(1, planilla.getNoNit());
            callableStatement.setString(2, planilla.getNombreContribuyente());
            callableStatement.setString(3, planilla.getDireccion());
            callableStatement.setDouble(4, planilla.getIngresosAnuales());
            callableStatement.setDouble(5, planilla.getImpuestos());

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
// Método para Consultar todos los datos de la tabla

    public void consultarPlanilla() {
        System.out.println("------ Mantenimiento Planilla Consultar  ------");
        Statement stmt = null;
        ResultSet rs = null;
        Connection dbConnection = null;

        try {
            dbConnection = getDBConnection();
            stmt = dbConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM PLANILLA");

            while (rs.next()) {
                System.out.println(" No.Nit: " + rs.getString("No_Nit")
                        + " NombreContribuyente: " + rs.getString("Nombre_Contribuyente")
                        + " Dirección: " + rs.getString("Direccion")
                        + " IngresosAnuales: " + rs.getDouble(("Ingresos_Anuales"))
                        + " Impuestos: " + rs.getDouble(("Impuestos")));
            }
        } catch (SQLException e) {
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
// Método para modificar un dato de una fila de la tabla

     @SuppressWarnings("null")
    public void modificarPlanilla(Planilla planilla, String tmpNombre, String tmpDir, Double tmpIngr, Double tmpImp) {
        //int flag = 0; // Salida de circulación
        //    double ing, imp;
        Scanner dato = new Scanner(System.in);
        System.out.println("------ Mantenimiento Planilla Modificar  ------");

        System.out.println("Numero de Nit del Contribuyente a Modificar:");
        String nit = dato.nextLine();

        Statement stmt = null;
        ResultSet rs = null;
        planilla = null;
        Connection dbConnection = null;
// Consulta solo del fila solicitada según el número de nit dado
        try {
            dbConnection = getDBConnection();
            stmt = dbConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM PLANILLA WHERE no_nit='" + nit + "'");

            while (rs.next()) {
                System.out.println(" No.Nit: " + rs.getString("No_Nit")
                        + " NombreContribuyente: " + rs.getString("Nombre_Contribuyente")
                        + " Dirección: " + rs.getString("Direccion")
                        + " IngresosAnuales: " + rs.getDouble(("Ingresos_Anuales"))
                        + " Impuestos: " + rs.getDouble(("Impuestos")));
            }
                String tmpNit=rs.getString("No_Nit");
                tmpNombre =rs.getString("Nombre_Contribuyente");
                tmpDir=rs.getString("Direccion");
                tmpIngr=rs.getDouble(("Ingresos_Anuales"));
                tmpImp=rs.getDouble(("Impuestos")); 

        } catch (SQLException e) {
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
            } catch (SQLException e) {
            }
        }
// Segundo Menú para solicitar el dato a modificar 
        int flag2 = 0; // Salida de circulación
        while (flag2 == 0) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Que Dato va a Modificar?");
            System.out.println("2 -Nombre del Contribuyente");
            System.out.println("3 -Dirección");
            System.out.println("4 -Ingresos Anuales");
            System.out.println("5 -Impuestos");
            System.out.println("6 -Salir");
            System.out.println("Ingrese el número de la Opción Seleccionada:");

            switch (sc1.nextInt()) {
                case 2:
                    System.out.println("Ingrese nuevo Nombre del Contribuyente:");
                    String nom = dato.nextLine();
                    planilla.setNombreContribuyente(nom);
                    flag2 = 1;
                    break;
                case 3:
                    System.out.println("Ingrese nueva Dirección:");
                    String direc = dato.nextLine();
                    planilla.setDireccion(direc);
                    flag2 = 1;
                    break;
                case 4:
                    System.out.println("Ingrese nuevo Ingreso Anual:");
                    Double ingre = dato.nextDouble();
                    planilla.setIngresosAnuales(ingre);
                    flag2 = 1;
                    break;
                case 5:
                    System.out.println("Ingrese nuevos Impuestos:");
                    Double impu = dato.nextDouble();
                    planilla.setImpuestos(impu);
                    flag2 = 1;
                    break;
                case 6:
                    flag2 = 1;
                    break;
                default:
                    break;
            }

            try {

//            planilla.setNombreContribuyente("Nombre_Contribuyente");
//            planilla.setDireccion("Direccion");
//            planilla.setIngresosAnuales(Ingresos_Anuales");
//            planilla.setImpuestos("Impuestos");                     
                CallableStatement callableStatement = null;
                dbConnection = getDBConnection();
                int flag = 0; // 
                String StringSql = "{call SP_MODIFICAR_PLANILLA(?, ?, ?, ?)}";

                callableStatement = dbConnection.prepareCall(StringSql);
                callableStatement.setString(2, planilla.getNombreContribuyente());
                callableStatement.setString(3, planilla.getDireccion());
                callableStatement.setDouble(4, planilla.getIngresosAnuales());
                callableStatement.setDouble(5, planilla.getImpuestos());

                flag = callableStatement.executeUpdate();

                if (flag == 1) {
                    System.out.println("Modificado satisfactoriamente...");
                } else {
                    System.out.println("Los datos no pudieron ser Modificados...");
                }

            } catch (SQLException e) {
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
                } catch (SQLException e) {
                }
            }
        }
    }
// Método para eliminar una fila de acuerdo al número de nit dado (llave primaria) 

    public void eliminarPlanilla(Planilla planilla) {
        Scanner dato = new Scanner(System.in);
        System.out.println("------ Mantenimiento Planilla Eliminar  ------");
        System.out.println("Numero de Nit del Contribuyente a Eliminar:");
        String nit = dato.nextLine();
        planilla.setNoNit(nit);
        Connection dbConnection = null;
        CallableStatement callableStatement = null;
        int flag = 0;
        String StringSql = "{call SP_ELIMINAR_PLANILLA(?)}";
        try {
            dbConnection = getDBConnection();
            callableStatement = dbConnection.prepareCall(StringSql);

            callableStatement.setString(1, planilla.getNoNit());

            flag = callableStatement.executeUpdate();
            if (flag == 1) {
                System.out.println("Eliminado satisfactoriamente...");
            } else {
                System.out.println("Los datos no pudieron ser eliminados...");
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
            } catch (SQLException e) {
            }
        }
    }
}
