package user.Dao;

import java.util.List;

import Bank.Model.Contact;
import Bank.Model.User;


public interface Contactinterface {
	
	public int create(List<Contact> lstus);
	public List<Contact>  displayall();

}
