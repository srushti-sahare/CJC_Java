public class A 
{
	public int m1()
	{
		System.out.println("M1--A");
		return 10;
	}
	public static void main(String args[])
	{
		System.out.println("Main--Start");
		 A a = new A();
		 int x=a.m1();
		 
		 
		 System.out.println(x);
		 System.out.println("Main--End");
	}
}
