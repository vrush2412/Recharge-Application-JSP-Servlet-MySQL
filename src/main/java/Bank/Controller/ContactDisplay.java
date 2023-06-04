package Bank.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bank.Model.Contact;
import user.Dao.ContactImp;

/**
 * Servlet implementation class ContactDisplay
 */
@WebServlet("/ContactDisplay")
public class ContactDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactImp cl=new ContactImp();
		List<Contact> lstcon= cl.displayall();
		
		HttpSession session = request.getSession();
		session.setAttribute("empList", lstcon);
		response.sendRedirect("Display.jsp");
		
//		request.setAttribute("empList", lstcon);   //BLUE ONE IS KEY
//		RequestDispatcher view=request.getRequestDispatcher("Display.jsp");
//		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
