<%-- 
    Document   : editar
    Created on : 1/09/2020, 01:24:00 PM
    Author     : Camilo Barbosa
--%>

<%@page import="Modelo.Companero"%>
<%@page import="ModeloDAO.CompaneroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             CompaneroDAO dao=new CompaneroDAO();
             int id=Integer.parseInt((String)request.getAttribute("idcom"));
             Companero p=(Companero)dao.list(id);
          %>
            <h1>Modificar Companero</h1>
            <form action="Controlador">
                DNI:<br>
                <input class="form-control" type="text" name="txtDni" value="<%= p.getDni()%>"><br>
                Nombres: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= p.getNom()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= p.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="ActualizarCompanero"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
    </body>
</html>
