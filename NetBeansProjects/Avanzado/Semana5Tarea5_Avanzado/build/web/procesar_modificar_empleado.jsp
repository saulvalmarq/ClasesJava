<%-- 
    Document   : procesar_modificar_empleado
    Created on : Jan 30, 2023, 5:45:34 PM
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
             <h1><h:outputText value="Consultar Empleado"/></h1>
            <%
                mantenimiento.MantenimientoEmpleados man = new mantenimiento.MantenimientoEmpleados();
                persistencia.Empleados emp = new persistencia.Empleados();
                String nit = request.getParameter("txtNitEmp");
                String nombre = request.getParameter("txtNombreEmp");
                String fecha = request.getParameter("txtFechaCont");
                String cargo = request.getParameter("txtCargoEmp");
                String salario = request.getParameter("txtSalarioEmp");
                String descuento = request.getParameter("txtDescuentoRent");
                emp.setNoNit(nit);
                
                man.modificarEmpleado(nit);
                if (emp == null) {
                out.println("Datos no encontrados...");
                } else {         
                out.println("Numero de Nit             :" + emp.getNoNit() + "<br>");
                out.println("Nombres                   :" + emp.getNombreEmpleado() + "<br>");
                out.println("Fecha de Contratacion     :" + emp.getFechaContratacion() + "<br>");
                out.println("Cargo                     :" + emp.getCargo() + "<br>");
                out.println("Salario Mensual           :" + emp.getSalarioMensual() + "<br>");
                out.println("Descuento de Renta Mensual:" + emp.getDescuentoRentaMensual() + "<br>");
                }
            %> 
    </body>
</html>
