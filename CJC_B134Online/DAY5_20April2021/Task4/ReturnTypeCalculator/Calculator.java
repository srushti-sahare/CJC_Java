public class Calculator
{
  public int add()
  {
    int a=10;
    int b=20;
    int c=a+b;
    return c;
   }
   public int sub()
  {
    int a=40;
    int b=30;
    int c=a-b;
    return c;
   }
   public int mul()
  {
    int a=50;
    int b=60;
    int c=a*b;
    return c;
   }
   public int div()
  {
    int a=70;
    int b=35;
    int c=a/b;
    return c;
   }
   public static void main(String args[])
   {
     Calculator c = new Calculator();
     int w =c.add();
     System.out.println("addition is :" +w);
	 int x =c.sub();
     System.out.println("subtraction is :" +x);
	 int y =c.mul();
     System.out.println("multiplication is :" +y);
	 int z =c.div();
     System.out.println("division is :" +z);
   }
}