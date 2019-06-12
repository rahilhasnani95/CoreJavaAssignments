package CaseStudy3;

import java.io.IOException;
import java.util.Scanner;

class BookingNumber
{
	private final int YYY = 115;
	private char X;
	private int NNN ;
	public static int ZZZZ ;
	
	BookingNumber()
	{
		++ZZZZ;
	}
	public char getX() {
		return X;
	}
	public void setX(char x) {
		X = x;
	}
	public int getNNN() {
		return NNN;
	}
	public void setNNN(int nNN) {
		NNN = nNN;
	}
	public static int getZZZZ() {
		return ZZZZ;
	}
	public static void setZZZZ(int zZZZ) {
		ZZZZ = zZZZ;
	}
	public int getYYY() {
		return YYY;
	}
	
}

public class AutoGenerate {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	String bookingNumber = "";
	System.out.println("Do Booking? Enter Y for Yes and N for No");
	char dobook = sc.next().charAt(0);
	
	while(dobook != 'N')
	{
		System.out.println("Enter Mode of Travel, F for Flight, T for Train, B for Bus: ");
		char mode = sc.next().charAt(0);
		//booking.setX(sc.next().charAt(0));
		if(mode == 'F')
		{
			BookingNumber booking = new BookingNumber();
			booking.setNNN(AutoGenerate.getRandomIntegerBetweenRange(101, 105));
			//String.format("%04d", booking.getZZZZ()); this is used to append 0 till 4 digits before the number
			
			bookingNumber = "" + booking.getYYY() + mode + booking.getNNN() + String.format("%04d", BookingNumber.getZZZZ());;
			System.out.println(bookingNumber);		
		}
		else if(mode == 'T')
		{
			BookingNumber booking = new BookingNumber();
			booking.setNNN(AutoGenerate.getRandomIntegerBetweenRange(201, 205));
			bookingNumber = "" + booking.getYYY() + mode + booking.getNNN() + String.format("%04d", BookingNumber.getZZZZ());
			System.out.println(bookingNumber);		
		}
		else if(mode == 'B')
		{
			BookingNumber booking = new BookingNumber();
			booking.setNNN(AutoGenerate.getRandomIntegerBetweenRange(301, 305));
			bookingNumber = "" + booking.getYYY() + mode + booking.getNNN() + String.format("%04d", BookingNumber.getZZZZ());
			System.out.println(bookingNumber);		
		}
		else
		{
			System.out.println("Wrong Input");
		}
		
		System.out.println("Do Booking? Enter Y for Yes and N for No");
		 dobook = sc.next().charAt(0);
		
	}
	System.out.println("goodBye");
	
	}

	
	public static int getRandomIntegerBetweenRange(double min, double max){
		int x = (int) ((Math.random()*((max-min)+1))+min);	
		return x;

	}	
	
}
