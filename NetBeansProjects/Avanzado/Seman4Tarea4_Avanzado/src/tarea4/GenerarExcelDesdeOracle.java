/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea4;

/**
 *
 * @author Saul Valencia
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import javafx.scene.control.Cell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class GenerarExcelDesdeOracle {

// Clase Principal
    public static void main(String[] args) throws IOException, SQLException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Hoja1");
        String jdbcURL = "jdbc:oracle:thin:@orcljava.coehxub0jkfc.us-east-2.rds.amazonaws.com:1521:ORCL";
        String username = "saul_valencia";
        String password = "w123456w";
 
        int rownum = 0;
        Cell cell;
        Row row;

        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        
// Dando nombre a las columnas de la tabla de Excel
        // Campo 1 
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("NO_CARNET");
        cell.setCellStyle(style);

        // Campo 2 
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("APELLIDOS");
        cell.setCellStyle(style);

        // Campo 3 
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("NOMBRES");
        cell.setCellStyle(style);

        // Campo 4 
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("CODIGO_DEPARTAMENTO");
        cell.setCellStyle(style);

        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("SALARIO");
        cell.setCellStyle(style);

        Connection connection = DriverManager.getConnection(jdbcURL, username, password);
        String sql = "SELECT * FROM EMPLEADOS";
        System.out.println(sql);
        System.out.println("Conexión a base de datos exitosa");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
// Llenando las celdas que luego serán insertadas en el archivo
        System.out.println("Llenando celdas");
        while (rs.next()) {
            rownum++;
            row = sheet.createRow(rownum);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(rs.getString(1));

            // 2 
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(rs.getString(2));

            //3 
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(rs.getString(3));

            //4
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(rs.getString(4));

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(rs.getString(5));
        }

        for (int columnIndex = 0; columnIndex <= 4; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
// Creando el archivo Excel
         try {
            //Se genera el documento
            FileOutputStream out = new FileOutputStream(new File("/home/levita/Documents/edutech/Avanzado/Empleados.xls"));
            workbook.write(out);
            System.out.println("Generando Archivo Excel Empleados.xls");
            out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
// Método para hacer que los nombres de las columnas de la table de Excel queden en negrillas
    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
}
