package Bank.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.Dao.AdminImpl;
import user.Dao.userImpl;

/**
 * Servlet implementation class UpdateOperator_Controller
 */
@WebServlet("/UpdateOperator_Controller")
public class UpdateOperator_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateOperator_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter(" id"));
		String pname = req.getParameter(" PlanName");
		String pexpiry = req.getParameter(" pExpiry");
		String price = req.getParameter("price");
		
			
			AdminImpl ai = new AdminImpl();
			int i = ai.Update(pname, pexpiry, price, id);
			 PrintWriter pw=res.getWriter();

			 try {
					
			    	if(i>0)
				    {
			    		res.sendRedirect("Update_deleteOperator.jsp?msg=valid");
				    	
				    }
			
				}catch(Exception e) {
					System.out.println(e);
					res.sendRedirect("Update_deleteOperator?msg=invalid");
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
