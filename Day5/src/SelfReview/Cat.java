package SelfReview;

abstract class Animal
{
	abstract void testClassMethod();
	

	public void testInstanceMethod()
	{
		System.out.println("The instance method in Animal");
	}
}

class Cat extends Animal {
	public void testClassMethod()
	{
		System.out.println("The class method in Cat");
	}
	public void testInstanceMethod()
	{
		System.out.println("The instance method in Cat");
	}

	public static void main(String[] args) {
		Cat mycat = new Cat();
		Animal myanimal = mycat;
		
//		Animal.testClassMethod();
		myanimal.testInstanceMethod();
		myanimal.testClassMethod();
		
		mycat.testInstanceMethod();
		mycat.testClassMethod();
		
	}
}




