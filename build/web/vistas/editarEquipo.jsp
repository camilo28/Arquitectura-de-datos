    Document   : editar
    Created on : 1/09/2020, 01:24:00 PM
    Author     : Camilo Barbosa
--%>

<%@page import="Modelo.Equipo"%>
<%@page import="ModeloDAO.EquipoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             EquipoDAO dao=new EquipoDAO();
              int id=Integer.parseInt((String)request.getAttribute("idequi"));
              Equipo p=(Equipo)dao.list(id);
          %>
            <h1>Modificar Equipo</h1>
            <form action="Controlador">
                Nombres: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= p.getNom()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= p.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="ActualizarEquipo"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
    </body>
</html>
