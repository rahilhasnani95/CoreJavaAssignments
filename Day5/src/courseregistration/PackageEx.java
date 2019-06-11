package courseregistration;

class Student {

	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	public void setStudentId(int sId)
	{
		studentId = sId;
	}
	public void setStudentTye(char sType)
	{
		studentType = sType;
	}
	public void setStudentName(String sName)
	{
		studentName = sName;
	}
	public void getDetails() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Type : " + studentType);
		System.out.println("Student Name : " + studentName);	
	}
}

public class PackageEx {
	public static void main(String args[]) {
		Student student = new Student();
		student.setStudentId(1001);
		student.setStudentTye('D');
		student.setStudentName("Thomas");
		student.getDetails();
	}
}




