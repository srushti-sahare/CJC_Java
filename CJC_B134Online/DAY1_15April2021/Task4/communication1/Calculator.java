public class Calculator
{
  public void add()
  {
    System.out.println("add in calculator");
  } 
   public void sub()
  {
    System.out.println("sub in calculator");
  } 
   public void mul()
  {
    System.out.println("mul in calculator");
  } 
   public void div()
  {
    System.out.println("div in calculator");
  } 
  public static void main(String args[])
  {
    Addition a = new Addition();
    a.add();
    Subtraction s = new Subtraction();
    s.sub();
    Multiplication m = new Multiplication();
    m.mul();
    Division d = new Division();
     d.div();
    Calculator c = new Calculator();
    c.add();
    c.sub();
    c.mul();
    c.div();
  }
}
    