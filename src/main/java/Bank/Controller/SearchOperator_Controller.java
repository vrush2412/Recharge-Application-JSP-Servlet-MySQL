package Bank.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bank.Model.Operator;
import user.Dao.userImpl;

/**
 * Servlet implementation class SearchOperator_Controller
 */
@WebServlet("/SearchOperator_Controller")
public class SearchOperator_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchOperator_Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String name=request.getParameter("PlanName");
		
		userImpl ui=new userImpl();
		List<Operator> lstop = ui.retrive(name);
		Operator op=lstop.get(0);
		session.setAttribute("data", op);
		response.sendRedirect("SearchOperator.jsp");
	}
	//		   PrintWriter pw=response.getWriter();

	//		   pw.println(reg.getRegno()+"\t"+reg.getName()+"\t"+reg.getEmail()+"\t"+reg.getUname()+"\t"+reg.getPass()+"\t"+reg.getAccbal());



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
