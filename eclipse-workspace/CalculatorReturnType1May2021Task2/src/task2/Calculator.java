package task2;
import java.util.Scanner;



	
	public class Calculator {
		
		   Scanner sc = new Scanner(System.in);
			
			public int add()
			{
				System.out.println("Perform Addition");
				System.out.println("enter first no");
				int a = sc.nextInt();
				
				System.out.println("enter second no");
				int b = sc.nextInt();
				
				int c= a+b;
				
				return c;
			}
			
			public int sub()
			{ 
				System.out.println("Perform Subtraction");
				System.out.println("enter first no");
				int a = sc.nextInt();
				
				System.out.println("enter second no");
				int b = sc.nextInt();
				
				int c= a-b;
				
				return c;
				
			}
			
			public int mul()
			{
				System.out.println("Perform Multiplication");
				System.out.println("enter first no");
				int a = sc.nextInt();
				
				System.out.println("enter second no");
				int b = sc.nextInt();
				
				int c= a*b;
				
				return c;
				
			}
			
			public int div()
			{
				System.out.println("Perform Division");
				System.out.println("enter first no");
				int a = sc.nextInt();
				
				System.out.println("enter second no");
				int b = sc.nextInt();
				
				int c= a/b;
				
				return c;
			}
			

		}






