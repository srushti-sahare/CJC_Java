public class Calculator
{
  public void add(int a, int b)
  {
    int c = a+b;
    System.out.println("c addition is :" +c);
  }
  public void sub(int a, int b)
  {
    int c = a-b;
    System.out.println("c subtraction is :" +c);
  }
  public void mul(int a, int b)
  {
    int c = a*b;
    System.out.println("c multiplication is :" +c);
  }
  public void div(int a, int b)
  {
    int c = a/b;
    System.out.println("c division is :" +c);
  }
  public static void main(String args[]) 
  {
    Calculator c  = new Calculator();
    c.add(10,20);
	c.sub(40,30);
	c.mul(50,60);
	c.div(70,35);
   }
}