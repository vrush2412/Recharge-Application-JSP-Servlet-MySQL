package Bank.Model;

public class Admin {

     private int admin_Id;
     private String admin_Name;
     private String admin_Uname;
     private String admin_Email;
     private String admin_pass;
     
     // CONSTRUCTER
     
	public Admin(int admin_Id, String admin_Name, String admin_Uname, String admin_Email, String admin_pass) {
		super();
		this.admin_Id = admin_Id;
		this.admin_Name = admin_Name;
		this.admin_Uname = admin_Uname;
		this.admin_Email = admin_Email;
		this.admin_pass = admin_pass;
	}

	//Getter Setter 
	public int getAdmin_Id() {
		return admin_Id;
	}

	public void setAdmin_Id(int admin_Id) {
		this.admin_Id = admin_Id;
	}

	public String getAdmin_Name() {
		return admin_Name;
	}

	public void setAdmin_Name(String admin_Name) {
		this.admin_Name = admin_Name;
	}

	public String getAdmin_Uname() {
		return admin_Uname;
	}

	public void setAdmin_Uname(String admin_Uname) {
		this.admin_Uname = admin_Uname;
	}

	public String getAdmin_Email() {
		return admin_Email;
	}

	public void setAdmin_Email(String admin_Email) {
		this.admin_Email = admin_Email;
	}

	public String getAdmin_pass() {
		return admin_pass;
	}

	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
     
    
     
     
}
