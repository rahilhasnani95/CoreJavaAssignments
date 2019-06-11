package Assignment5;

public class CourseReg
{
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(5, "OOPS", 16000, 1001, 'D', "Manu", "No 32/3 VijayNagar");
		dayscholar.calculateFees();
		dayscholar.displayDetails();
		
		DayScholar dayscholar2 = new DayScholar(6, "Java", 12000, 1002, 'R', "Rahil", "No 32/3 Sugar land");
dayscholar2.calculateFees();
dayscholar.displayDetails();
	}
}

class Student {

	protected static int studentId;
	protected char studentType;
	protected String studentName;
	
	public Student()
	{
		studentId++;
	}
	public Student(int stdId, char stdType, String stdName)
	{
		this();
		//studentId = stdId;
		studentType = stdType;
		studentName = stdName;
	}
}

class PostGradStudent extends Student
{
	protected int postCourseId;
	protected String postCourseName;
	protected int postCourseFees;
	
	public PostGradStudent(int postCId, String postCName, int postCFees, int stdId, char stdType, String stdName)
	{
		super(stdId, stdType, stdName);
		postCourseId = postCId;
		postCourseName = postCName;
		postCourseFees = postCFees;
	}

	public int getPostCourseId() {
		return postCourseId;
	}
	public String getPostCourseName() {
		return postCourseName;
	}
	public int getPostCourseFees() {
		return postCourseFees;
	}	
}

class DayScholar extends PostGradStudent
{
	private String residentialAddress;
	private int fees;
	public DayScholar(int postCId, String postCName, int postCFees, int stdId, char stdType, String stdName, String resAddr)
	{
		super(postCId, postCName, postCFees, stdId, stdType, stdName);
		residentialAddress = resAddr;
	}
	public void calculateFees()
	{
		fees = postCourseFees/6;
	}
	public int getFees()
	{
		return fees;
	}
	public void displayDetails()
	{
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
		System.out.println("Post course Id: " +postCourseId);
		System.out.println("Pos Course Fees : " +postCourseFees);
		System.out.println("Post Course Name ; " +postCourseName);
		System.out.println("Fees Per Month: " + getFees());
		System.out.println("Res Address : " + residentialAddress);		
	}
	
}

