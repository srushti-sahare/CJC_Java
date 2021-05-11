public class A 
{
	public static void main(String args[])
	{
		int x=13;
		int count=0;
		int i;
		
		for(i=2;i<=x-1;i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("It is not a prime number ");
		}
		else
		{
			System.out.println("It is a prime number");
		}
	}
}
