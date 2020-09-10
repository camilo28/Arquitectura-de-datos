<%-- 
    Document   : agregar
    Created on : 1/09/2020, 01:23:49 PM
    Author     : Camilo Barbosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equipo</title>
    </head>
    <body>
        <h1>Agregar Aliado</h1>
        <form action="Controlador">
            Id Aliado:<br>
            <input type="number" name="txtAli"><br>
            Id Equipo:<br>
            <input type="number" name="txtEqui"><br>
            <input type="submit" name="accion" value="AgregarAliadoxEquipo"><br>
        </form>
    </body>
</html>
