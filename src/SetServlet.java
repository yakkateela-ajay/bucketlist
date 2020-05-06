import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TouristPlace;
import service.ListOperations;
import service.SetOperations;
@WebServlet(urlPatterns= {"/set"})
public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Set<TouristPlace> set=new HashSet<TouristPlace>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String destination = request.getParameter("travel");
		String rank = request.getParameter("rank");
		String add = request.getParameter("add");
		
		String sortbydestination = request.getParameter("sortbydestination");
		String sortbyrank = request.getParameter("sortbyrank");
		String remove = request.getParameter("delete");
		String reset = request.getParameter("reset");
		
		TouristPlace tp = new TouristPlace(name,destination,rank);
		SetOperations sp=new SetOperations();
		
		if(add!=null) {
			// call the add method and store the return value in a set variable
			set= sp.add(tp);
			request.setAttribute("bucketListadd", set/*pass the return value */);
			request.setAttribute("message", "user added successfully");
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}
		if(remove!=null) {
			// call the remove method and store the return value in a set variable
			set = sp.remove(tp);
			
			request.setAttribute("bucketListremove", set/*pass the return value */);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}
		
		if(sortbydestination!=null) {
			// call the sortByDestination method and store the return value in a set variable
			TreeSet<TouristPlace>  sortByDest = (TreeSet<TouristPlace>) sp.sortByDestination((HashSet<TouristPlace>) set);
			
			request.setAttribute("bucketList", sortByDest/*pass the return value */);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}
		if(sortbyrank!=null) {
			// call the sortByRank method and store the return value in a set variable
			TreeSet<TouristPlace> sortByRank = (TreeSet<TouristPlace>) sp.sortByRank((HashSet<TouristPlace>) set);
			request.setAttribute("bucketList", sortByRank/*pass the return value */);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}
		if(reset!=null) {
			// call the reset method and store the return value in a set variable
			 Set<TouristPlace> resetVariable =(Set<TouristPlace>) sp.reset((HashSet<TouristPlace>) set);
			request.setAttribute("bucketList", resetVariable/*pass the return value */);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}