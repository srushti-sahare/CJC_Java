public class A
{
  public int add()
  {
    int a=10;
    int b=20;
    int c=a+b;
    return c;
   }
   public static void main(String args[])
   {
     A a = new A();
     int x=a.add();
     System.out.println("x is :" +x);
   }
}
