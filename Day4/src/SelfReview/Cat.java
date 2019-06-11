package SelfReview;

class Animal {
	public static void testClassMethod()
	{
		System.out.println("The class method is Animal");
	}
	public void testInstanceMethod()
	{
		System.out.println("The instance method in animal");
	}
}

class Cat extends Animal
{
	public static void testClassMethod()
	{
		System.out.println("The class method is Cat");
	}
	public void testInstanceMethod()
	{
		System.out.println("The instance method in Cat");
	}
	
	public static void main(String[] args) {
		Cat mycat = new Cat();
		Animal myanimal = mycat;
		
//testClassMethod();
		
	//	System.out.println();
		//Cat.testClassMethod();
		Animal.testClassMethod();
		myanimal.testInstanceMethod();
		
		//myanimal.testClassMethod();
		
	//	mycat.testInstanceMethod();
		//mycat.testClassMethod();
	}
}


