package Interface;

public interface Standards {

	String name = "hi";
 void displayStandards();

	
}

class Policy implements Standards{
	
	public void displayStandards() {
		System.out.println("Policy implements Standards");
	};
	
	public static void main(String[] args) {
		Standards s = new Policy();
		s.displayStandards();
	}
	
}

