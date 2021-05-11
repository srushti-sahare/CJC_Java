public class Continent
{
  public void europe()
  {
    System.out.println("europe is small");
  }
  public void asia()
  {
    System.out.println("asia is big");
  }
  public void africa()
  {
    System.out.println("africa is average");
  } 
  public static void main(String args[])
  {
    Europe e = new Europe();
    e.europe();
    Asia as = new Asia();
    as.asia();
    Africa af = new Africa();
    af.africa();
    Continent c = new Continent();
    c.europe();
    c.asia();
    c.africa();
   }
}
 