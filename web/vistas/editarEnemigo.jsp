<%-- 
    Document   : editar
    Created on : 1/09/2020, 01:24:00 PM
    Author     : Camilo Barbosa
--%>

<%@page import="Modelo.Enemigo"%>
<%@page import="ModeloDAO.EnemigoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             EnemigoDAO dao=new EnemigoDAO();
              int id=Integer.parseInt((String)request.getAttribute("idene"));
              Enemigo a=(Enemigo)dao.list(id);
          %>
            <h1>Modificar Enemigo</h1>
            <form action="Controlador">
                DNI: <br>
                <input class="form-control" type="text" name="txtDni" value="<%= a.getDni()%>"><br>
                Nombres: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= a.getNom()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= a.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="ActualizarEnemigo"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
    </body>
</html>
