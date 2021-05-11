public class Calculator
{
	int a = 70;
     int b = 35;
   public void add()
   {
     
     int c = a+b; 
     System.out.println("Addition is:" +c);
   }
    public void sub()
   {
     
     int c = a-b; 
     System.out.println("Subtraction is:" +c);
   }
    public void mul()
   {
   
     int c = a*b; 
     System.out.println("Multiplication is:" +c);
   }
    public void div()
   {
     
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