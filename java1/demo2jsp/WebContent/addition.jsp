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
int n=Integer.parseInt(request.getParameter("s"));

int ans;

int n1 = Integer.parseInt(request.getParameter("1st"));
int n2 = Integer.parseInt(request.getParameter("2nd"));

if(n==1)
{
ans = n1+n2;
}
else
{
 ans = n1-n2;
 
}
%>
<br><br><br>
<%=ans %>



</body>
</html>