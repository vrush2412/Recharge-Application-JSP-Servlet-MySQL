package user.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Bank.Dao.DbConnection;
import Bank.Model.Admin;

import Bank.Model.Operator;
import Bank.Model.User;
import Bank.Model.UserLogin;



public class userImpl implements userInerface{
  Connection con=DbConnection.getConnection();
  int i;
  ResultSet rs;
	@Override
	public int create(List<User> lstus) {
		Iterator<User> us= lstus.iterator();
		while(us.hasNext())
		{
			User user=us.next();  // Admin entity
			try {
				PreparedStatement pstate=con.prepareStatement("insert into cust values(?,?,?,?,?,?)");
				pstate.setInt(1,user.getUser_Id() );
				pstate.setString(2,user.getUser_Name());
				pstate.setString(3,user.getUser_Mob() );
				pstate.setString(4,user.getUser_Uname() );
				pstate.setString(5,user.getUser_Email());
				pstate.setString(6,user.getUser_pass());
				
				i=pstate.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		return i;
	}
	@Override
	public List<User> displayall() {
		List<User> lstus=new ArrayList<User>();
		String str="select * from cust";
		try {
			Statement state=con.createStatement();
			rs=state.executeQuery(str);
			while(rs.next())
			{  User user=new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6));
			lstus.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstus;
	}

	@Override
	public String Login(UserLogin ul) {
		String str=null;
		List<User> lstus=null;
		lstus=displayall();
		
		for(User us :lstus)
		{
			if(us.getUser_Email().equals(ul.getUser_Email())) {
				if(us.getUser_pass().equals(ul.getUser_pass())) {
					str="valid";
					break;
				}
				else
				{
					str="Invalid password";
				}
				
			}
			else
			{
				str="Invalid Username";
			}
		}
		return str;
	}
	
	public int Update(int User_Id,String User_Name, String User_Mob,String User_Uname,String User_Email ) {
		try {
			PreparedStatement pstate=con.prepareStatement("update cust set User_Name=?, User_Mob=?, User_Uname=?,User_Email=? where User_Id=? ");
			pstate.setString(1,User_Name);
			pstate.setString(2,User_Mob);
			pstate.setString(3,User_Uname);
			pstate.setString(4, User_Email);
			pstate.setInt(5,User_Id);
			

			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

	@Override
	public int forgot(String User_Email, String User_Mob, String User_pass) {
		int check=0;
		
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from cust where user_email='"+User_Email+"'and user_mob='"+User_Mob+"'");

			while(rs.next()) {
				check=1;
				
				st.executeQuery("update cust set user_pass='" +User_pass+"'where user_email='"+User_Email+"'");
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}
	@Override
	public boolean mobile_recharge(String mobileno, String operatorid, String planid, String amount) {
		try
		{
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select mobile_no,operator_id from mobileno_details");
			while(rs.next())
			{
				if(rs.getString(1).equals(mobileno)&&rs.getInt(2)==Integer.parseInt(operatorid))
				{
					stmt.executeUpdate("insert into mobile_recharge(operator_id,mobile_no,plan_id,amount) values("+operatorid+",'"+mobileno+"',"+(planid.isEmpty()?null:planid)+","+amount+")");
					return true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return false;
	}
	@Override
	public void delete_user(int User_Id) {
	     
			try {
				 Statement state=con.createStatement();
				 state.executeUpdate("delete from cust where User_Id="+User_Id);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
	@Override
	public List<Operator> retrive(String PlanName) {

		List<Operator> lstop=new ArrayList<Operator>();
		try {
			PreparedStatement pstate=con.prepareStatement("Select id,PlanName,company,pExpiry,price from operators where PlanName=?");
			pstate.setString(1, PlanName);

			rs=pstate.executeQuery();

			if(rs.next())
			{
				Operator op=new Operator(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
				lstop.add(op);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstop;
	}
	@Override
	public int Updatepass(String User_pass,String User_Email) {
		try {
			PreparedStatement pstate=con.prepareStatement("update cust set User_pass=? where user_email=? ");
			pstate.setString(1,User_pass);
			pstate.setString(2,User_Email);
		
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
}
}