package Assignment4b;

public class CourseReg {
	
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(1001, 'D', "Eugene", 12000, "No 32/68 Vijaynagar", "OOPS");
		dayscholar.displayDetails();
		
		DayScholar dayscholar2 = new DayScholar(1002, 'D', "Rahil", 10000, "3011 /68 Sugar Land", "OOPS");
		
		dayscholar2.displayDetails();
	}
}

class CourseRegistration{
	static protected int regId;
	protected String courseName;
	
	CourseRegistration() {
		regId++;
	}
	CourseRegistration(String cName)
	{
		this();
		courseName = cName;
	}
	public void displayDetails()
	{
		System.out.println("Registration ID : " + regId );
		System.out.println("Course Name : " + courseName);
		
	}
}

class Student extends CourseRegistration{

	protected int studentId;
	protected char studentType;
	protected String studentName;
	private int semesterFees;
	private int feesPerMonth;
	
	Student(int studentId, String cName)
	{
		super(cName);
		this.studentId = studentId;
	}
	Student(int stdId, char stdType, String stdName, int semFees, String cName)
	{
		this(stdId, cName);
		studentType = stdType;
		studentName = stdName;
		semesterFees = semFees;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Student Id: " + this.studentId + " Student Type : " + this.studentType + " Student Name:  " + this.studentName + "  Sem Fees : " + this.semesterFees);
	}
}

	class DayScholar extends Student
	{
		private String residentailAddress;
		DayScholar(int stdId, char stdType, String stdName, int semFees, String resAddr, String cName)
		{
			super(stdId, stdType, stdName, semFees, cName);
			residentailAddress = resAddr;
		}
		public void displayDetails()
		{	
			super.displayDetails();
			System.out.println(residentailAddress);
		}			
	}
