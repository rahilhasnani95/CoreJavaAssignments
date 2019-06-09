package Assignment1;

public class Student {

	private int studentId;
	private char studentType;
	private String studentName;
	private static int studentCount ; 
	
	static
	{
		studentCount = 10;
	}
	public Student()
	{
		studentId = ++studentCount;
		//this.studentId = this.studentId + 1;
	}
	
	public Student(char sType, String fName, String lName)
	{
		this();
		studentType = sType;
		studentName = fName + " " + lName; 
	}
	
	
	//public static int getStudentCount()
	//{
		//return studentCount;
	//}
	
	public void displayDetails(Student std)
	{
		System.out.println("Student Id : " + std.studentId);
		System.out.println("Student Type : " + std.studentType);
		System.out.println("Student Name : " + std.studentName);
	}
	
	public static void main(String[] args) {
		Student std1 = new Student('D', "Bony", "Thomas");
		std1.displayDetails(std1);		
		Student std2 = new Student('E', "Roy", "Keane");
		std2.displayDetails(std2);
		Student std3 = new Student('D', "Rahil", "Hasnani");
		std3.displayDetails(std3);
	}
	
}

