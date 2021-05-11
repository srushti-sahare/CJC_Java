public class A 
{
	public static void main(String args[])
	{
		int i;
		int x=6;
		
		int sum=0;
		
		for(i=1;i<x;i++)
		{
			if(x%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==x)
		{
			System.out.println("It is a perfect no");
		}
		else
		{
			System.out.println("It is not a perfect no");
		}
	}
}
