public class A 
{
	public static void main(String args[])
	{
		int num=4374;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("total digit  " +count);
	}
}
