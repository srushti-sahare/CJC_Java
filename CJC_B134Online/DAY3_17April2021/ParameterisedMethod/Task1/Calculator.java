public class Calculator
{
  public void add(byte a, byte b)
  {
    int c=a+b;
    System.out.println("c byte is :" +c);
  }
  public void sub(short a, short b)
  {
    int c=a-b;
    System.out.println("c short is :" +c);
  }
  public void mul(int a, int b)
  {
    int c=a*b;
    System.out.println("c int is :" +c);
  }
  public void div(long a, long b)
  {
    long c=a/b;
    System.out.println("c long is :" +c);
  }
  public void add1(float a, float b)
  {
    float c=a+b;
    System.out.println("c  float is :" +c);
  }
  public void sub1(double a, double b)
  {
    double c=a-b;
    System.out.println("c double is :" +c);
  }
public static void main(String args[])
{
  Calculator c = new Calculator();
  c.add((byte)10,(byte)20);
  c.sub((short)40,(short)30);
  c.mul(50,60);
  c.div(70,35);
  c.add1(80.0f,90.0f);
  c.sub1(300.0d,200.0d);
 }
}
 
