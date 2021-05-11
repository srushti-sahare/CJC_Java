package task2;

public class Test {
	
	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		a.m2();
		System.out.println(a.a);
		System.out.println(a.b);
		
		
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.a);
		System.out.println(b.b);
		
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		
		
		E e = new E();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println(e.c);
		System.out.println(e.d);
		
		
		A a1 = new B();
		a1.m1();
		a1.m2();
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		
		A a2 = new C();
		a2.m1();
		a2.m2();
		System.out.println(a2.a);
		System.out.println(a2.b);
		
		
		
		A a3 = new E();
		a3.m1();
		a3.m2();
		System.out.println(a3.a);
		System.out.println(a3.b);
		
		
		B b1 = new C();
		b1.m1();
		b1.m2();
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		
		B b2 = new E();
		b2.m1();
		b2.m2();
		System.out.println(b2.a);
		System.out.println(b2.b);
		
		
		C c1 = new E();
		c1.m1();
		c1.m2();
		c1.m3();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		
		
		
		
	}

}
