public class Calculator
{
   public static void main(String args[])
   {
     Addition a = new Addition();
     int w= a.add(10,20);
     System.out.println("addition x is:" +w);
     Subtraction s = new Subtraction();
     int x= s.sub(40,30);
     System.out.println("subtraction x is:" +x);
     Multiplication m = new Multiplication();
      int y=m.mul(50,60) ;
      System.out.println("multiplication x is:" +y);
     Division d = new Division();
     int z= d.div(70,35);
     System.out.println("division x is:" +z);
    }
}
