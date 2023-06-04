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

import Admin.Dao.AdimInterface;
import Admin.Dao.AdminImpl;
import Bank.Model.Admin;

/**
 * Servlet implementation class Adim_Controller
 */
@WebServlet("/Adim_Controller")
public class Adim_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adim_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
		   int id=Integer.parseInt(request.getParameter("admin_Id"));
		   String name=request.getParameter("admin_Name");
		   String uname=request.getParameter("admin_Uname");
		   String email=request.getParameter("admin_Email");
		   String pass=request.getParameter("admin_pass");
		
		    Admin ad=new Admin(id, name, uname, email, pass) ;
		   AdminImpl ai=new AdminImpl();
		   
		    List<Admin> lsta=new ArrayList<Admin>();
		    lsta.add(ad);
		    int i=ai.create(lsta);
		    try {
				///str="Valid";
		    	if(i>0)
			    {
		    		response.sendRedirect("Register_Admin.jsp?msg=valid");
			    	
			    }
		    	else
		    	{
		    		response.sendRedirect("Register_Admin.jsp?msg=invalid");
		    	}
		
			}catch(Exception e) {
				System.out.println(e);
				
			}
		    
		   
		doGet(request, response);
	}

}
