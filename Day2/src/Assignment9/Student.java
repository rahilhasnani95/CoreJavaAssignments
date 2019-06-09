package Assignment9;
public class Student {

	private static int studentId=550;
	private char studentType;
	private String studentName;
	
	
	public Student()
	{
		
		this.studentId = this.studentId + 1;
	}
	
	public Student(char sType, String fName, String lName)
	{
		this();
		studentType = sType;
		studentName = fName + " " + lName; 
	}
	
	public void displayDetails(Student std)
	{
		System.out.println("Student Id : " + studentId);
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
