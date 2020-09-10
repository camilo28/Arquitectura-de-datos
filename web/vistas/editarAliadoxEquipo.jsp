<%-- 
    Document   : editar
    Created on : 1/09/2020, 01:24:00 PM
    Author     : Camilo Barbosa
--%>

<%@page import="Modelo.AliadoxEquipo"%>
<%@page import="ModeloDAO.AliadoxEquipoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             AliadoxEquipoDAO dao=new AliadoxEquipoDAO();
              int id=Integer.parseInt((String)request.getAttribute("idalixequi"));
              AliadoxEquipo p=(AliadoxEquipo)dao.list(id);
          %>
            <h1>Modificar Aliado por Equipo</h1>
            <form action="Controlador">
                Id Aliado <br>
                <input class="form-control" type="text" name="txtAli" value="<%= p.getAliado()%>"><br>
                Id Equipo: <br>
                <input class="form-control" type="text" name="txtEqui" value="<%= p.getEquipo()%>"><br>
                <input type="hidden" name="txtid" value="<%= p.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="ActualizarAliadoxEquipo"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
    </body>
</html>
