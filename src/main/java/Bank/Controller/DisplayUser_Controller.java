package Bank.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Bank.Model.User;
import user.Dao.userImpl;

/**
 * Servlet implementation class DisplayUser_Controller
 */
@WebServlet("/DisplayUser_Controller")
public class DisplayUser_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayUser_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userImpl ui=new userImpl();
		List<User> lstreg= ui.displayall();
	//	PrintWriter pw= response.getWriter();


		//             reg=lstreg.get(0);
//		 TYPE 2::::
		HttpSession session = request.getSession();
		session.setAttribute("data", lstreg);
		response.sendRedirect("DisplayUsers.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
