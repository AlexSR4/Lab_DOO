<%-- 
    Document   : Aceptado
    Created on : 6/11/2018, 10:51:22 PM
    Author     : asifu
--%>

<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aceptado</title>
    </head>
    <%
        HttpSession sesion = request.getSession();
        String usuario,contrasena;
        usuario = sesion.getAttribute("username").toString();
        contrasena = sesion.getAttribute("password").toString();
        Usuario u = new Usuario(usuario,contrasena);
    %> 
    <body>
        <h1>Bienvenido</h1>
        <br><br>Tu Nombre es: <%=u.getUsuario()%>
        <br>Tu Contraseña es: <%=u.getPassword()%>
        <form action="Salir.jsp">
            <input type="submit" name="Salir"/>
        </form>
        <br>
        <a href="Pagina1.html">Pagina 1</a>
        <a href="Pagina2.html">Pagina 2</a> 
        <a href="Pagina3.html">Pagina 3</a>
        <a href="Cookie.jsp">
            <input type="submit" value="cookie" name="Ver cookie"/>
        </a>
        <br>
    </body>
</html>
