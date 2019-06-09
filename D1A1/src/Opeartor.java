
public class Opeartor {

	public static void main(String[] args) {

		int intVal = 10;
		float  floatVal = 3.0f;
		boolean bool1 = false;
		boolean bool2 = true;
		boolean bool3 = true;
		
		System.out.println("Arithmetic ");
		System.out.println(intVal + " % " + floatVal + " = " + (intVal % floatVal));
		
		System.out.println();
		System.out.println("String Concatenation");
		
		System.out.println("Day " + 2 + " Session");
		System.out.println("\n" + 2 + 3 + "\n" + (2+3));
		System.out.println();
		
		System.out.println("Relational");
		System.out.println(intVal + " == " + floatVal + " = " + (intVal == floatVal));
		System.out.println();
		
		floatVal = 10.0f;
		System.out.println(intVal + " == " + floatVal + " = " + (intVal == floatVal));
		System.out.println();
		
		if(bool1 && (bool1 && (bool2 = false)))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failure");
		}
		System.out.println("bool2 value : " + bool2);
		
		
	}

}
