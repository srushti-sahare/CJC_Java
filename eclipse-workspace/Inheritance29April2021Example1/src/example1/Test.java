
package example1;

public class Test {
	
	public static void main(String[] args) {
		
		A a = new B();
		
		a.m1();
		a.m2();
		
		System.out.println(a.a);
		System.out.println(a.b);
		
		
        A a1 = new A();
		
		a1.m1();
		a1.m2();
		
		System.out.println(a1.a);
		System.out.println(a1.b);
	}

}
