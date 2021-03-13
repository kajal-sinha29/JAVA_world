

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		try
		{
			String nm = request.getParameter("uname");
			String pass = request.getParameter("pwd");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			
			Connection con = DriverManager.getConnection(url, "system", "root");
			
			System.out.println("connected sucessfully");
			
			PreparedStatement pst = con.prepareStatement("select * from login where name = ? and password = ?");
			pst.setString(1,  nm);
			pst.setString(2,  pass);
			
			ResultSet  rs = pst.executeQuery();
			if(rs.next())
			{
				System.out.println("<i>Login Sucessful</i>");
			}
			else
			{
				System.out.println("<i>Login Failed</i>");
			}
			
					
		}
	catch(ClassNotFoundException  | SQLException e)
		{
		e.printStackTrace();
		}
	}

}
