<%-- 
    Document   : mantenimientoDepartamentosJpa
    Created on : Feb 3, 2023, 9:19:15 PM
    Author     : Saúl Valencia
--%>

<%@page import="mantenimiento.MantenimientoDepartamentosJpa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>
<%@page import="javax.persistence.Query" %> import="javax.persistence.EntityManager" %>
<%@page import="persistencia.Departamentos" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento Departamentos</title>

    </head>
    <body>
        <h1> Mantenimiento Departamentos</h1> 

        <form name="Form" action="mantenimiento Departamentos.jsp" method="POST">
            <table border="1" bgcolor="#CEECF5">
               <tbody>
                    <tr>
                        <td>Codigo Departamento</td>
                        <td><input type="text" name="codigo_departamento" maxlength="2" size="5" /></td>

                        <th></th>
                        <th></th>
                    </tr>
                    <tr>
                        <td>Nombre Departamento</td>
                        <td><input type="text" name="nombre_departamento" maxlength="25" size="5" /></td>     
                    </tr>
                    <tr>
                        <td colspan ="2">
                        <input type="submit" value="Guardar" name="guardar" />
                        <input type="submit" value="Consultar" name="consultar" />
                        <input type="submit" value="Modificar" name="modificar" />
                        <input type="submit" value="Eliminar" name="eliminar" />
                        <br>
                        <input type="submit" value="Consultar Todos los Departamentos" name="todos" />
                      </td>                         
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
 