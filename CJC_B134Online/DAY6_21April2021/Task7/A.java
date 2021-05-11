public class A 
{
	public static void main(String args[])
	{
		int a=600;
		int b= 500;
		int c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater than a and c");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater than a and b");
		}
		else
		{
			System.out.println("either two or three numbers are equal");
		}
	}
}
