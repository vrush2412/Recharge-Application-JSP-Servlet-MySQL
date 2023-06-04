package Bank.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import user.Dao.userImpl;

/**
 * Servlet implementation class DeleteUserController
 */
@WebServlet("/DeleteUserController")
public class DeleteUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws ServletException, IOException {
		
		session=request.getSession();
		int regno=(int) session.getAttribute("User_Id");
	    userImpl ri=new userImpl();
	    ri.delete_user(regno);
	    session.invalidate();
	    request.setAttribute("message","<h2>deleted successfully</h2>");
	//    request.forward(request, response);
       
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws ServletException, IOException {
		
		 
	}
	

}
