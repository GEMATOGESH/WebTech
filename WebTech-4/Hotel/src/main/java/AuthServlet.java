
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.DAO;
  
@WebServlet("/auth")
public class AuthServlet extends HttpServlet {
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        response.setContentType("text/html");
         
        String login = request.getParameter("login");
        String pass = request.getParameter("password");
        String lang = request.getParameter("lang");
        
        Object[] userInfo = null;
		try {
			userInfo = DAO.login("select login, rights from auth where login = '" + login + "' and pass = '" + pass + "';");
			if (userInfo == null) {
				String errorstr = "Wrong";
				if (lang.equals("true")) {
					errorstr = "Ошибка";
			        request.setAttribute("language", true);
				}
				else {
			        request.setAttribute("language", false);
				}
		        request.setAttribute("error", errorstr);
				getServletContext().getRequestDispatcher("/auth.jsp").forward(request, response);
				return;
			}
		} catch (Exception e) {
			PrintWriter writer = response.getWriter();
			try {
				writer.print(e.toString());
	        } finally {
	            writer.close();  
	        }
		}

        HttpSession session = request.getSession();
        session.setAttribute("login", userInfo[0]);
        
    	boolean rights = (boolean) userInfo[1];
    	
    	if (lang.equals("true")) {
	        request.setAttribute("language", true);
		}
		else {
	        request.setAttribute("language", false);
		}
    	
    	if (rights) {
            getServletContext().getRequestDispatcher("/mangtable").forward(request, response);
    	}
    	else {
            getServletContext().getRequestDispatcher("/usertable").forward(request, response);
    	}
        
    }
}