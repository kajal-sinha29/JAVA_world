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
int n = Integer.parseInt(request.getParameter("a1"));

int n1 = Integer.parseInt(request.getParameter("1st"));
int n2 = Integer.parseInt(request.getParameter("2nd"));
int ans;

if(n==1)
{
ans = n1+n2;
out.println("result = "+ans);

}

if(n==2)
{
	ans = n1-n2;
	out.println("result = "+ans);

}

if(n==3)
{
	ans = n1*n2;
	out.println("result = "+ans);

}

if(n==4)
{
	ans = n1/n2;
	out.println("result = "+ans);

}



%>


</body>
</html>