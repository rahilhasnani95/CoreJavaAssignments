package Assignment3;


public class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected String residentialStatus;

	protected double feesPerMonth;
	
	public Student()
	{
		
	}
	public Student(int id, char type, String fname, String lname)
	{
		studentId = id;
		studentType = type;
		studentName = fname + " " + lname;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Student Id : " + getStudentId() +  "\nStudent Type : " + getStudentType() + "\nStudent Name :  " + getStudentName());
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setResidentialStatus(args[0]);
		
		if(student.getResidentialStatus().equals("Hostelite"))
		{
			student = new Hostelite(99, 'M', "Rahil", "Hasnani", 1000,"IMCS Hostel", 860);
			student.displayStudentDetails();
		}
		else
		{
			student = new DayScholar(100, 'M', "Rahil", "Hasnani", 1000,"Sugar land");
			student.displayStudentDetails();
		}	
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String fname, String lname) {
		studentName = fname + " " + lname;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	
	
}
