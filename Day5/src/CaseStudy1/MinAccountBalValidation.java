package CaseStudy1;

class Account
{
	private int accAmount;
	private int accNo;
	private String custName;
	public int getAccAmount() {
		return accAmount;
	}
	public void setAccAmount(int accAmount) {
		this.accAmount = accAmount;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}	
}

public class MinAccountBalValidation {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccAmount(5000);

		if(account.getAccAmount() < 500)
		{
			System.out.println("The balance is below minimum level");
		}
		else
		{
			System.out.println(account.getAccAmount());
		}
	}

}
