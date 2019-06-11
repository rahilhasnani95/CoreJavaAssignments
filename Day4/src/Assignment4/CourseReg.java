package Assignment4;

public class CourseReg {
	
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(1001, 'D', "Eugene", 12000, "No 32/68 Vijaynagar");
		dayscholar.displayDetails();
	}
}

class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	Student(int studentId)
	{
		this.studentId = studentId;
	}
	Student(int stdId, char stdType, String stdName, int semFees)
	{
		this(stdId);
		studentType = stdType;
		studentName = stdName;
		semesterFees = semFees;
	}
	void displayDetails()
	{
	System.out.println(this.studentId + " " + this.studentType + " " + this.studentName + " " + this.semesterFees);
	}
}

class DayScholar extends Student
{
	private String residentailAddress;
	DayScholar(int stdId, char stdType, String stdName, int semFees, String resAddr)
	{
		super(stdId, stdType, stdName, semFees);
		residentailAddress = resAddr;
	}
	void displayDetails()
	{
		super.displayDetails();
		System.out.println(this.residentailAddress);
	}
		
	
}

