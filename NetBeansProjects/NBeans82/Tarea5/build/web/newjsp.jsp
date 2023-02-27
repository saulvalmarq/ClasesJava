<%-- 
    Document   : newjsp
    Created on : Jan 29, 2023, 1:05:05 PM
    Author     : Saúl Valencia
--%>


<%@page import="java.math.BigDecimal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <body>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guardar Empleado</title>
        <%

            String nit = request.getParameter("txNitEmp");
            String nombre = request.getParameter("txtNombreEmp");
            String fecha = request.getParameter("txtFechaCont");
            String cargo = request.getParameter("txtCargoEmp");
            String salario = request.getParameter("txtSalarioEmp");
            String descuento = request.getParameter("txtDescuentoRent");
            BigDecimal sala = new BigDecimal(salario);
            BigDecimal desc = new BigDecimal(descuento);
            
            out.println("No Nit                 :" + nit + "<br>");
            out.println("Nombre del Empleado    :" + nombre + "<br>");
            out.println("Fecha de Contratacion  :" + fecha + "<br>");
            out.println("Cargo del empleado     :" + cargo + "<br>");
            out.println("El Salario Mensual es  :" + salario + "<br>");
            out.println("El Descuento de Renta  :" + descuento + "<br>");
            
            persistencia.Empleados emp = new persistencia.Empleados();
            mantenimiento.MantenimientoEmpleados man = new mantenimiento.MantenimientoEmpleados();

            emp.setNoNit(nit);
            emp.setNombreEmpleado(nombre);
            emp.setFechaContratacion(fecha);
            emp.setCargo(cargo);
            emp.setSalarioMensual(sala);
            emp.setDescuentoRentaMensual(desc);

            //man.guardarEmpleado(emp);
            int flag = man.guardarEmpleado(emp);
            if (flag == 1) {
                out.println("Se guardo satisfactoriamente");
            } else {
                out.println("No se pudo almacenar");
            }

        %> 
    </head>
    </body>
</html>
