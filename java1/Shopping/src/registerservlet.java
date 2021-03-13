

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Servlet implementation class registerservlet
 */
public class registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		
		try
		{
			
			String name = request.getParameter("name");
			String pass = request.getParameter("pwd");
			String mobile = request.getParameter("mob_no");
			
			Class.forName("jdbc.oracle.driver.OracleDriver");
			String url = "oracle:jdbc:thin:@localhost:1521:XE";
			
			Connection con = DriverManager.getConnection(url, "system", "root");
			
PreparedStatement pst = con.prepareStatement("insert into buyer values(name = ?,mobile_no=?,password = ?)");
			
			pst.setString(1, name);
			pst.setString(2, mobile);
			pst.setString(3, pass);
			
			pw.println("you are register successfully");
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
