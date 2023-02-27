<%-- 
    Document   : procesarEstudiantes
    Created on : Dec 11, 2022, 1:54:53 PM
    Author     : Saúl Valencia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Guardar Estudiantes</title>
        </head>
        <body>
            <h1><h:outputText value="Guardar Estudiantes"/></h1>
           
            <%
                String Carnet = request.getParameter("txtCarnet");
                String Apellidos = request.getParameter("txtApellidos");
                String Nombres = request.getParameter("txtNombres");
                String Direccion = request.getParameter("txtDireccion");
                String Telefono = request.getParameter("txtTelefono");
                String Carrera = request.getParameter("txtCarrera");
                String Departamento = request.getParameter("txtDepartamento");
    
                out.println("No Carnet              :" + Carnet + "<br>");
                out.println("Apellidos              :" + Apellidos + "<br>");
                out.println("Nombres                :" + Nombres + "<br>");
                out.println("Dirección              :" + Direccion + "<br>");
                out.println("No Teléfono            :" + Telefono + "<br>");
                out.println("Código de Carrera      :" + Carrera + "<br>");
                out.println("Código de Departamento :" + Departamento + "<br>");
                
                mantenimiento.MantenimientoEstudiantes mantenimiento = new mantenimiento.MantenimientoEstudiantes();
                persistencia.SvEstudiantes estudiante = new persistencia.SvEstudiantes();
                
                estudiante.setCarnet(Carnet);
                estudiante.setApellidos(Apellidos);
                estudiante.setNombres(Nombres);
                estudiante.setDireccion(Direccion);
                estudiante.setTelefono(Telefono);
                estudiante.setCodigoCarrera(Carrera);
                estudiante.setCodigoDepartamento(Departamento);
                
                int flag = mantenimiento.guardarEstudiante(estudiante);
            
                if (flag==1){
                out.println("Guardado satisfactoriamente" + "<br>");
                } else {
                out.println("No pudo ser guardado" + "<br>");
                }               
            %>           
        </body>
    </html>
</f:view>
