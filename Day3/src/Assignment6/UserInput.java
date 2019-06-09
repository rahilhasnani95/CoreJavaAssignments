package Assignment6;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		int number ;
		int iteration;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter number");
		//number = sc.nextInt();
		//System.out.println("Enter iterations");
		
		number = Integer.parseInt(args[0]);
		
		iteration = Integer.parseInt(args[1]);
		
		for(int i = 1; i<= iteration; i++)
		{
			
			System.out.println(number + " * " + i + " = " + (number*i));
		}
	}
	
	
}
