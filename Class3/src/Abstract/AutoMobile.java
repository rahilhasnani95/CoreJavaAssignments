package Abstract;

abstract class AutoMobile{

	public AutoMobile() {
		System.out.println("Hi");
	}
	public abstract void displayName();
	public abstract AutoMobile createAutoMobile();
	
	public static void main(String[] args) {
		AutoMobile a = new Car();
		a.displayName();
		a.createAutoMobile();
	}
	
}

class Bike extends AutoMobile{

	public void displayName() {
		System.out.println("Bike");
	}
	public AutoMobile createAutoMobile() {
		return new Bike();
	}
}

class Car extends AutoMobile{

	public void displayName() {
		System.out.println("Car");		
	}
	public AutoMobile createAutoMobile() {
		return new Car();
	}
}
 