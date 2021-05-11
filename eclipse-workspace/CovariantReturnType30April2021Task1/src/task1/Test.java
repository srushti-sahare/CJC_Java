package task1;

public class Test {
	
	public A m1()
	{
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		return a;
		//return c; child of a
		//return e; child of c,who is child of a
		
	}
	
	public B m2()
	{
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		return b;
		//retun d; child of b
	}
	
	public C m3()
	{
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		return c;
		//retun e;child of c
	}
	
	public D m4()
	{
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		return d;
		
		
	}
	public E m5()
	{
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		return e;
	}

}
