package scExample1;
import java.util.Scanner;

public class A {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void add()
	{
		System.out.println("enter first no");
		int a = sc.nextInt();
		
		System.out.println("enter second no");
		int b = sc.nextInt();
		
		int c= a+b;
		System.out.println("Addition is   " +c);
	}
	public static void main(String[] args) {
		
		A a = new A();
		a.add();
	}

}
