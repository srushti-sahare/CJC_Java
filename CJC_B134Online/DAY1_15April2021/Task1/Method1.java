public class Method1
{
  public void m1()
  {
    System.out.println("hello m1");
   }
  public void m2()
  {
    System.out.println("hello m2");
   }
  public void m3()
  {
    System.out.println("hello m3");
   }
   public static void main(String args[])
   {
     System.out.println("this is our main");
     Method1 a = new Method1();
     a.m1();
     a.m2();
     a.m3();
   }
}