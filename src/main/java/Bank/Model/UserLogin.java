package Bank.Model;

public class UserLogin {
	private String User_Email;
	private String User_pass;

    // Constructor
	public UserLogin(String user_Email, String user_pass) {
		super();
		User_Email = user_Email;
		User_pass = user_pass;
	}
	// Getter Setter
	public String getUser_Email() {
		return User_Email;
	}
	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}
	public String getUser_pass() {
		return User_pass;
	}
	public void setUser_pass(String user_pass) {
		User_pass = user_pass;
	}



}
