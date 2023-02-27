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
        <div data-role="page" id="pageone">
            <div data-role="header" data-theme="b">
                <h1>Empleado Registrado</h1>
            </div>

            <%
                persistencia.Empleados emp = new persistencia.Empleados();
                mantenimiento.MantenimientoEmpleados man = new mantenimiento.MantenimientoEmpleados();
                String nit = request.getParameter("txtNitEmp");
                String nombre = request.getParameter("txtNombreEmp");
                String fecha = request.getParameter("txtFechaCont");
                String cargo = request.getParameter("txtCargoEmp");
                String salario = request.getParameter("txtSalarioEmp");
                String descuento = request.getParameter("txtDescuentoRent");
                //            BigDecimal sala = new BigDecimal(salario);
                //            BigDecimal desc = new BigDecimal(descuento);
                BigDecimal bigDecimal1 = new BigDecimal(salario);
                assert equals(bigDecimal1);
                BigDecimal bigDecimal2 = new BigDecimal(descuento);
                assert equals(bigDecimal2);

                emp.setNoNit(nit);
                emp.setNombreEmpleado(nombre);
                emp.setFechaContratacion(fecha);
                emp.setCargo(cargo);
                emp.setSalarioMensual(bigDecimal1);
                emp.setDescuentoRentaMensual(bigDecimal2);

                man.guardarEmpleado(emp);

                out.println("No Nit                 :" + nit + "<br>");
                out.println("Nombre del Empleado    :" + nombre + "<br>");
                out.println("Fecha de Contratacion  :" + fecha + "<br>");
                out.println("Cargo del empleado     :" + cargo + "<br>");
                out.println("El Salario Mensual es  :" + bigDecimal1 + "<br>");
                out.println("El Descuento de Renta  :" + bigDecimal2 + "<br>");
                
            %> 
             <div data-role="header" data-theme="b">
                <h1>Registro Exitoso</h1>
            </div>
        </div>
    </body>
</head>
</html>

