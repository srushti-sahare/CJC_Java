public class A 
{
	public static void main(String args[])
	{
		int i;
		
		int evencount=0;
		int oddcount=0;
		
		for(i=2;i<=50;i++)
		{
			if(i%2==0)
			{
				
				evencount++;
			}
			else
			{
				
				oddcount++;
			}
			
		}
		System.out.println("even count is   " +evencount);
		System.out.println("odd count is    " +oddcount);
	}
}
