package Bank.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bank.Dao.DbConnection;
import Bank.Model.User;
import Bank.Model.forgotpass;
import user.Dao.userImpl;

/**
 * Servlet implementation class forgotpassController
 */
@WebServlet("/forgotpassController")
public class forgotpassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgotpassController() {
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
		String mob=request.getParameter("User_Mob");
		String pass=request.getParameter("User_pass");
		
		
		userImpl ui=new userImpl();
		int check=ui.forgot(email, mob, pass);
		try {
			if(check==1)
			{
				 response.sendRedirect("forgotpassword.jsp?msg=done");	
			}
			else
				response.sendRedirect("forgotpassword.jsp?msg=invalid");
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
