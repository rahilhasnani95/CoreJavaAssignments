package SelfReview;

public class CourseManagement2 {	
	public static void main(String[] args) {
		Childs child;
		child = new Childs();
		child.setNum(100);
		child.setVal(200);
		child.display();
	}
}

class Parents
{
	protected int num;
	public int getNum() {
		return num;
	}
	public void setNum(int val) {
		num = val;
	}
	public void display()
	{
		System.out.println("Number: " + num);
	}	
}

class Childs extends Parents
{
	private int val;
	public int getVal() {
		return val;
	}
	public void setVal(int num) {
		val = num;
	}
	public void display()
	{
		//super.display();
		System.out.println("Number: " + num);
		System.out.println("Value : " + val);
	}
}