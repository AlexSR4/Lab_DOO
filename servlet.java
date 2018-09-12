/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.net.UnknownHostException;

/**
 *
 * @author asifu
 */

@WebServlet(name = "servlet", urlPatterns = {"/servlet"})

public class servlet extends HttpServlet {

    public void init() throws ServletException{
        //no hace nada solo inicializa el servlet
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        String ip = null;
        Date hora = new Date();
        
        ip = request.getRemoteAddr();
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        out.println("<html><head><title>Obtener IP y hora cliente</title></head><body>");
        
        out.println("La IP del cliente es : " + ip + "<br>");
        out.println("La hora de la peticion fue : " +hora.toString());
        out.println("</body></html>");
        
    }

    public void destroy(){
        //solo destruye el servelt
    }
    
}
