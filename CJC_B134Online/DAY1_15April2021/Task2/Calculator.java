public class Calculator
{
  public void add()
  {
    System.out.println("call add method");
   }
  public void sub()
  {
    System.out.println("call sub method");
   }
  public void multi()
  {
    System.out.println("call multi method");
   }
    public void div()
  {
    System.out.println("call div method");
   }
   public static void main(String args[])
   {
     System.out.println("this is our main");
     Calculator c = new Calculator();
     c.add();
     c.sub();
     c.multi();
     c.div();
   }
}