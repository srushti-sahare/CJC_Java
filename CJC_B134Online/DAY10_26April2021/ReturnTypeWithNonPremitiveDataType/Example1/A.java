public class A 
{
	public A m1()
	{
		A a = new A();
		return a;
	}
    
	public static void main(String args[])
	{
		A a = new A();
        
        A a1 = a.m1();
        
        System.out.println(a);  
        System.out.println(a1);	
	}
}
	
