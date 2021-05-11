package com.cjc.karvenagar;
import com.cjc.add.Addition;
import com.cjc.sub.Subtraction;
import com.cjc.mul.Multiplication;
import com.cjc.div.Division;

public class Test 
{
	public static void main(String args[])
	{
		System.out.println("hello main");
		
		Addition a = new Addition();
		a.add();
		Subtraction s = new Subtraction();
		s.sub();
		
		Multiplication m = new Multiplication();
		m.mul();
		
		Division d = new Division();
		d.div();
	}
}
