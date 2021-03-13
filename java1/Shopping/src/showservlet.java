
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.swing.*;
/**
 * Servlet implementation class showservlet
 */
public class showservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showservlet() {
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
			Class.forName("jdbc.oracle.driver.OracleDriver");
			String url = "oracle:jdbc:thin:@localHost:1521:XE";
			
			Connection con = DriverManager.getConnection(url, "system", "root");
			
			pw.println("<html>");
			pw.println("<a href  = 'Mobileservlet.java'> MOBILE</a>");
			pw.println("<a href  = 'Wmservlet.java'> WASHING MACHINE</a>");
			pw.println("<a href  = 'refservlet.java'> REFRIGIRATOR</a>");
			
			pw.println("</html>");
				
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
