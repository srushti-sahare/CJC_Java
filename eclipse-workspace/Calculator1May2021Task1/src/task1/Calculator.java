package task1;
import java.util.Scanner;

public class Calculator {
	
	  Scanner sc = new Scanner(System.in);
		
		public void add()
		{
			System.out.println("Perform Addition");
			System.out.println("enter first no");
			int a = sc.nextInt();
			
			System.out.println("enter second no");
			int b = sc.nextInt();
			
			int c= a+b;
			System.out.println("Addition is   " +c);
		}
		
		public void sub()
		{ 
			System.out.println("Perform Subtraction");
			System.out.println("enter first no");
			int a = sc.nextInt();
			
			System.out.println("enter second no");
			int b = sc.nextInt();
			
			int c= a-b;
			System.out.println("Subtraction is   " +c);
		}
		
		public void mul()
		{
			System.out.println("Perform Multiplication");
			System.out.println("enter first no");
			int a = sc.nextInt();
			
			System.out.println("enter second no");
			int b = sc.nextInt();
			
			int c= a*b;
			System.out.println("Multiplication is   " +c);
		}
		
		public void div()
		{
			System.out.println("Perform Division");
			System.out.println("enter first no");
			int a = sc.nextInt();
			
			System.out.println("enter second no");
			int b = sc.nextInt();
			
			int c= a/b;
			System.out.println("Division is   " +c);
		}
		public static void main(String[] args) {
			
			Calculator c = new Calculator();
			c.add();
			c.sub();
			c.mul();
			c.div();
		}

	}



