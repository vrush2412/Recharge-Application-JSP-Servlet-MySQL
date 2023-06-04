package Bank.Model;

public class Operator {
    private int id;
    private String PlanName;
    private String company;
    private String pExpiry;
    private String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getpExpiry() {
		return pExpiry;
	}
	public void setpExpiry(String pExpiry) {
		this.pExpiry = pExpiry;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Operator(int id, String planName, String company, String pExpiry, String price) {
		super();
		this.id = id;
		PlanName = planName;
		this.company = company;
		this.pExpiry = pExpiry;
		this.price = price;
	}
	
    
}