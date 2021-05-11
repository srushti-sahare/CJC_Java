public class Method2
{
  public void x1()
  {
    System.out.println("hello x1");
   }
  public void y1()
  {
    System.out.println("hello y1 ");
   }
  public void z1()
  {
    System.out.println("hello z1");
   }
   public static void main(String args[])
   {
     System.out.println("this is our main");
     Method2 a = new Method2();
     a.x1();
     a.y1();
     a.z1();
   }
}