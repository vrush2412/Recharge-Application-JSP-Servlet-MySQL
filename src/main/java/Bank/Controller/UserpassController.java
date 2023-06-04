package Bank.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bank.Model.UserLogin;
import user.Dao.userImpl;

/**
 * Servlet implementation class UserpassController
 */
@WebServlet("/UserpassController")
public class UserpassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserpassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int id =Integer.parseInt(request.getParameter("User_id"));
		String email = request.getParameter("User_Email");
		String pass = request.getParameter("User_pass");
		
		
		
			
			userImpl ui = new userImpl();
			int i = ui.Updatepass(pass, email);
			 PrintWriter pw=response.getWriter();

			 try {
					
			    	if(i>0)
				    {
			    		response.sendRedirect("MyAccount.jsp?sg=valid");
				    	
				    }
			
				}catch(Exception e) {
					System.out.println(e);
					response.sendRedirect("MyAccount.jsp?sg=invalid");
				}
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
