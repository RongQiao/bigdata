<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="com.bigdata.web.User"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Rong's Hello World</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<%
			User u = (User)request.getAttribute("user1");	
		String name = u.getFirstName() + u.getLastName(); 
		%>
		<div class="container">
			<h1><%= "Hello World! "%><%= name%> <%= new java.util.Date() %></h1>
		</div>
	</body>
</html>