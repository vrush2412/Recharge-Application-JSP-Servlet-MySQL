package Bank.Model;

public class Recharge {
	
	private String Mobile_No;
	private String operator;
	private String state;
	public Recharge(String mobile_No, String operator, String state) {
		super();
		Mobile_No = mobile_No;
		this.operator = operator;
		this.state = state;
	}
	public String getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
