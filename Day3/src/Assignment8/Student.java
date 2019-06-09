package Assignment8;
import java.util.Scanner;

public class Student {

		private int studentId;
		private char studentType;
		private String studentName;
		private String residentialStatus;
		private double feesPerMonth;
		
		public Student() {
			studentId = 10;
		}
		public Student(int id, char type, String fname, String lname) {
			studentId = id;
			studentType = type;
			studentName = fname + " " + lname;
		}
		
		public static void main(String[] args) {
			Student student = new Student(1, 'F', "Rahil", "Hasnani");
			student.setResidentialStatus("Day Scholar");
			
			if(student.getResidentialStatus().equals("Day Scholar"))
			{
				student.calculateFees(1200);
				System.out.println("Student Id : " + student.getStudentId() + "\nStudent Name :  " + student.getStudentName() + "\nResidential Status: " + student.getResidentialStatus() + "\nFees Per Month: " + student.getFeesPerMonth());
			}
			else
			{
				student.calculateFees(1200, 500);
				System.out.println("Student Id : " + student.getStudentId() + "\nStudent Name :  " + student.getStudentName() + "\nResidential Status: " + student.getResidentialStatus() + "\nFees per Month : " + student.getFeesPerMonth() + "\n of which Hostel Fees : 500 ");
			}	
			
		}
		
		public void calculateFees(double semesterFees)
		{
			feesPerMonth = semesterFees / 6.0;
		}
		public void calculateFees(double semesterFees, double hostelFees)
		{
			feesPerMonth = semesterFees / 6.0;
			feesPerMonth = feesPerMonth + hostelFees;
		}
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String fname, String lname) {
			studentName = fname + " " + lname ;
		}
		public String getResidentialStatus() {
			return residentialStatus;
		}
		public void setResidentialStatus(String residentialStatus) {
			this.residentialStatus = residentialStatus;
		}
		public double getFeesPerMonth() {
			return feesPerMonth;
		}
		//public void setFeesPerMonth(double semesterfees, double hostelfees) {
			//feesPerMonth = semesterfees + hostelfees;
		//}
		public char getStudentType() {
			return studentType;
		}
		public void setStudentType(char studentType) {
			this.studentType = studentType;
		}
		
		
		
		
		
		
	}


