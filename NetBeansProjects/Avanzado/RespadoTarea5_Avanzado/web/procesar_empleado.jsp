<%-- 
    Document   : procesar_empleado
    Created on : Jan 28, 2023, 7:01:30 PM
    Author     : Saúl Valencia
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="persistencia.Empleado"%>
<%@page import="mantenimiento.MantenimientoEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
        <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    </head>
    <body>

        <div data-role="page" id="pageone">
            <div data-role="header" data-theme="b">
                <h1>Empleado Procesado</h1>
            </div>

            <div data-role="main" class="ui-content">
                <%
                    String Nit = request.getParameter("nitEmp");
                    String nombreE = request.getParameter("nombreEmp");
                    String fechaContrata = request.getParameter("fechaCont");
                    String cargoE = request.getParameter("cargoEmp");
                    String salarioMensual = request.getParameter("salarioEmp");
                    String descuentoRentaMen = request.getParameter("descuentoRent");


                    mantenimiento.MantenimientoEmpleado man = new mantenimiento.MantenimientoEmpleado();
                    persistencia.Empleado emp = new persistencia.Empleado();

                    emp.setNoNit(Nit);
                    emp.setNombreEmpleado(nombreE);
                    emp.setFechaContratacion(fechaContrata);
                    emp.setCargo(cargoE);
                    emp.setSalarioMensual(salarioMensual));
                    emp.setDescuentoRentaMensual(new BigDecimal("descuentoRentaMen"));

                    man.guardarEmpleado(emp);

                    int i = man.guardarEmpleado(emp);

                    if (i == 1) {
                        out.println("Se guardo satisfactoriamente");
                    } else {
                        out.println("No se pudo almacenar");
                    }

                %> 
            </div>

            <div data-role="footer" data-theme="b">
                <h1>Fin de Procesar</h1>
            </div>
        </div> 

    </body>
</html>


