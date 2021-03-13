<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
  String product=request.getParameter("username");
  String name=request.getParameter("role");
%>
Welcome <%=name%>,
<%
    session.setAttribute("product",name);
    out.print("<br>Role:"+name);  
%>
<br>
<br>
Click below to view Products<br>
<a href="viewProductJsp.jsp">View Product</a>

</body>
</html>