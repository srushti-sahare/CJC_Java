package example3;

public class B extends A {
	
	public B()
	{
		System.out.println("constructor----B---Default");
	}
	
	public B(int i)
	{
		
		System.out.println("constructor----B---Int");
	}
	
	public B(String s)
	{
		super("abc");
		System.out.println("constructor----B---String");
	}

}
