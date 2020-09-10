<%-- 
    Document   : editar
    Created on : 1/09/2020, 01:24:00 PM
    Author     : Camilo Barbosa
--%>

<%@page import="Modelo.Patrocinador"%>
<%@page import="ModeloDAO.PatrocinadorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             PatrocinadorDAO dao=new PatrocinadorDAO();
              int id=Integer.parseInt((String)request.getAttribute("idpatro"));
              Patrocinador a=(Patrocinador)dao.list(id);
          %>
            <h1>Modificar Patrocinador</h1>
            <form action="Controlador">
                NIT: <br>
                <input class="form-control" type="text" name="txtNit" value="<%= a.getNit()%>"><br>
                Nombres: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= a.getNom()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= a.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="ActualizarPatrocinador"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
    </body>
</html>
