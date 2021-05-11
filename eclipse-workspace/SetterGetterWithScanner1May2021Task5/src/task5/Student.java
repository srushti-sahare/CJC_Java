package task5;
import java.util.Scanner;

public class Student {
	
	private int rollno;
	private String  name;
	
	Scanner sc = new Scanner(System.in);
	
	public void setRollno(int rollno)
	{
		this .rollno=rollno;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

}
