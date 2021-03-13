<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <% out.println("Hiiii "); %>
  <%! int a=10;  %> 
  <%=a %>
  <% out.println("a= "+a); %>
  <%! int b=20; %>
  <% int c=a+b; 
     out.println("Sum = "+c);
  %>
 

</body>
</html>