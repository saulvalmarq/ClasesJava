<%-- 
    Document   : procesarEstudiantes
    Created on : Dec 11, 2022, 1:54:53 PM
    Author     : Saúl Valencia
--%>

<%@page import="javax.persistence.EntityManager"%>
<%@page import="mantenimiento.JpaUtil"%>
<%@page import="persistencia.SvEstudiantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Modificar Estudiantes</title>
        <body>
            <h1><h:outputText value="Consultar Estudiantes"/></h1>
            <form name="form3" action="consultarEstudiantes.jsp" method="POST">
                <table border="1">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>No. Carnet</td>
                        <td><input type="text" name="txtCarnet" value="" size="14" required/></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <center>
                            <input type="submit" value="Consultar" name="Consultar" />
                            <input type="reset" value="Limpiar"/>
                            </center>
                        </td>
                    </tr>
                </tbody>
            </table>
            <%
                EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
                mantenimiento.MantenimientoEstudiantes mantenimiento = new mantenimiento.MantenimientoEstudiantes();
                persistencia.SvEstudiantes estudiantes = new persistencia.SvEstudiantes();
                SvEstudiantes estudiante = null;

        em.getTransaction().begin();
        try {
            estudiante = em.find(SvEstudiantes.class, txtCarnet);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
                String Carnet = request.getParameter("txtCarnet");
                String Apellidos = request.getParameter("txtApellidos");
                String Nombres = request.getParameter("txtNombres");
                String Direccion = request.getParameter("txtDireccion");
                String Telefono = request.getParameter("txtTelefono");
                String Carrera = request.getParameter("txtCarrera");
                String Departamento = request.getParameter("txtDepartamento");

                
               

            //    mantenimiento.consultarEstudiante(Carnet);
            if (estudiante == null) {
            System.out.println("Datos de Estudiante No Encontrados...");
            }
            %>

            <% if (estudiante == null) %>
            <form name="form3" action="modificarEstudiantes.jsp" method="POST">
            <table border="1" width="100">
            <thead>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
                <tbody>
                    <tr>
                        <td>No. Carnet              :</td>
                        <td><input type="text" name="Carnet" size="10"
                                   value="estudiante.getCarnet()" readonly/></td>
                    </tr>
                    <tr>
                        <td>Apellidos              :</td>
                        <td><input type="text" name="Apellidos" size="50"
                                   value="estudiante.getApellidos()"/></td>
                    </tr>
                    <tr>
                        <td>Nombres                :</td>
                        <td><input type="text" name="Nombres" size="50"
                                   value="estudiante.getNombres()"/></td>
                    </tr>
                    <tr>
                        <td>Dirección              :</td>
                        <td><input type="text" name="Direccion" size="100"
                                   value="estudiante.getDireccion()"/></td>
                    </tr>
                    <tr>
                        <td>No. Teléfono            :</td>
                        <td><input type="text" name="Telefono" size="10"
                                   value="estudiante.getTelefono()"/></td>
                    </tr>
                    <tr>
                        <td>Código de Carrera      :</td>
                        <td><input type="text" name="Carrera" size="2"
                                   value="estudiante.getCodigoCarrera()"/></td>
                    </tr>
                    <tr>
                        <td> Código de Departamento               :</td>
                        <td><input type="text" name="Departamento" size="2"
                                   value="estudiante.getCodigoCarrera()"/></td>
                    </tr>
                    <tr>
                        <td colspan = "2">
                            <center>
                                <input type="submit" value="Guardar" name="Guardar" />
                                <input type="reset"  value="Limpiar">
                            </center>
                        </td>
                        </tr>
                    </tbody>
            </table>
            </form>     
        </body>
    </html>
</f:view>
