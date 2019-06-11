package SelfReview;

public class CourseManagement {	
	public static void main(String[] args) {
		Child child;
		child = new Child();
		child.setNum(100);
		child.setVal(200);
		child.display();
	}
}

class Parent
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
		System.out.println("Number : " + num);
	}	
}

class Child extends Parent
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
		System.out.println("Number : " + num);
		System.out.println("Value : " + val);
	}
}