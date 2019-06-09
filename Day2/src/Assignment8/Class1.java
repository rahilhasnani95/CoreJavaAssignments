package Assignment8;

public class Class1 {

	
	  int i = 22; int j = 14000; boolean k; boolean l;
	 
	
	public static void main(String[] args) {
		int i = 22;
		int j = 14000;
		Class1 class1 = new Class1();
	boolean k = class1.method1(i);
	boolean	l = class1.method2(j);
				
		
		if(k==true && l ==true)
		{
			System.out.println(" Is a new Employee");
		}
		else
		{
			System.out.println("Is not a new employee");
		}
	}
	
	public boolean method1(int i)
	{
		if(i>20 && i<30) return true;
		else return false;
	}

	public boolean method2(int j)
	{
		if(j>=14000 && j<20000) return true;
		else return false;
	}
	
	
	
}
