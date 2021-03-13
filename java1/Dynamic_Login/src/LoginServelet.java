

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServelet
 */
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("uname");
		String pwd = request.getParameter("upwd");
		
		PrintWriter out = response.getWriter();
		
	if(name.equals("a") && pwd.equals("a"))
	{
		System.out.println("valid user!!!!!!");
		RequestDispatcher rd1 = getServletContext().getRequestDispatcher("/WelcomeServelet");
		 rd1.forward(request, response);
	}
	
	else
	{
		
		RequestDispatcher rd2 = getServletContext().getRequestDispatcher("/Login.html");
		System.out.println("not valid user");
		System.out.println("please try again!!!!!!");
		rd2.include(request, response);
		
	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
