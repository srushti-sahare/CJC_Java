public class A 
{
	int x;
	
	public static void main(String args[])
	{
		A a = new A();
		a.x=100;
		System.out.println(a.x);
		
		
		B b = new B();
		b.m2(a);
		System.out.println(a.x);
		
	}
}
