/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author asifu
 */
public class Registrarse extends HttpServlet{
    
    String usser;
    String pass;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        usser = request.getParameter("txt3");
        pass = request.getParameter("txt4");
        HttpSession sesion = request.getSession();
        sesion.setAttribute("username", usser);
        sesion.setAttribute("password", pass);
        response.sendRedirect("index.jsp"); 
    }
}
