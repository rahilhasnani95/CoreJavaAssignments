package SelfReview;

public class StaticDemo {

	static int count = 10;
	
	StaticDemo()
	{
		count++;
	}
	static void display()
	{
		System.out.println(count);
	}
	
	static
	{
		System.out.println("Static Block written Before Main");
	}
	
	public static void main(String[] args) {

		StaticDemo d1 = new StaticDemo();
		StaticDemo d2 = new StaticDemo();
		
		StaticDemo.display();
		d2.display();
	}
	static
	{
		System.out.println("Static Block written After Main");
	}

}
