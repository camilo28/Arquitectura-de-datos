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
        <title>Compañeros</title>
    </head>
    <body>
        <h1>Agregar Compañero</h1>
        <form action="Controlador">
            DNI:<br>
            <input type="text" name="txtDni"><br>
            Nombres:<br>
            <input type="text" name="txtNom"><br>
            <input type="submit" name="accion" value="AgregarCompanero"><br>
        </form>
    </body>
</html>
