
public class Employee {

	String type;
	public Employee()
	{
		System.out.println("Employee default const");
	}
	public Employee(int x)
	{
		System.out.println("Employee param const");
	}	
	
}
class Educator extends Employee{

	public Educator()
	{
		System.out.println("Educator default constructor");
	}
	public Educator(int y) {
		//super(9);
		System.out.println("Educator param constructor");
	}
}

 class MyPractise{
	public static void main(String[] args) {
		Educator edu = new Educator();
		
	}
}



