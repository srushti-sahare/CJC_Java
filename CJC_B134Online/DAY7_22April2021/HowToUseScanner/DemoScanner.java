import java.util.Scanner;
public class DemoScanner
{
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
	public static void main(String args[])
	{
		DemoScanner dsc = new DemoScanner();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Perform Addition");
		 System.out.println("please enter value for a:");
		 int a = sc.nextInt();
		 
		 System.out.println("please enter value for b:");
		 int b = sc.nextInt();
		 
		int w = dsc.sum(a,b);
		System.out.println("Addition is" +w);
		
		System.out.println("Perform Subtraction");
		 System.out.println("please enter value for a:");
		 int a1 = sc.nextInt();
		 
		 System.out.println("please enter value for b:");
		 int b1 = sc.nextInt();
		 
		int x = dsc.sub(a1,b1);
		System.out.println("subtraction is" +x);
		
		System.out.println("Perform Multiplication");
		 System.out.println("please enter value for a:");
		 int a2 = sc.nextInt();
		 
		 System.out.println("please enter value for b:");
		 int b2 = sc.nextInt();
		 
		int y = dsc.mul(a2,b2);
		System.out.println("multiplication is" +y);
		
		System.out.println("Perform Division");
		 System.out.println("please enter value for a:");
		 int a3 = sc.nextInt();
		 
		 System.out.println("please enter value for b:");
		 int b3 = sc.nextInt();
		 
		int z = dsc.div(a3,b3);
		System.out.println("division is" +z);
	}
}

		
		