package Bank.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bank.Model.Contact;
import Bank.Model.User;

import user.Dao.ContactImp;
import user.Dao.userImpl;

/**
 * Servlet implementation class ContactUs_Controller
 */
@WebServlet("/ContactUs_Controller")
public class ContactUs_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactUs_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String Name=request.getParameter("Name");
		String Email=request.getParameter("Email");
		String Sub=request.getParameter("Sub");
		String Message=request.getParameter("Message");
		String Date=request.getParameter("Date");

		Contact cont=new Contact(Name, Email, Sub, Message, Date);
		ContactImp cl=new ContactImp();

		List<Contact> lstcon=new ArrayList<Contact>();
		lstcon.add(cont);
		int i=cl.create(lstcon);
		if(i>0)
		{
			response.sendRedirect("HomePage.jsp");

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
