public class A 
{
	public static void main(String args[])
	{
		int x=103;
		
		if(x==0)
		{
			System.out.println("not valid age");
		}
		else if(x>=18 && x<40)
		{
			System.out.println("Young");
		}
		else if(x>=40 && x<100)
		{
			System.out.println("Old");
		}
		else
		{
			System.out.println("invalid age problem");
		}
	}
}
