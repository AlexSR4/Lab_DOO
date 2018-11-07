/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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

@Controller
@RequestMapping(value = "/Login.htm")
public class Login  extends HttpServlet{
    
    String usser;
    String pass;
    
    //@RequestMapping(method = RequestMethod.POST)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        usser = request.getParameter("txt1");
        pass = request.getParameter("txt2");
        HttpSession sesion = request.getSession();
        String ssusser = (String) sesion.getAttribute("username");
        String sspass = (String) sesion.getAttribute("password");
        Cookie cousser = new Cookie ("USUARIO" ,usser);
        Cookie copass = new Cookie ("CLAVE", pass);
        
        response.addCookie(cousser);
        response.addCookie(copass);
        
        if(ssusser.equals(null) && sspass.equals(null)){
           
            response.sendRedirect("Registro.jsp");
        }else if(ssusser.equals(null) && sspass.equals(null)){
                response.sendRedirect("Fallo");
            }else if(ssusser.equals(usser) && sspass.equals(pass)){
                response.sendRedirect("Aceptado");
        }else{
                response.sendRedirect("Fallo");
            }
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}
