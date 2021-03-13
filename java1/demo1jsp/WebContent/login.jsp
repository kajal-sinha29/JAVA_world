<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "cyan">
<%
String nm = request.getParameter("uname");
String pwd = request.getParameter("pwd");

if(nm.equals("kajal") && pwd.equals("kajal123"))
out.println("sucessfull!!!!!");

else
	out.println("denied");


%>


</body>
</html>