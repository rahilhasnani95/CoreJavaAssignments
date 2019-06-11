package SelfReview;

class Parent2
{
	private int num;
	Parent2(int num){
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
}

class Child2 extends Parent2
{
	private int val;	
	Child2(int num, int val)
	{
		super(num);
		this.val = val;
	}
	public int getVal()
	{
		return val;
	}
}

class CourseManagement4 {

	public static void main(String[] args) {
		Child2 child;
		child = new Child2(100,200);
		System.out.println("Parent: Num : " + child.getNum());
		System.out.println("Child: Val: " + child.getVal());
	}
}
