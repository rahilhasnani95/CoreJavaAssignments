package Assignment3;
public class Hostelite extends Student{

	private String hostelName;
	private int roomNumber;
	
	public Hostelite()
	{
		
	}
	public Hostelite(int id, char type, String fname, String lname, double feesPerMonth, String hostelName, int roomNumber) {
		super(id, type, fname, lname);
		super.setFeesPerMonth(feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	
	public void displayStudentDetails()
	{
		super.displayStudentDetails();
		System.out.println("Fees Per Month: " + getFeesPerMonth() + "\nHostel Name : " + getHostelName() + "\nRoom Number: " + getRoomNumber());
	
	}
	public String getHostelName() {
		return hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	
	
}
