<%-- 
    Document   : modificarEstudiantes
    Created on : Dec 14, 2022, 8:01:52 PM
    Author     : Saúl Valencia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Estudiantes</title>
    </head>
    <body>
        <h1>Consultar Estudiantes</h1>
        <form name="form2" action="consultarEstudiantes.jsp" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>No. Carnet</td>
                        <td><input type="text" name="txtCarnet" value="" size="14" required/></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <center>
                            <input type="submit" value="Consultar" name="Consultar" />
                            <input type="reset" value="Limpiar"/>
                            </center>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
