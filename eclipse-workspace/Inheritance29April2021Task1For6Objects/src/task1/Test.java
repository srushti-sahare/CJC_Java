package task1;



public class Test {
	
public static void main(String[] args) {
	
	A a1 = new A();
	a1.m1();
	a1.m2();
	System.out.println(a1.a);
	System.out.println(a1.b);
	
	
	B b1 = new B();
	b1.m1();
	b1.m2();
	b1.m3();
	
	System.out.println(b1.a);
	System.out.println(b1.b);
	System.out.println(b1.c);
		
	
	C c1 = new C();
	c1.m1();
	c1.m2();
	c1.m3();
	c1.m4();
	
	System.out.println(c1.a);
	System.out.println(c1.b);
	System.out.println(c1.c);
	System.out.println(c1.d);
		
	
    A a = new B();
    a.m1();
	a.m2();
	
	
	
	System.out.println(a.a);
	System.out.println(a.b);
	
		
	B b = new C();
		
		b.m1();
		b.m2();
		b.m3();
		
		
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.c);
		
		
       A a2 = new C();
		
		a2.m1();
		a2.m2();
		
		
		
		System.out.println(a2.a);
		System.out.println(a2.b);
		
		

}
}

