package task1;

public class Student {
	
	int x=100;
	static int y=900;
	
	static
	{
		System.out.println("static block");
	}
	public Student()
	{
		System.out.println("i m constructor");
	}
	public void m1()
	{
		System.out.println(x);
	}
	public static void m2()
	{
		System.out.println(y);
	}
}
