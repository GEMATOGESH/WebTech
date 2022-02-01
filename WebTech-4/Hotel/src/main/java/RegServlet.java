

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.DAO;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
        String pass = request.getParameter("password");
        String rpass = request.getParameter("rpassword");
        String lang = request.getParameter("lang");
        
        if (!pass.equals(rpass) || pass.equals("") || login.equals("")) {
            onError(lang, request, response);
        }
        
        boolean userInfo = false;
		try {
			userInfo = DAO.exist("select * from auth where login = '" + login + "' and pass = '" + pass + "';");
		} catch (Exception e) {
	        onError(lang, request, response);
		}
        if (!userInfo) {
            boolean result = DAO.update("insert into auth (login, pass, rights) values ('" + login + "','" + pass + "',0);");
            if (result) {
            	if (lang.equals("true")) {
        	        request.setAttribute("language", true);
        		}
        		else {
        	        request.setAttribute("language", false);
        		}
                getServletContext().getRequestDispatcher("/auth.jsp").forward(request, response);
                return;
            }
        }
        
        onError(lang, request, response);
	}
	
	private void onError(String lang, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorstr = "Wrong";
		if (lang.equals("true")) {
			errorstr = "Ошибка";
	        request.setAttribute("language", true);
		}
		else {
	        request.setAttribute("language", false);
		}
    	getServletContext().getRequestDispatcher("/reg.jsp").forward(request, response);
	}

}
