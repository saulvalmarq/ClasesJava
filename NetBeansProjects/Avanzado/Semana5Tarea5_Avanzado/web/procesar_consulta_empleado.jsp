<%-- 
    Document   : procesar_consulta_empleado
    Created on : Jan 30, 2023, 5:44:30 PM
    Author     : Saúl Valencia
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="persistencia.Empleados"%>
<%@page import="mantenimiento.MantenimientoEmpleados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><h:outputText value="Consultar Empleado"/></h1>
        <%
            MantenimientoEmpleados man = new MantenimientoEmpleados();
            Empleados emp = new Empleados();
            String nit = request.getParameter("txtNitEmp");
            // emp.setNoNit(nit);
            man.consultarEmpleado(nit);

            if (emp == null) {
                out.println("Datos no encontrados...");
            } else {
    
                out.println("Numero de Nit             :" + nit + "<br>");
                out.println("Nombres                   :" + nom + "<br>");
                out.println("Fecha de Contratacion     :" + fech + "<br>");
                out.println("Cargo                     :" + car + "<br>");
                out.println("Salario Mensual           :" + salar + "<br>");
                out.println("Descuento de Renta Mensual:" + ren + "<br>");
            }
        %> 
    </body>
</html>
