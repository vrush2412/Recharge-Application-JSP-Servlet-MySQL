package Bank.Model;

public class forgotpass {
	String User_Email;
//	String User_Mob;
	String User_pass ;
	
	public forgotpass(String user_Email, String user_pass) {
		super();
		User_Email = user_Email;
//		User_Mob = user_Mob;
		User_pass = user_pass;
	}

	public String getUser_Email() {
	return User_Email;
	}

	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}
//
//	public String getUser_Mob() {
//		return User_Mob;
//	}
//
//	public void setUser_Mob(String user_Mob) {
//		User_Mob = user_Mob;
//	}

	public String getUser_pass() {
		return User_pass;
	}

	public void setUser_pass(String user_pass) {
		User_pass = user_pass;
	}

	
}
