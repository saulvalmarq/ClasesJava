<%-- 
    Document   : procesar_consulta_tabla_empleado
    Created on : Jan 30, 2023, 9:36:23 PM
    Author     : Saúl Valencia
--%>

<%@page import="javax.persistence.EntityManager"%>
<%@page import="mantenimiento.JpaUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Todos Los Empleados</title>
    </head>
    <body>
        <%
            EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
            mantenimiento.MantenimientoEmpleados man = new mantenimiento.MantenimientoEmpleados();
            persistencia.Empleados emp = new persistencia.Empleados();
            man.consultarTodosEmpleados();
        %>
    </body>
</html>
