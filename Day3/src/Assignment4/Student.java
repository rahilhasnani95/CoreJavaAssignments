package Assignment4;
public class Student {

		private int studentId;
		private char studentType;
		private String studentName;
		
		public Student() {
			studentId = 10;
			studentType = 'F';
		}
		public Student(int id, char type, String fname, String lname) {
			studentId = id;
			studentType = type;
			studentName = fname + " " + lname;
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
			studentName = fname + " " + lname ;
		}
		
		public static void main(String[] args) {
			Student student = new Student();
			System.out.println(student.getStudentId() + " " + student.getStudentType() + " " + student.getStudentName());
			
			Student student2 = new Student(99, 'R', "Rahil", "Hasnani");
			System.out.println(student2.getStudentId() + " " + student2.getStudentType() + " " + student2.getStudentName());
			
		}
		
		
		
		
		
		
	}


