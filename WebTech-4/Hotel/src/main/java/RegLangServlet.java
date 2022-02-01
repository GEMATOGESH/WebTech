import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reglang")
public class RegLangServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        response.setContentType("text/html");
        
        String buttonClicked = request.getParameter("btn");
        
        boolean lang = false;
        if("eng".equals(buttonClicked))
            lang = false;
        else if("rus".equals(buttonClicked))
            lang = true;
        
        request.setAttribute("language", lang);
		getServletContext().getRequestDispatcher("/reg.jsp").forward(request, response);
        
    }

}