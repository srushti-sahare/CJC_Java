public class Test
{
   public static void main(String args[])
   {
    
     Pancard p1 = new Pancard();
     p1.panid=1234;
     p1.panName="xyz";
   
     
    Person p2 = new Person();
    p2.pid=13025;
    p2.name="srushti";
    p2.pan =p1;

   System.out.println(p2.pid);
   System.out.println(p2.name);
   System.out.println(p2.pan.panid);
   System.out.println(p2.pan.panName);
  }
}
