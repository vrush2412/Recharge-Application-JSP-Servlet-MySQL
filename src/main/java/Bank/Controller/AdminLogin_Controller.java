package Bank.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Admin.Dao.AdimInterface;
import Admin.Dao.AdminImpl;
import Bank.Model.Admin;
import Bank.Model.AdminLogin;



/**
 * Servlet implementation class AdminLogin_Controller
 */
@WebServlet("/AdminLogin_Controller")
public class AdminLogin_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin_Controller() {
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
		String email=request.getParameter("admin_Email");
		String pass=request.getParameter("admin_pass");
		
		AdminLogin log=new  AdminLogin(email, pass);
		log.setAdmin_Email(email);
		log.setAdmin_pass(pass);
		
		 AdimInterface ai=new AdminImpl();
		  String str;
		  str=ai.Login(log);
		  
//		  boolean b=ri.validate(l);
		  HttpSession sesssion=request.getSession();
		  
//		  if(b)
		  if(str.equals("valid"))
		  {
			  sesssion.setAttribute("msg",log);
			  response.sendRedirect("AdminDashBoard.jsp");
		  }
		  else
		  {    
			  sesssion.setAttribute("msg", str);
			  response.sendRedirect("Register_Admin.jsp");
		  }
	}

}
