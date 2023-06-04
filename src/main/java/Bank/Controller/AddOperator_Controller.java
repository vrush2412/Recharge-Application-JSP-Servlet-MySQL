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
import Bank.Model.Operator;

/**
 * Servlet implementation class AddOperator_Controller
 */
@WebServlet("/AddOperator_Controller")
public class AddOperator_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOperator_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		   int id=Integer.parseInt(request.getParameter("id"));
		   String name=request.getParameter("PlanName");
		   String uname=request.getParameter("company");
		   String email=request.getParameter("pExpiry");
		   String pass=request.getParameter("price");
		
		  Operator ope=new Operator(id, name, uname, email, pass);
		   AdminImpl ai=new AdminImpl();
		   
		    List<Operator> lsta=new ArrayList<Operator>();
		    lsta.add(ope);
		    int i=ai.createPlan(lsta);
		    try {
				///str="Valid";
		    	if(i>0)
			    {
		    		response.sendRedirect("Add_Operator.jsp?msg=valid");
			    	
			    }
		
			}catch(Exception e) {
				System.out.println(e);
				response.sendRedirect("Add_Operator.jsp?msg=invalid");
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
