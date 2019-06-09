package Assignment5;

import java.util.Scanner;

public class Called {
	
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name : ");
		 name = sc.nextLine();
	
		System.out.println(name);
		
		System.out.println(name.length());
		
		System.out.println("Hi " + name);
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.startsWith("a"));
		
		name = "Rahil";
		System.out.println(name);
		
	}
	
	
	
	
}
