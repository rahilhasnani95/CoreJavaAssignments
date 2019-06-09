package Assignment7;

public class PassByVal {

	public static void main(String[] args) {
		
		int sId = 25;
		PassByVal val = new PassByVal();
		System.out.println(sId);
		
		//val.passTheValueMethod(sId);
		Assignment4.Student std = new Assignment4.Student();
		val.passTheValueMethod(std);
		System.out.println("The sId are : " + sId);
	}
	
	public void passTheValueMethod(Assignment4.Student st) {
		
		st.setStudentId(99);
		System.out.println("Stud id is  " + st.getStudentId());
		//sId = 10;
		//System.out.println("The sId are " + sId);
	}
	

}
