package Assignment3;

public class DayScholar extends Student {

	private String residentialAddress;
	
	public DayScholar()
	{
		
	}
	public DayScholar(int id, char type, String fname, String lname, double feesPerMonth, String residentialAddress)
	{
		super(id, type, fname, lname);
		super.setFeesPerMonth(feesPerMonth);
		this.residentialAddress = residentialAddress;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	
	public void displayStudentDetails()
	{
		super.displayStudentDetails();
		System.out.println("Fees Per Month: " + getFeesPerMonth() + "\nResidential Address : " + getResidentialAddress());	
	}
	
}


