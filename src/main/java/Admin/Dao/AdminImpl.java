package Admin.Dao;

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
import Bank.Model.AdminLogin;
import Bank.Model.Operator;
import Bank.Model.payment;



public class AdminImpl implements AdimInterface {
  Connection con=DbConnection.getConnection();
  ResultSet rs;
  int i;
	@Override
	public int create(List<Admin> lsta) {

		Iterator<Admin> ia= lsta.iterator();
		while(ia.hasNext())
		{
			Admin admin=ia.next();  // Admin entity
			try {
				PreparedStatement pstate=con.prepareStatement("insert into admin values(?,?,?,?,?)");
				pstate.setInt(1,admin.getAdmin_Id() );
				pstate.setString(2, admin.getAdmin_Name());
				pstate.setString(3, admin.getAdmin_Uname());
				pstate.setString(4, admin.getAdmin_Email());
				pstate.setString(5, admin.getAdmin_pass());
				
				i=pstate.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
	
	public int createPlan(List<Operator> lsta) {

		Iterator<Operator> ia= lsta.iterator();
		while(ia.hasNext())
		{
			Operator ope=ia.next();  // Admin entity
			try {
				PreparedStatement pstate=con.prepareStatement("insert into Operators values(?,?,?,?,?)");
				pstate.setInt(1,ope.getId() );
				pstate.setString(2, ope.getPlanName());
				pstate.setString(3, ope.getCompany());
				pstate.setString(4, ope.getpExpiry());
				pstate.setString(5, ope.getPrice());
				
				i=pstate.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
	}
	
	@Override
	public List<Admin> displayall() {
		List<Admin> lstad=new ArrayList<Admin>();
		String str="select * from admin";
		try {
			Statement state=con.createStatement();
			rs=state.executeQuery(str);
			while(rs.next())
			{  Admin admin=new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
			lstad.add(admin);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lstad;
	}
	@Override
	public String Login(AdminLogin al) {
		String str=null;
		List<Admin> lstal=null;
		lstal=displayall();
		for(Admin ai:lstal)
		{
			if(ai.getAdmin_Email().equals(al.getAdmin_Email())) {
				if(ai.getAdmin_pass().equals(al.getAdmin_pass())) {
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
	@Override
	public boolean insert_operator(String operator, String company) {
		
			boolean flag = true;
			try
			{
				Statement stmt = con.createStatement();
				rs = stmt.executeQuery("select operator_name from operator_details");
				while(rs.next())
				{
					if(rs.getString(1).equalsIgnoreCase(operator))
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					int i=stmt.executeUpdate("insert into operator_details (op_name,company) values('"+operator+"','"+company+"')");
					if(i==1)
						return true;
				}
				else
					return false;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			return false;
		
	}

	@Override
	public List<Operator> display() {
		List<Operator> lstreg=new ArrayList<Operator>();
		String str="Select * from Operators";
		try {
			Statement state=con.createStatement();
			rs=state.executeQuery(str);
			//			ResultSetMetaData rsmd=rs.getMetaData();
			//			
			//			for(int i=1;i<rsmd.getColumnCount();i++)
			//			{
			//				System.out.print(rsmd.getColumnName(i)+"\t");
			//			}
			while(rs.next())
			{ Operator reg=new Operator(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));

			lstreg.add(reg);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstreg;

	}

	@Override
	public int Update(String PlanName, String pExpiry, String price, int id) {
		try {
			PreparedStatement pstate=con.prepareStatement("update operators set PLANNAME=?,  PEXPIRY=?, PRICE=? where ID=? ");
			pstate.setString(1,PlanName);
			pstate.setString(2,pExpiry);
			pstate.setString(3,price);
			pstate.setInt(4, id);
			
			

			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

	@Override
	public int delete(int id) {
		try {
			PreparedStatement pstate=con.prepareStatement("delete from operators where ID=(?)");
			pstate.setInt(1, id);

			i=pstate.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	@Override
	public int paymentus(payment pi) {
		int i=0;
		List<Operator> lstop=null;
		lstop=display();
		for(Operator op : lstop)
		{
			try {
				if(op.getPrice().equals(pi.getAmount())) {
					PreparedStatement pstate=con.prepareStatement("insert into payment values(?,?,?,?,?,?,?,?)");
					pstate.setString(1,pi.getName() );
					pstate.setString(2, pi.getEmail());
					pstate.setString(3, pi.getDob());
					pstate.setString(4, pi.getGender());
					pstate.setString(7, pi.getPayMentmod());
					pstate.setString(5, pi.getBankName());
					pstate.setString(6, pi.getAmount());
					pstate.setString(8, pi.getDate());
					 i=pstate.executeUpdate();
						i=1;
						break;
					}
					else
					{
						i=0;
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		
		return i;
	}
	
}
