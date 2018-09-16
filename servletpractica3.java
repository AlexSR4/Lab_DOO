/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asifu
 */
public class servletpractica3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
         PrintWriter out = response.getWriter();
         
         out.println("<!DOCTYPE html>");
         out.println("<html><head></head><title> Formulario </title>");
         out.println("<body>");
         out.println("<form method=\"post\" action=\"servletpractica3\">");
         out.println("<p>Nombre: </p>");
         out.println("<input type=\"text\" name=\"txt1\">");
         out.println("<p>Primer Apellido</p>");
         out.println("<input type=\"text\" name=\"txt2\">");
         out.println("<p>Segundo Apellido</p>");
         out.println("<input type=\"text\" name=\"txt3\">");
         out.println("<p>Fecha de Nacimiento</p>");
         out.println("<input type=\"date\" name=\"txt4\">");
         out.println("<p>Email</p>");
         out.println("<input type=\"email\" name=\"txt5\">");
         out.println("<p>Password</p>");
         out.println("<input type=\"password\" name=\"txt6\">");
         out.println("<br><br><input type=\"submit\" name=\"boton\">");
         out.println("</form></body></html>");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("txt1");
        String apellido1 = request.getParameter("txt2");
        String apellido2 = request.getParameter("txt3");
        String fecha = request.getParameter("txt4");
        String mail = request.getParameter("txt5");
        String pass = request.getParameter("txt6");
        
        PrintWriter out;
        out = response.getWriter();
        
        out.println("<html>");
        out.println("<head><title>Formulario</title></head>");
        out.println("<body>");
        out.println(" Tu nombre es:  " + nombre );
        out.println("<br> Tu primer apellido es:  " + apellido1 );
        out.println("<br> Tu segundo apellido es:  " + apellido2);
        out.println("<br> Tu fecha de nacimiento es:  " + fecha);
        out.println("<br> Tu email es:  " + mail);
        out.println("<br> El password escogido es:  " + pass);
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
