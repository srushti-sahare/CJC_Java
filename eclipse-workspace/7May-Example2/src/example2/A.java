package example2;

public class A
{
	


		
		int x;
		static int y;
		
		public static void main(String[] args) {
			
			A a = new A();
			a.x=200;
			a.y=200;
			
			A a1 = new A();
			a1.x=50;
			a1.y=50;
			
			A a2 = new A();
			
			System.out.println(a.x);
			System.out.println(a.y);
			System.out.println(a1.x);
			System.out.println(a1.y);
			System.out.println(a2.x);
			System.out.println(a2.y);
			System.out.println(A.y);
			//System.out.println(A.x);//not possible coz its nonstatic
			
		}

	}



