

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class logiinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String uname= request.getParameter("uname");
		String upwd= request.getParameter("upwd");
		if(uname.equals(upwd)) {
			out.println("<center><h1>Welcome to my login page website</h1></center>");
			
		}else {
			out.println("invalid username and password please try again");
			RequestDispatcher rd= request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
		
	}

}
