package Interface;

public class TestInterfaceClass {

	public static void main(String[] args) {
	
			Policies p = new Ashi();
			p.displayPolicy();		
	}

}

interface Policies {

	void displayPolicy();
}	
 
class Ashi implements Policies
{
	 public void displayPolicy() {
		System.out.println("Anti Harrassment Policy");
	}
	 
}
