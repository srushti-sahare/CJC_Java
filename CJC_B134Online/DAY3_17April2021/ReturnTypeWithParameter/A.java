public class A
{
  public int add(int a,int b)
  {
    int c=a+b;
    return c;
  }
  public static void main(String args[])
  {
    A a = new A();
    int x= a.add(10,20);
    System.out.println("x is :" +x);
  }
}
