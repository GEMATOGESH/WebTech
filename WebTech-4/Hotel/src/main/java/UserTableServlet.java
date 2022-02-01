

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.DAO;
import logic.Room;

@WebServlet("/usertable")
public class UserTableServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        
		boolean lang = false; 
		String str = request.getParameter("language"); 
	   	Object obj = request.getAttribute("language");
	   	if (str != null) {
	   		if (str.equals("true")) 
	   			lang = true; 
	   	}
	   	else {
	       	if (obj != null) {
	       		lang = (boolean)obj;
	       	}
	   	}
        
        ArrayList<Room> rooms = new ArrayList<Room>();
		try {
			rooms = DAO.usertable("SELECT rooms.id, type, cost, booked FROM rooms LEFT JOIN roominuse ON rooms.id = roominuse.room_id;");
		} catch (Exception e) {
			PrintWriter writer = response.getWriter();
			try {
				writer.print(e.toString());
	        } finally {
	            writer.close();  
	        }
		}
		
	    request.setAttribute("language", lang);

        HttpSession session = request.getSession();
        session.setAttribute("login", request.getParameter("login"));
        
        request.setAttribute("rooms", rooms);
        getServletContext().getRequestDispatcher("/client.jsp").forward(request, response);
	}

}
