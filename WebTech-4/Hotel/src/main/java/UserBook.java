

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.DAO;

/**
 * Servlet implementation class UserBook
 */
@WebServlet("/book")
public class UserBook extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String lang = request.getParameter("lang");
        String login = request.getParameter("login");
        PrintWriter writer = response.getWriter();
        
		try {
			DAO.book(id, login);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

        getServletContext().getRequestDispatcher("/usertable").forward(request, response);
	}

}
