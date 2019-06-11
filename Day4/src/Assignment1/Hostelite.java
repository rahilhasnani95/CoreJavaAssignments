package Assignment1;

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
	
	public String getHostelName() {
		return hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}

	
	public static void main(String[] args) {
	
		Hostelite hostelite = new Hostelite(10, 'M', "Rahil", "Hasnani", 1200, "IMCS Hostel", 860);
		System.out.println("Student Id : " + hostelite.getStudentId() +  "\nStudent Type : " + hostelite.getStudentType() + "\nStudent Name :  " + hostelite.getStudentName() + "\nFees Per Month: " + hostelite.getFeesPerMonth() + "\nHostel Name : " + hostelite.getHostelName() + "\nRoom Number: " + hostelite.getRoomNumber());
		

	}
	
}
