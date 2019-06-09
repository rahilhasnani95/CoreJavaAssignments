package SelfReview;

public class SwitchCase {

	public static void main(String[] args) {

		String comment;
		int val = (int) (4*3);
		
		switch(val) 
		{
		
		case 0: comment = "Case 0";
				break;
		case 1: comment = "Case 1";
				break;
		
		case 12: comment = "Case 12";
		default: comment = "Oops -- something is wrong";
		//break;
		case 14 : comment = "Case 14";
		break;
		
		
		}
		
		System.out.println(comment);		
		
	}

}
