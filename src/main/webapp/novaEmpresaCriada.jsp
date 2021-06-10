<%
	String nome = (String) request.getAttribute("nomeEmpresa");
 %>
<!DOCTYPE html>
<html>
<head>
<meta>
<title>Minha Primeira JSP</title>
</head>
<body>
	<h2>Empresa <%=nome%></h2>
</body>
</html>