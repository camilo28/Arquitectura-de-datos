/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Aliado;
import Modelo.AliadoxEquipo;
import Modelo.Companero;
import Modelo.CompaneroxEquipo;
import Modelo.Enemigo;
import Modelo.Equipo;
import Modelo.Patrocinador;
import ModeloDAO.AliadoDAO;
import ModeloDAO.AliadoxEquipoDAO;
import ModeloDAO.CompaneroDAO;
import ModeloDAO.CompaneroxEquipoDAO;
import ModeloDAO.EnemigoDAO;
import ModeloDAO.EquipoDAO;
import ModeloDAO.PatrocinadorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Camilo Barbosa
 */
public class Controlador extends HttpServlet {

    String listarCom = "vistas/listarCompanero.jsp";
    String agregarCom = "vistas/agregarCompanero.jsp";
    String editarCom = "vistas/editarCompanero.jsp";
    String listarEqui = "vistas/listarEquipo.jsp";
    String agregarEqui = "vistas/agregarEquipo.jsp";
    String editarEqui = "vistas/editarEquipo.jsp";
    String listarComxEqui = "vistas/listarComxEqui.jsp";
    String agregarComxEqui = "vistas/agregarComxEquipo.jsp";
    String editarComxEqui = "vistas/editarComxEquipo.jsp";
    String listarAliado = "vistas/listarAliado.jsp";
    String agregarAliado= "vistas/agregarAliado.jsp";
    String editarAliado= "vistas/editarAliado.jsp";
    String listarAlixEqui = "vistas/listarAliadoxEquipo.jsp";
    String agregarAlixEqui = "vistas/agregarAliadoxEquipo.jsp";
    String editarAlixEqui = "vistas/editarAliadoxEquipo.jsp";
    String listarEnemigo = "vistas/listarEnemigo.jsp";
    String agregarEnemigo = "vistas/agregarEnemigo.jsp";
    String editarEnemigo= "vistas/editarEnemigo.jsp";
    String listarPatro = "vistas/listarPatrocinador.jsp";
    String agregarPatro = "vistas/agregarPatrocinador.jsp";
    String editarPatro= "vistas/editarPatrocinador.jsp";
    
    
    Equipo e = new Equipo();
    EquipoDAO dao_e = new EquipoDAO();
    Companero p = new Companero();
    CompaneroDAO dao = new CompaneroDAO();
    CompaneroxEquipo c = new CompaneroxEquipo();
    CompaneroxEquipoDAO dao_c = new CompaneroxEquipoDAO();
    Aliado a=new Aliado();
    AliadoDAO dao_a=new AliadoDAO();
    AliadoxEquipo axe = new AliadoxEquipo();
    AliadoxEquipoDAO dao_axe = new AliadoxEquipoDAO();
    Enemigo en = new Enemigo();
    EnemigoDAO dao_en = new EnemigoDAO();
    Patrocinador patro = new Patrocinador();
    PatrocinadorDAO dao_patro = new PatrocinadorDAO();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listarCompanero")) {
            acceso = listarCom;
        }else if (action.equalsIgnoreCase("listarEquipo")) {
            acceso = listarEqui;
        }else if (action.equalsIgnoreCase("listarAliado")) {
            acceso = listarAliado;
        }else if (action.equalsIgnoreCase("listarComxEqui")) {
            acceso = listarComxEqui;
        }else if (action.equalsIgnoreCase("listarAlixEqui")) {
            acceso = listarAlixEqui;
        }else if (action.equalsIgnoreCase("listarEnemigo")) {
            acceso = listarEnemigo;
        }else if (action.equalsIgnoreCase("listarPatrocinador")) {
            acceso = listarPatro;
        }else if (action.equalsIgnoreCase("AgregarCom")) {
            acceso = agregarCom;
        }else if (action.equalsIgnoreCase("AgregarEqui")) {
            acceso = agregarEqui;
        }else if (action.equalsIgnoreCase("AgregarCompaneroxEquipo")) {
            acceso = agregarComxEqui;
        }else if (action.equalsIgnoreCase("AgregarAli")) {
            acceso = agregarAliado;
        }else if (action.equalsIgnoreCase("AgregarAlixEqui")) {
            acceso = agregarAlixEqui;
        }else if (action.equalsIgnoreCase("AgregarEne")) {
            acceso = agregarEnemigo;
        }else if (action.equalsIgnoreCase("AgregarPatro")) {
            acceso = agregarPatro;
        }else if (action.equalsIgnoreCase("AgregarCompanero")) {
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");
            p.setDni(dni);
            p.setNom(nom);
            dao.add(p);
            acceso = listarCom;
        }else if (action.equalsIgnoreCase("AgregarEquipo")) {
            String nom = request.getParameter("txtNom");
            e.setNom(nom);
            dao_e.add(e);
            acceso = listarEqui;
        }else if (action.equalsIgnoreCase("AgregarComxEquipo")) {
            int com = Integer.parseInt(request.getParameter("txtCom"));
            int equi = Integer.parseInt(request.getParameter("txtEqui"));
            c.setCompanero(com);
            c.setEquipo(equi);
            dao_c.add(c);
            acceso = listarComxEqui;
        }else if (action.equalsIgnoreCase("AgregarAliado")) {
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");
            a.setDni(dni);
            a.setNom(nom);
            dao_a.add(a);
            acceso = listarAliado;
        }else if (action.equalsIgnoreCase("AgregarComxEquipo")) {
            int com = Integer.parseInt(request.getParameter("txtCom"));
            int equi = Integer.parseInt(request.getParameter("txtEqui"));
            c.setCompanero(com);
            c.setEquipo(equi);
            dao_c.add(c);
            acceso = listarComxEqui;
            
        }else if (action.equalsIgnoreCase("AgregarAliadoxEquipo")) {
            int ali = Integer.parseInt(request.getParameter("txtAli"));
            int equi = Integer.parseInt(request.getParameter("txtEqui"));
            axe.setAliado(ali);
            axe.setEquipo(equi);
            dao_axe.add(axe);
            acceso = listarAlixEqui;
            
        }else if (action.equalsIgnoreCase("AgregarEnemigo")) {
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");
            en.setDni(dni);
            en.setNom(nom);
            dao_en.add(en);
            acceso = listarEnemigo;
        }else if (action.equalsIgnoreCase("AgregarPatrocinador")) {
            String nit = request.getParameter("txtNit");
            String nom = request.getParameter("txtNom");
            patro.setNit(nit);
            patro.setNom(nom);
            dao_patro.add(patro);
            acceso = listarPatro;
        }else if (action.equalsIgnoreCase("editarCompanero")) {
            request.setAttribute("idcom", request.getParameter("id"));
            acceso = editarCom;
        }else if (action.equalsIgnoreCase("editarEquipo")) {
            request.setAttribute("idequi", request.getParameter("id"));
            acceso = editarEqui;
        }else if (action.equalsIgnoreCase("editarCompaneroxEquipo")) {
            request.setAttribute("idcomxequi", request.getParameter("id"));
            acceso = editarComxEqui;
        }else if (action.equalsIgnoreCase("editarAliado")) {
            request.setAttribute("idaliado", request.getParameter("id"));
            acceso = editarAliado;
        }else if (action.equalsIgnoreCase("editarAliadoxEquipo")) {
            request.setAttribute("idalixequi", request.getParameter("id"));
            acceso = editarAlixEqui;
        }else if (action.equalsIgnoreCase("editarEnemigo")) {
            request.setAttribute("idene", request.getParameter("id"));
            acceso = editarEnemigo;
        }else if (action.equalsIgnoreCase("editarPatrocinador")) {
            request.setAttribute("idpatro", request.getParameter("id"));
            acceso = editarPatro;
        }else if (action.equalsIgnoreCase("ActualizarCompanero")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");
            p.setId(id);
            p.setDni(dni);
            p.setNom(nom);
            dao.edit(p);
            acceso = listarCom;
        }else if (action.equalsIgnoreCase("ActualizarEquipo")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String nom = request.getParameter("txtNom");
            e.setId(id);
            e.setNom(nom);
            dao_e.edit(e);
            acceso = listarEqui;
        }else if (action.equalsIgnoreCase("ActualizarCompaneroxEquipo")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            int com = Integer.parseInt(request.getParameter("txtCom"));
            int equi = Integer.parseInt(request.getParameter("txtEqui"));
            c.setId(id);
            c.setCompanero(com);
            c.setEquipo(equi);
            dao_c.edit(c);
            acceso = listarComxEqui;
        }else if (action.equalsIgnoreCase("ActualizarAliado")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");
            a.setId(id);
            a.setDni(dni);
            a.setNom(nom);
            dao_a.edit(a);
            acceso = listarAliado;
        }else if (action.equalsIgnoreCase("ActualizarAliadoxEquipo")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            int ali = Integer.parseInt(request.getParameter("txtAli"));
            int equi = Integer.parseInt(request.getParameter("txtEqui"));
            axe.setId(id);
            axe.setAliado(ali);
            axe.setEquipo(equi);
            dao_axe.edit(axe);
            acceso = listarAlixEqui;
        }else if (action.equalsIgnoreCase("ActualizarEnemigo")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String dni = request.getParameter("txtDni");
            String nom = request.getParameter("txtNom");
            en.setId(id);
            en.setDni(dni);
            en.setNom(nom);
            dao_en.edit(en);
            acceso = listarEnemigo;
        }else if (action.equalsIgnoreCase("ActualizarPatrocinador")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String nit = request.getParameter("txtNit");
            String nom = request.getParameter("txtNom");
            patro.setId(id);
            patro.setNit(nit);
            patro.setNom(nom);
            dao_patro.edit(patro);
            acceso = listarPatro;
        }else if (action.equalsIgnoreCase("eliminarCompanero")) {
            id = Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso = listarCom;
        }else if (action.equalsIgnoreCase("eliminarEquipo")) {
            id = Integer.parseInt(request.getParameter("id"));
            e.setId(id);
            dao_e.eliminar(id);
            acceso = listarEqui;
        }else if (action.equalsIgnoreCase("eliminarCompaneroxEquipo")) {
            id = Integer.parseInt(request.getParameter("id"));
            c.setId(id);
            dao_c.eliminar(id);
            acceso = listarComxEqui;
        }else if (action.equalsIgnoreCase("eliminarAliado")) {
            id = Integer.parseInt(request.getParameter("id"));
            a.setId(id);
            dao_a.eliminar(id);
            acceso = listarAliado;
        }else if (action.equalsIgnoreCase("eliminarAliadoxEquipo")) {
            id = Integer.parseInt(request.getParameter("id"));
            axe.setId(id);
            dao_axe.eliminar(id);
            acceso = listarAlixEqui;
        }else if (action.equalsIgnoreCase("eliminarEnemigo")) {
            id = Integer.parseInt(request.getParameter("id"));
            en.setId(id);
            dao_en.eliminar(id);
            acceso = listarEnemigo;
        }else if (action.equalsIgnoreCase("eliminarPatrocinador")) {
            id = Integer.parseInt(request.getParameter("id"));
            patro.setId(id);
            dao_patro.eliminar(id);
            acceso = listarPatro;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
