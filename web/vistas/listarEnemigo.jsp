<%-- 
    Document   : listar
    Created on : 1/09/2020, 01:23:35 PM
    Author     : Camilo Barbosa
--%>

<%@page import="java.util.Iterator"%>

<%@page import="java.util.List"%>
<%@page import="Modelo.Enemigo"%>
<%@page import="ModeloDAO.EnemigoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-size: 16px;">
    <head>

        <link rel="stylesheet" href="./static/css/nicepage.css" media="screen">
        <link rel="stylesheet" href="./static/css/Inicio.css" media="screen">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="Bienvenidos a la prision mortal">
        <meta name="description" content="">
        <meta name="page_type" content="np-template-header-footer-from-plugin">
        <title>Index</title>
        <script class="u-script" type="text/javascript" src="./static/css/jquery.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="./static/css/nicepage.js" defer=""></script>
        <link id="u-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster:400|Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "",
            "url": "index.html",
            "logo": "images/Logo.jpg"
            }</script>
        <meta property="og:title" content="home">
        <meta property="og:type" content="website">
        <meta name="theme-color" content="#37516b">
        <link rel="canonical" href="index.html">
        <meta property="og:url" content="index.html">
    </head>


    <body class="u-body"><header class="u-clearfix u-header u-palette-5-dark-2 u-header" id="sec-f288"><div class="u-clearfix u-sheet u-sheet-1">

                <nav class="u-align-left u-menu u-menu-dropdown u-nav-spacing-25 u-offcanvas u-menu-1" data-responsive-from="XL">
                    <div class="menu-collapse">
                        <a class="u-button-style u-nav-link" href="#" style="padding: 4px 0; font-size: calc(1em + 8px);">
                            <svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 302 302" style= ><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-7b92"></use></svg>
                            <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="svg-7b92" x="0px" y="0px" viewBox="0 0 302 302" style= "enable-background: 0 0 302 302"; xml:space="preserve" class="u-svg-content"><g><rect y="36" width="302" height="30"></rect><rect y="236" width="302" height="30"></rect><rect y="136" width="302" height="30"></rect>
                            </g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g><g></g></svg>
                        </a>
                    </div>
                    <div class="u-custom-menu u-nav-container">
                        <ul class="u-nav u-unstyled u-nav-1">
                            <li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px 28px;">Compañero</a>
                            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px 28px;">Prisioneros</a>

                                <div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link u-white" href="">Ver prisioneros</a>
                                        </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-white"  href="" >Insertar prisioneros</a>
                                        </li></ul>
                                </div>
                            </li></ul>
                    </div>
                    <div class="u-custom-menu u-nav-container-collapse">
                        <div class="u-align-center u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                            <div class="u-menu-close"></div>
                            <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-3">

                                <li class="u-nav-item"><a class="u-button-style u-nav-link"  href="Controlador?accion=listarCompanero"   style="padding: 10px 28px;">Compañero</a></li>
                                <li class="u-nav-item"><a class="u-button-style u-nav-link"  href="Controlador?accion=listarEquipo" style="padding: 10px 28px;">Equipo</a></li>
                                <li class="u-nav-item"><a class="u-button-style u-nav-link"  href="Controlador?accion=listarComxEqui" style="padding: 10px 28px;">Companero por Equipo</a></li>
                                <li class="u-nav-item"><a class="u-button-style u-nav-link"  href="Controlador?accion=listarAliado" style="padding: 10px 28px;">Aliado</a></li>
                                <li class="u-nav-item"><a class="u-button-style u-nav-link"  href="Controlador?accion=listarAlixEqui" style="padding: 10px 28px;">Aliado por Equipo</a></li>
                                <li class="u-nav-item"><a class="u-button-style u-nav-link"  href="Controlador?accion=listarEnemigo" style="padding: 10px 28px;">Enemigo</a></li>
                                <li class="u-nav-item"><a class="u-button-style u-nav-link"  href="Controlador?accion=listarPatrocinador" style="padding: 10px 28px;">Patrocinador</a>
                                    </div>
                                    <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
                                    </div>
                                    </nav>
                                    </div></header>
                                    <section class="u-align-center u-clearfix u-image u-shading u-section-1" src="" id="sec-95ca" data-image-width="626" data-image-height="417">


                                        <h1>Enemigos</h1>
                                        <div class="u-form-group " align="left">
                                            <a href="Controlador?accion=AgregarEne" class="btn btn-success" ><span class="fa fa-undo" >Agregar Enemigo</span></a>
                                        </div>

                                        <<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">

                                            <thead>
                                                <tr>
                                                    <th>ID</th>
                                                    <th>DNI</th>
                                                    <th>Nombres</th>
                                                    <th>Acciones</th>
                                                </tr>
                                            </thead>
                                            <%
                                                EnemigoDAO dao = new EnemigoDAO();
                                                List<Enemigo> list = dao.listar();
                                                Iterator<Enemigo> iter = list.iterator();
                                                Enemigo per = null;
                                                while (iter.hasNext()) {
                                                    per = iter.next();

                                            %>
                                            <tbody>
                                                <tr>
                                                    <td><%= per.getId()%></td>
                                                    <td><%= per.getDni()%></td>
                                                    <td><%= per.getNom()%></td>
                                                    <td>
                                                        <a href="Controlador?accion=editarEnemigo&id=<%= per.getId()%>">Edit </a>
                                                        <a href="Controlador?accion=eliminarEnemigo&id=<%= per.getId()%>">Remove</a>
                                                    </td>
                                                </tr>
                                                <%}%>
                                            </tbody>
                                        </table>


                                        <div class="u-clearfix u-sheet u-sheet-1">

                                        </div>
                                    </section>


                                    <footer class="u-align-left u-clearfix u-footer u-grey-80 u-footer" id="sec-e950"><div class="u-clearfix u-sheet u-sheet-1"></div></footer>
                                    <section class="u-backlink u-clearfix u-grey-80">

                                        <a class="u-link" href="https://nicepage.com/html" target="_blank">
                                            <span>Modelo</span>
                                        </a>
                                        <p class="u-text">
                                            <span>created with</span>
                                        </p>
                                        <a class="u-link" href="https://nicepage.com" target="_blank">
                                            <span>Nicepage</span>
                                        </a>.

                                    </section>
                                    </body>
                                    </html>



