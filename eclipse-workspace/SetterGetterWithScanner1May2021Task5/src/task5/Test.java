package task5;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Rollno");
		int a = sc.nextInt();
		System.out.println("enter Name");
		String str = sc.next();
		
		Student s = new Student();
		s.setRollno(1);
		
		Student s1 = new Student();
		s1.setName("xyz");
		
		System.out.println(s.getRollno());
		System.out.println(s1.getName());
	}

}
