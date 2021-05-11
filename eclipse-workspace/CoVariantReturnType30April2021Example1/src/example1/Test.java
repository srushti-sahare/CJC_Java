package example1;

public class Test {
	
	
		
		
		public A m1()
		{
			A a = new A();
			B b = new B();
			C c = new C();
			return a;
			//return b;
			//return c;
		} 
		 
		public B m2()
		{
			A a = new A();
			B b = new B();
			C c = new C();
			//return a; compile error
			return b;
			//return c;
		}
		
		public C m3()
		{
			A a = new A();
			B b = new B();
			C c = new C();
			//return a; compile error
			//return b;compile error
			return c;
		}
		public static void main(String[] args) {
			
			Test t = new Test();
			t.m1();
			t.m2();
			t.m3();
		}
	}




	
	


