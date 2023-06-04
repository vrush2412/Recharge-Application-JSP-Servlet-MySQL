
package Bank.Model;


public class Contact {
  
	
    private String Name;
    private String Email;
    private String Sub;
    private String Message;
    private String Date;
    
	public Contact(String name, String email, String sub, String message, String date) {
		super();
		Name = name;
		Email = email;
		Sub = sub;
		Message = message;
		Date = date;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSub() {
		return Sub;
	}

	public void setSub(String sub) {
		Sub = sub;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
    
    
}
