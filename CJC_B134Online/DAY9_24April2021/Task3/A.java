public class A 
{
	public static void main(String args[])
	{
		int count=0;
		int x=4374;
		
		while(x!=0)
		{
			x/= 10;
			++count;
		}
		System.out.println("no of digits  " +count);
	}
}
