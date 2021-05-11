public class Calculator
{
  public int sum(int a,int b)
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
    Calculator c  = new Calculator();
    int w= c.sum(10,20);
    System.out.println("sum is :" +w);
	int x= c.sub(40,30);
    System.out.println("sub is :" +x);
	int y= c.mul(50,60);
    System.out.println("mul is :" +y);
	int z= c.div(70,35);
    System.out.println("div is :" +z);
  }
}
