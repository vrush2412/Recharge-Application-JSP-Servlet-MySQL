package Bank.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bank.Model.UserLogin;
import user.Dao.userImpl;

/**
 * Servlet implementation class UserLogin_Controller
 */
@WebServlet("/UserLogin_Controller")
public class UserLogin_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserLogin_Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email=request.getParameter("User_Email");
		String pass=request.getParameter("User_pass");

		UserLogin ul=new UserLogin(email, pass);
		ul.setUser_Email(email);
		ul.setUser_pass(pass);

		userImpl uimp=new userImpl();
		String str;
		str=uimp.Login(ul);

		HttpSession sesssion=request.getSession();

		if(str.equals("valid"))
		{
			sesssion.setAttribute("msg",ul);
			response.sendRedirect("Homelogout.jsp");
		}
		else
		{    
			sesssion.setAttribute("msg", str);
			response.sendRedirect("User_Register.jsp");
		}
		
		

		
	}
}
