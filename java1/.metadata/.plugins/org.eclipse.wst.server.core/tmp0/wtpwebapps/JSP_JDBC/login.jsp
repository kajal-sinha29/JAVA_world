<%@ page import = "java.sql.Connection" %>
<%@ page import = "java.sql.ResultSet" %>
<%@ page import = "java.sql.PreparedStatement" %>
<%@ page import = "java.sql.DriverManager" %>



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

String uname = request.getParameter("uname");
String pass = request.getParameter("pwd");

Class.forName("oracle.jdbc.driver.OracleDriver");

String url = "jdbc:oracle:thin:@localhost:1521:XE";

Connection con = DriverManager.getConnection(url, "system", "root");

System.out.println("connected successfully ..!!!!");

PreparedStatement pst = con.prepareStatement("select * from login where name = ? and password = ?");

pst.setString(1, uname);
pst.setString(2, pass);

ResultSet rs = pst.executeQuery();

if(rs.next())
{
	%>
	out.println("login successfull");
	<jsp:forward page="./welcome.jsp">
	<jsp:param name="product" value="name"/>
	</jsp:forward>
	
<%	
}
else

{
	out.println("incorrect password");
}

%>

</body>
</html>