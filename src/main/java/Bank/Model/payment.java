package Bank.Model;

public class payment {
	
	private String Name;
	private String Email;
	private String Dob;
	private String Gender;
	private String PayMentmod;
	private String BankName;
	private String Amount;
	private String Date;
	public payment(String name, String email, String dob, String gender, String payMentmod, String bankName,
			String amount, String date) {
		super();
		Name = name;
		Email = email;
		Dob = dob;
		Gender = gender;
		PayMentmod = payMentmod;
		BankName = bankName;
		Amount = amount;
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
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPayMentmod() {
		return PayMentmod;
	}
	public void setPayMentmod(String payMentmod) {
		PayMentmod = payMentmod;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	

}
