<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<c:url value="/" var="contextPath" />
		
		<link rel="icon" href="${contextPath}resources/images/favicon.png" type="image/png">
		
		<title>Serviços - SISAM</title>
	</head>
	<body>
		<h3>API de serviços Rest do Infnet</h3>
		<hr />
		<ul>
			<li><a href="${contextPath}turmas">Listar turmas</a></li>
			<li><a href="${contextPath}turmas/1">Turma 1</a></li>
			<li><a href="${contextPath}turmas/2">Turma 2</a></li>
			<li><a href="${contextPath}turmas/3">Turma 3</a></li>
		</ul>
		
	</body>
</html>