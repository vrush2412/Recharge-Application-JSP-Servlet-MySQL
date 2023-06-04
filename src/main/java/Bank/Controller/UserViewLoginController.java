package Bank.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Admin.Dao.AdminImpl;
import Bank.Model.Operator;

/**
 * Servlet implementation class UserViewLoginController
 */
@WebServlet("/UserViewLoginController")
public class UserViewLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserViewLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminImpl ai=new AdminImpl();
		List<Operator> lstreg= ai.display();
	//	PrintWriter pw= response.getWriter();


		//             reg=lstreg.get(0);
//		 TYPE 2::::
		HttpSession session = request.getSession();
		session.setAttribute("data", lstreg);
		response.sendRedirect("DisViewPlanL.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
