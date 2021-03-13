

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class WelcomeServelet
 */
public class WelcomeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("uname");
		
		PrintWriter pw = response.getWriter();
		
		pw.write(name+ " welcome!!!!!!!!");
		
		pw.println("</html>");
		pw.println("<body bgcolor = 'pink'><br>");
		pw.println("<br>hello <i>" +name+ "</i>");
		pw.println("<br>Welcome  to my world!!!!!!!<br>");
		pw.println("<a href = './LogoutServelet'>LOGOUT</a>");
		pw.println("</body>");
		
		pw.println("</html>");
		
		pw.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
