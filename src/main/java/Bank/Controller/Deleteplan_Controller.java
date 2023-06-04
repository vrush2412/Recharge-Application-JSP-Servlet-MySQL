package Bank.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.Dao.AdminImpl;


/**
 * Servlet implementation class Deleteplan_Controller
 */
@WebServlet("/Deleteplan_Controller")
public class Deleteplan_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deleteplan_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		   
	   AdminImpl ai=new AdminImpl();
	    int i=ai.delete(id);
	    PrintWriter pw=res.getWriter();

	    try {
			
	    	if(i>0)
		    {
	    		res.sendRedirect("Update_deleteOperator.jsp?str=valid");
		    	
		    }
	
		}catch(Exception e) {
			System.out.println(e);
			res.sendRedirect("Update_deleteOperator?str=invalid");
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
