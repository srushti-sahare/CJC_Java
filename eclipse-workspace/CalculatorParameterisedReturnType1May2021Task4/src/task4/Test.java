package task4;
public class Test {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int w=c.add(10,20);
		System.out.println("Addition is    " +w );
		int x=c.sub(7,8);
		System.out.println("Subtraction is   "+x);
		int y=c.mul(9,4);
		System.out.println("Multiplication is   "+y);
		int z=c.div(5,6);
		System.out.println("Division is   "+z);

	}

}
