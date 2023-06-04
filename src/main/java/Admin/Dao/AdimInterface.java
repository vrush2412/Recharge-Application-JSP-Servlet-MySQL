package Admin.Dao;
import java.util.List;

import Bank.Model.Admin;
import Bank.Model.AdminLogin;
import Bank.Model.Operator;
import Bank.Model.payment;


public interface AdimInterface {

	 public int create(List<Admin> lsta);
	 public List<Admin>  displayall();
	 public String Login(AdminLogin al);
	 public boolean insert_operator(String operator,String company);
	 public int createPlan(List<Operator> lsta);
	 public List<Operator> display();
	 public int Update(String PlanName,String pExpiry, String price,int id);
	 public int delete(int id) ;
	 public int paymentus(payment pi);
}
