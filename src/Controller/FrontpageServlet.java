package Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/frontpage"})
public class FrontpageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rs = this.getServletContext().getRequestDispatcher("/WEB-INF/views/frontpage.jsp");
		rs.forward(request, response);


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name1 = request.getParameter("ID1");
		String name2 = request.getParameter("ID2"); 
		String name3 = request.getParameter("ID3"); 

		if(name1 != null){
			RequestDispatcher rs = this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rs.forward(request, response);
		}
		else if(name2 != null){ 
			RequestDispatcher rs = this.getServletContext().getRequestDispatcher("/WEB-INF/views/set.jsp"); 
			rs.forward(request, response);
		}
		else if(name3 != null){ 
			RequestDispatcher rs = this.getServletContext().getRequestDispatcher("/WEB-INF/views/map.jsp"); 
			rs.forward(request, response);
		}
	}

}
