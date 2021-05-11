public class B 
{
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		System.out.println("Main---Start");
		
		B b = new B();
		int s = b.sum(100,200);
		
		System.out.println(s);
		System.out.println("Main--End");
	}
}
