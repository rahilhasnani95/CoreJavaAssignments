package registrationpack;
import studentpack.*;

class DayScholar extends Student
{
	private String residentialAddress;

	public void setResidentialAddress(String resAddress) {
		residentialAddress = resAddress;
	}
	public void getDetails()
	{
		System.out.println("Student Id: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name : " + studentName);
	}
}

class Registration {
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar();
		dayscholar.setStudentId(1001);
		dayscholar.setStudentType('D');
		dayscholar.setStudentName("Thomas");
		dayscholar.getDetails();
			
	}
	
}
