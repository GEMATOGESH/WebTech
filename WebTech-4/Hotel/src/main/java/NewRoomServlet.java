

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.DAO;

@WebServlet("/newroom")
public class NewRoomServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
        String cost = request.getParameter("cost");
        String lang = request.getParameter("lang");
        
        if (type.equals("") || cost.equals("")) {
            getServletContext().getRequestDispatcher("/newRoom.jsp").forward(request, response);
        }
        
        boolean result = DAO.update("insert into rooms(type, cost, booked) values ('" + type + "', " + cost + ", 0);");
        if (result) {
            
            getServletContext().getRequestDispatcher("/mangtable").forward(request, response);
            return;
        }
        
        getServletContext().getRequestDispatcher("/newRoom.jsp").forward(request, response);
	}

}
