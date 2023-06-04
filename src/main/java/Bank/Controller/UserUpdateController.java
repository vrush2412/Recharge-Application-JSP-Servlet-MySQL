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
 * Servlet implementation class UserUpdateController
 */
@WebServlet("/UserUpdateController")
public class UserUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int userid = Integer.parseInt(req.getParameter("User_Id"));
		String fname = req.getParameter("User_Name");
		String email = req.getParameter("User_Email");
		String mobileno = req.getParameter("User_Mob");
		String user = req.getParameter("User_Uname");
			
			userImpl ui = new userImpl();
			int i = ui.Update(userid, fname, user, user, email);
			 PrintWriter pw=res.getWriter();

			 try {
					
			    	if(i>0)
				    {
			    		res.sendRedirect("MyAccount.jsp?msg=valid");
				    	
				    }
			
				}catch(Exception e) {
					System.out.println(e);
					res.sendRedirect("MyAccount.jsp?msg=invalid");
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	}	
		
	

}
