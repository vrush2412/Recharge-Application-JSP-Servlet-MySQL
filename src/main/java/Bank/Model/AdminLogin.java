package Bank.Model;

public class AdminLogin {
	  private String admin_Email;
	     private String admin_pass;
	     
		public AdminLogin(String admin_Email, String admin_pass) {
			super();
			this.admin_Email = admin_Email;
			this.admin_pass = admin_pass;
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
