public class A 
{
	public static void main(String args[])
	{
		int i;
		i=2;
		int evencount=0;
		int oddcount=0;
		
		while(i<=50)
		{
			if(i%2==0)
			{
				
				evencount++;
			}
			else
			{
				
				oddcount++;
			}
			i++;
		}
		System.out.println("even count is   " +evencount);
		System.out.println("odd count is    " +oddcount);
	}
}
