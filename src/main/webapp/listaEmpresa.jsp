<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.estudando.gerenciador.servlet.*,java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	<div class="form-group">
		<p>Lista de Empresas</p>
		<hr>
		<ul>
			<c:forEach items="${nomeEmpresa}" var="emp">
				<li>${emp.nome}</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>