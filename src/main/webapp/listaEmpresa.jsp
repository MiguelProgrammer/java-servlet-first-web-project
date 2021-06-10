<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.estudando.gerenciador.servlet.*,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="form-group">
		<ul>
			<%
			List<Empresa> empresas = (List<Empresa>) request.getAttribute("nomeEmpresa");
			for (Empresa emp : empresas){
				%><li><%=emp.getNome()%></li>
			<% } %>
		</ul>
	</div>
</body>
</html>