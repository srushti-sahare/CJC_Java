package example1;

public class B {

	public B()
	{
		this(2,3);
		System.out.println("constructor--B--default");
	}
	public B(int i)
	{
		this("abc");
		System.out.println("constructor--B--int");
	}
	public B(int i,int j)
	{
		this(6);
		System.out.println("constructor--B--double parameter---int");
	}
	public B(String s)
	{
		
		System.out.println("constructor--B--String");
	}
}
