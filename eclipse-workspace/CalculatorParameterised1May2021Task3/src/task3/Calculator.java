package task3;
import java.util.Scanner;

public class Calculator {
	
	 Scanner sc = new Scanner(System.in);
				
	public void add(int a,int b)
	{
	                System.out.println("Perform Addition");
					System.out.println("enter first no");
					 a = sc.nextInt();
					
					System.out.println("enter second no");
					 b = sc.nextInt();
					
					int c= a+b;
					System.out.println("Addition is   "+c);
					
					
				}
				
				public void sub(int a,int b)
				{ 
					System.out.println("Perform Subtraction");
					System.out.println("enter first no");
					a = sc.nextInt();
					
					System.out.println("enter second no");
					 b = sc.nextInt();
					
					int c= a-b;
					System.out.println("Subtraction is   "+c);
					
					
					
				}
				
				public void mul(int a,int b)
				{
					System.out.println("Perform Multiplication");
					System.out.println("enter first no");
					a = sc.nextInt();
					
					System.out.println("enter second no");
					 b = sc.nextInt();
					
					int c= a*b;
					System.out.println("Multiplication is   "+c);
					
					
					
				}
				
				public void div(int a,int b)
				{
					System.out.println("Perform Division");
					System.out.println("enter first no");
					a = sc.nextInt();
					
					System.out.println("enter second no");
					b = sc.nextInt();
					
					int c= a/b;
					System.out.println("Division is  "+c);
					
					
				}
				

			}









