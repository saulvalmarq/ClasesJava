<%-- 
    Document   : newjsp
    Created on : Jan 29, 2023, 1:05:05 PM
    Author     : Saúl Valencia
--%>

<%@page import="javax.persistence.EntityManager"%>
<%@page import="mantenimiento.JpaUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body> 
            <h1><h:outputText value="Guardar Empleado"/></h1>
            <%
                String Nit = request.getParameter("nitEmp");
                String nombreE = request.getParameter("nombreEmp");
                String fechaContrata = request.getParameter("fechaCont");
                String cargoE = request.getParameter("cargoEmp");
                String salarioMensual = request.getParameter("salarioEmp");
                String descuentoRentaMen = request.getParameter("descuentoRent");

                mantenimiento.MantenimientoEmpleado man = new mantenimiento.MantenimientoEmpleado();
                persistencia.Trabajador emp = new persistencia.Trabajador();
                 
                emp.setNoNit(Nit);
                emp.setNombreEmpleado(nombreE);
                emp.setFechaContratacion(fechaContrata);
                emp.setCargo(cargoE);
                emp.setSalarioMensual(salarioMensual);
                emp.setDescuentoRentaMensual(descuentoRentaMen);
                
                int flag = man.guardarEmpleado(emp);

                if (flag == 1) {
                    out.println("Guardado satisfactoriamente" + "<br>");
                } else {
                    out.println("No pudo ser guardado" + "<br>");
                }
            %> 
        </body>
    </html>
</f:view>