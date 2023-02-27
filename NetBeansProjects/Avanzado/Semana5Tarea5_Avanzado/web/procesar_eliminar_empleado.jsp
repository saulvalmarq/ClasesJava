<%-- 
    Document   : procesar_eliminar_empleado
    Created on : Jan 30, 2023, 5:45:53 PM
    Author     : Saúl Valencia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h1><h:outputText value="Eliminar Empleado"/></h1>
            <%
                mantenimiento.MantenimientoEmpleados man = new mantenimiento.MantenimientoEmpleados();
                persistencia.Empleados emp = new persistencia.Empleados();
                String nit = request.getParameter("txtNitEmp");                
                emp.setNoNit(nit);
                man.eliminarEmpleado(nit);
                out.println("Usuario Eliminado");
            %> 
    </body>
</html>
