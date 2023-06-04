package user.Dao;

import java.util.List;


import Bank.Model.Operator;
import Bank.Model.User;
import Bank.Model.UserLogin;
import Bank.Model.payment;


public interface userInerface {

	public int create(List<User> lstus);
	public List<User>  displayall();
	public String Login(UserLogin ul);
	public int Update(int User_Id,String User_Name, String User_Mob,String User_Uname,String User_Email );
	public void delete_user(int User_Id);
	public int forgot(String User_Email ,String User_Mob,String User_pass);
	public boolean mobile_recharge(String mobileno,String operatorid,String planid,String amount);
	public List<Operator> retrive(String PlanName) ;
	public int Updatepass(String User_pass, String User_Email);

}
// int User_Id,String User_Name, String User_Mob,String User_Uname,Str ing User_Email ,String User_pass