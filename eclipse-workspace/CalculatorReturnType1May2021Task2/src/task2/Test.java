package task2;

public class Test {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int w=c.add();
		System.out.println("Addition is   " +w);
		int x=c.sub();
		System.out.println("Subtraction is   " +x);
		int y=c.mul();
		System.out.println("Multiplication is   " +y);
		int z=c.div();
		System.out.println("Division is   " +z);
	}

}
