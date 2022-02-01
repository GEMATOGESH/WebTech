

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mangExit")
public class ManagerExitServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("login");
		
		String lang = request.getParameter("language");
		if (lang.equals("true")) {
	        request.setAttribute("language", true);
		}
		else {
	        request.setAttribute("language", false);
		}
		
		getServletContext().getRequestDispatcher("/auth.jsp").forward(request, response);
	}

}
