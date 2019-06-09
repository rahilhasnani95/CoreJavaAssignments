package Assignment4;

public class CourseManagement {

	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.setStudentId(100);
		stu.setStudentType('F');
		
		System.out.println("student id is  " + stu.getStudentId() + " and student type is " + stu.getStudentType());
		
	}

}
