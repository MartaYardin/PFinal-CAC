<%@page import="model.Usuario"%>
<%@ page import="dao.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
<%
		String nombre = request.getParameter("inputname");
		String usuario = request.getParameter("inputEmail");
		String contrasenia = request.getParameter("inputPassword");
		out.println(usuario);
		out.println(contrasenia);
		
				
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Boolean usuNuevo = usuarioDAO.registrarNuevo(usuario, contrasenia);
		
		
		response.sendRedirect("pedido.jsp");
		
		
		
	
	%>

</body>
</html>