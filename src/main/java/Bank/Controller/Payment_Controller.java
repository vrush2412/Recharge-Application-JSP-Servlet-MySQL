package Bank.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Admin.Dao.AdminImpl;
import Bank.Model.UserLogin;
import Bank.Model.payment;
import user.Dao.userImpl;

/**
 * Servlet implementation class Payment_Controller
 */
@WebServlet("/Payment_Controller")
public class Payment_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Name=request.getParameter("Name");
		String Email=request.getParameter("Email");
		String Dob =request.getParameter("Dob");
		String Gender =request.getParameter("Gender");
		String PayMentmod =request.getParameter("PayMentmod");
		String BankName =request.getParameter("BankName");
		String Amount =request.getParameter("Amount");
		String Date =request.getParameter("Date");

		payment pay=new payment(Name, Email, Dob, Gender, PayMentmod, BankName, Amount, Date);
	     pay.setName(Name);
	     pay.setEmail(Email);
	     pay.setDob(Dob);
	     pay.setGender(Gender);
	     pay.setPayMentmod(PayMentmod);
	     pay.setBankName(BankName);
	     pay.setAmount(Amount);
	     pay.setDate(Date);

		AdminImpl aimp=new AdminImpl();
		int i;
		i=aimp.paymentus(pay);

		HttpSession sesssion=request.getSession();

		if(i==1)
		{
			sesssion.setAttribute("msg",aimp);
			response.sendRedirect("pay.jsp");
		}
		else
		{    
			sesssion.setAttribute("msg", i);
			response.sendRedirect("paymentPage.jsp");
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
