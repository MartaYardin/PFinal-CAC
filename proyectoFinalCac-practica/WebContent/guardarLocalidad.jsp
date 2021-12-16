<%@ page import="dao.LocalidadDAO"%>
<%@page import="model.Localidad"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Localidades</title>
</head>
<body>
	<%
	
	String nombreYApellido =request.getParameter("nombre");
	
	Localidad localidad = new Localidad(nombreYApellido);
	LocalidadDAO localidadDAO = new LocalidadDAO();
	Boolean okGuardado = localidadDAO.guardarLocalidad(localidad);
	
   if (okGuardado) {
        out.println("La Localidad se agregó correctamente <br>");
    } else {
        out.println("Error en agregar localidad <br>");
    }
	
	%>


</body>
</html>