public class A 
{
	public static void main(String args[])
	{
		int i;
		i=1;
		int evencount=0;
		int oddcount=0;
		
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println("even no is  " +i);
				evencount++;
			}
			else
			{
				System.out.println("odd no is   " +i);
				oddcount++;
			}
			i++;
		}
		System.out.println("even count is   " +evencount);
		System.out.println("odd count is    " +oddcount);
	}
}
