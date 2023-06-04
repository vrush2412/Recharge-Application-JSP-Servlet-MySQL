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
import Bank.Model.Contact;


public class ContactImp implements Contactinterface{
    Connection con=DbConnection.getConnection();
	@Override
	public int create(List<Contact> lstcon) {
			int i=0;
		 Iterator<Contact> us= lstcon.iterator();
			while(us.hasNext())
			{    
				Contact cont=us.next();  // Admin entity
				try {
					PreparedStatement pstate=con.prepareStatement("insert into contact values(?,?,?,?,?)");
					pstate.setString(1,cont.getName());
					pstate.setString(2,cont.getEmail());
					pstate.setString(3,cont.getSub() );
					pstate.setString(4,cont.getMessage());
					pstate.setString(5,cont.getDate());
					
					
					i=pstate.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			return i;
	}
	@Override
	public List<Contact> displayall() {
		List<Contact> lstcon=new ArrayList<Contact>();
		String str="select * from contact";
		try {
			Statement state=con.createStatement();
			ResultSet rs=state.executeQuery(str);
			while(rs.next())
			{ Contact cont=new Contact(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
			lstcon.add(cont);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstcon;
		
	}
	

}
