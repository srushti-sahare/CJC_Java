public class Calculator
{
   public static void main(String args[])
   {
     Addition a = new Addition();
     int w= a.add();
     System.out.println("addition x is:" +w);
     Subtraction s = new Subtraction();
     int x= s.sub();
     System.out.println("subtraction x is:" +x);
     Multiplication m = new Multiplication();
      int y=m.mul() ;
      System.out.println("multiplication x is:" +y);
     Division d = new Division();
     int z= d.div();
     System.out.println("division x is:" +z);
    }
}
