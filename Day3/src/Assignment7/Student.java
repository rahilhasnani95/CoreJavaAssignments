package Assignment7;

import java.util.Scanner;

public class Student {

		private int studentId;
		private String studentName;
		private String residentialStatus;
		private long feesPerMonth;
		
		public Student() {
			studentId = 10;
		}
		public Student(int id, char type, String fname, String lname) {
			studentId = id;
			studentName = fname + " " + lname;
		}
		
		public static void main(String[] args) {
			Student student = new Student();
			
			Scanner sc = new Scanner(System.in);			
			//System.out.println("Enter student Id");
			//student.setStudentId(sc.nextInt());
	
			//System.out.println("Enter first name");
			//String fname = sc.next();
			//System.out.println("Enter last name");
			//String lname = sc.next();
			//student.setStudentName(fname, lname);
			
			//System.out.println("Enter residential status");
			
			//student.setResidentialStatus(sc.next());
			
			//System.out.println("Enter semester fees");
			//long semfee = sc.nextLong();
			
			student.setStudentId(Integer.parseInt(args[0]));
			student.setStudentName(args[1], args[2]);
			student.setResidentialStatus(args[3]);
			
			if(student.getResidentialStatus().equals("Hostelite"))
			{
				student.setFeesPerMonth(Integer.parseInt(args[4]), 500);
				System.out.println("Student Id : " + student.getStudentId() + "\nStudent Name :  " + student.getStudentName() + "\nResidential Status: " + student.getResidentialStatus() + "\nTotal Fees : " + student.getFeesPerMonth() + "\n of which Hostel Fees : 500 " );

			}
			else
			{
				student.setFeesPerMonth(Integer.parseInt(args[4]), 0);	
				System.out.println("Student Id : " + student.getStudentId() + "\nStudent Name :  " + student.getStudentName() + "\nResidential Status: " + student.getResidentialStatus() + "\nTotal Fees : " + student.getFeesPerMonth());

			}
			
			
			
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
		public long getFeesPerMonth() {
			return feesPerMonth;
		}
		public void setFeesPerMonth(long semesterfees, long hostelfees) {
			feesPerMonth = semesterfees + hostelfees;
		}
		
		
		
		
		
		
	}


