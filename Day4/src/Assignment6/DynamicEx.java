package Assignment6;

class Student
{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void getDetails()
	{
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Type : " + studentType);
	}
}

class DayScholar extends Student{
	private String residentialAddress;

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public void getDetails()
	{
		super.getDetails();
		System.out.println("Student Name : " + studentName);
		System.out.println("Residential Address : " + residentialAddress);
	}
}

class DynamicEx {
	public static void main(String[] args) {
	
		Student dayScholar = new DayScholar();
		// 	DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		
		//dayScholar.setResidentialAddress("33011 Sugarland");
		dayScholar.getDetails();
		
	}
}
