package task4;

public class A2 {
	
	public String m1()
	{
		return "classes";
	}
    
	public Object m2()
	{
		return "CJC";
	}
	
	public int m3()
	{
		return 10;
	}
	
	public double m4()
	{
		return 10d;
	}
	public byte m5()
	{
		return 25;
		
	}
	public static void main(String[] args) {
		
		A2 a = new A2();
		String s=(String)a.m1();//true
		Object o = a.m1();//true
		//double d = (double)a.m1();//cannot cast from String(nonpremitive) to double(premitive)
	    //String s1 = (int)a.m2();//type mismatch 
		String s2 = (String)a.m2();
		
		long l =a.m3();//true
		//byte b = a.m3();//type mismatch cannot convert int to byte
		short s3 = (short)a.m3();//true
		
		double d1 = a.m4();
		//String s4 =(String)a.m4();//cannot cast from double to string
		byte b1 =a.m5();
		int i=a.m5();
	}
	
}
