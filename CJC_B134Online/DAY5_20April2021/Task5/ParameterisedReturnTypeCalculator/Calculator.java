public class Calculator
{
  public int add(int a,int b)
  {
    int c=a+b;
    return c;
  }
  public int sub(int a,int b)
  {
    int c=a-b;
    return c;
  }
  public int mul(int a,int b)
  {
    int c=a*b;
    return c;
  }
  public int div(int a,int b)
  {
    int c=a/b;
    return c;
  }
  public static void main(String args[])
  {
    Calculator c = new Calculator();
    int w= c.add(10,20);
    System.out.println("addition is :" +w);
	int x= c.sub(40,30);
    System.out.println("subtraction is :" +x);
	int y= c.mul(50,60);
    System.out.println("multiplication is :" +y);
	int z= c.div(70,35);
    System.out.println("division is :" +z);
  }
}
