public class Test
{
  public void m1()
  {
    System.out.println("m1==test");
  }
  public static void main(String args[])
  {
    A a = new A();
    a.m1();
    Test t = new Test();
    t.m1();
   }
}
 
    