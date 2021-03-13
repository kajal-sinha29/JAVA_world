

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Servlet implementation class Loginservlet
 */
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
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
			String mobile_no = request.getParameter("mob_no");
			String pass = request.getParameter("pwd");
			
			Class.forName("oracle:jdbc:driver:OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			
			Connection con = DriverManager.getConnection(url, "system", "root");
			
			PreparedStatement pst = con.prepareStatement("select * from buyer where mobile_no=? and password = ?");
			
			pst.setString(1, mobile_no);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				pw.println("login sucessful !!!!");
			}
			else
			{
				pw.println("inavlid user !!!!!!");
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
