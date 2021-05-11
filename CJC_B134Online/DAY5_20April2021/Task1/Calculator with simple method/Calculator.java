public class Calculator
{
   public void add()
   {
     int a = 10;
     int b = 20;
     int c = a+b; 
     System.out.println("Addition is:" +c);
   }
    public void sub()
   {
     int a = 40;
     int b = 30;
     int c = a-b; 
     System.out.println("Subtraction is:" +c);
   }
    public void mul()
   {
     int a = 50;
     int b = 60;
     int c = a*b; 
     System.out.println("Multiplication is:" +c);
   }
    public void div()
   {
     int a = 70;
     int b = 35;
     int c = a/b; 
     System.out.println("Division is:" +c);
   }
   public static void main(String args[])
   {
     Calculator c  = new Calculator();
     c.add();
	 c.sub();
	 c.mul();
	 c.div();
   }
}
 