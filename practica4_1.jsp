<%-- 
    Document   : practica4_1
    Created on : 19/09/2018, 06:46:30 PM
    Author     : asifu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String nombre = request.getParameter("txt1");
String apellido1 = request.getParameter("txt2");
String apellido2 = request.getParameter("txt3");
String fecha = request.getParameter("txt4");
String mail = request.getParameter("txt5");
String pass = request.getParameter("txt6");


        
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
%>

