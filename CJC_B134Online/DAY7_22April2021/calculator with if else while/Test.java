import java.util.Scanner;
public class Test 
{
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		System.out.println("----select----\n"+
		                    "1.Addition\n" +
							 "2.Subtraction\n"+
                    		 "3.Multiply\n"+
							  "4.Exit");
							 
							 
							 while(true)
							 {
								 Scanner sc = new Scanner(System.in);
								 int n = sc.nextInt();
								 
								 if(n==1)
								 {
									 int x=c.addition(100,200);
									 System.out.println("Addition---" +x);
								 }
								 else if(n==2)
								 {
									 int y=c.subtraction(300,100);
									 System.out.println("Subtraction---" +y);
								 }
								 else if(n==3)
								 {
									 int s=c.multiply(30,4);
									 System.out.println("Multiply---" +s);
								 }
								 else if(n==4)
								 {
									 break;
								 }
								 else
								 {
									 System.out.println("Wrong choice");
								 }
							 }
	}
}
