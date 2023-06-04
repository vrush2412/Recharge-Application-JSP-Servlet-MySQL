package Bank.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.Dao.AdminImpl;
import Bank.Model.Admin;
import Bank.Model.User;
import user.Dao.userImpl;

/**
 * Servlet implementation class UserRegister_Controller
 */
@WebServlet("/UserRegister_Controller")
public class UserRegister_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserRegister_Controller() {
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
		PrintWriter pw=response.getWriter();
		int id=Integer.parseInt(request.getParameter("User_Id"));
		String name=request.getParameter("User_Name");
		String mob=request.getParameter("User_Mob");
		String uname=request.getParameter("User_Uname");
		String email=request.getParameter("User_Email");
		String pass=request.getParameter("User_pass");

		User us=new User(id, name, mob, uname, email, pass);
		userImpl ul=new userImpl();

		List<User> lstus=new ArrayList<User>();
		lstus.add(us);
		int i=ul.create(lstus);
		if(i>0)
		{
			response.sendRedirect("HomePage.jsp");

		}
		else {
			response.sendRedirect("User_Register.jsp");
			
		}
	}

}
