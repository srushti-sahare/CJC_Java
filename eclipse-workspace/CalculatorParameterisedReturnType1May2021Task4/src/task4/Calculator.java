package task4;
import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	
	public int add(int a,int b)
	{
	                System.out.println("Perform Addition");
					System.out.println("enter first no");
					 a = sc.nextInt();
					
					System.out.println("enter second no");
					 b = sc.nextInt();
					
					int c= a+b;
					return c;
					
					
				}
				
				public int sub(int a,int b)
				{ 
					System.out.println("Perform Subtraction");
					System.out.println("enter first no");
					a = sc.nextInt();
					
					System.out.println("enter second no");
					 b = sc.nextInt();
					
					int c= a-b;
					return c;
					
					
					
				}
				
				public int mul(int a,int b)
				{
					System.out.println("Perform Multiplication");
					System.out.println("enter first no");
					a = sc.nextInt();
					
					System.out.println("enter second no");
					 b = sc.nextInt();
					
					int c= a*b;
					return c;
					
					
					
				}
				
				public int div(int a,int b)
				{
					System.out.println("Perform Division");
					System.out.println("enter first no");
					a = sc.nextInt();
					
					System.out.println("enter second no");
					b = sc.nextInt();
					
					int c= a/b;
					return c;
					
					
				}
				

			}












