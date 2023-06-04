package Bank.Model;

public class User {
	
	private int User_Id;
    private String User_Name;
    private String User_Mob;
    private String User_Uname;
    private String User_Email;
    private String User_pass;
    
    // CONSTRUCTER
    
	public User(int user_Id, String user_Name, String user_Mob, String user_Uname, String user_Email,
			String user_pass) {
		super();
		User_Id = user_Id;
		User_Name = user_Name;
		User_Mob = user_Mob;
		User_Uname = user_Uname;
		User_Email = user_Email;
		User_pass = user_pass;
	}

	public int getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getUser_Mob() {
		return User_Mob;
	}

	public void setUser_Mob(String user_Mob) {
		User_Mob = user_Mob;
	}

	public String getUser_Uname() {
		return User_Uname;
	}

	public void setUser_Uname(String user_Uname) {
		User_Uname = user_Uname;
	}

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
