package Assignment7;

class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees= 12000;
	protected double feesPerMonth;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String fname, String lname) {
		studentName = fname + " " + lname;
	}
	public void calculateFees()
	{
		feesPerMonth = semesterFees / 6.0;
	}
	public void displayDetail()
	{
		System.out.println(feesPerMonth);
	}	
	
}

final class DayScholar extends Student
{
	private String residentialAddress;
	
	/*
	 * public DayScholar() {
	 * 
	 * } public DayScholar(int stdId, char stdType, String stdName, double fees,
	 * String resAddr) {
	 * 
	 * }
	 */
	
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public void displayDayScholarDetails()
	{
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
		System.out.println("Fees Per Month: " + feesPerMonth);
		System.out.println("Res Address : " + residentialAddress);
	}
}

public class CourseReg {

	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar();
		dayscholar.setStudentId(11);
		dayscholar.setStudentType('D');
		dayscholar.setStudentName("Rahil", "Hasnani");
		dayscholar.setResidentialAddress("3011 SugarLand");
		dayscholar.calculateFees();
		dayscholar.displayDayScholarDetails();
	}
}







