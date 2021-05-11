public class Car
{
  public void suzuki()
  {
    System.out.println("suzuki is average");
  }
  public void ford()
  {
    System.out.println("ford is good");
  }
  public void dodge()
  {
    System.out.println("dodge is bad");
  }
  public static void main(String args[])
  {
    Suzuki s = new Suzuki();
    s.suzuki();
    Ford f = new Ford();
    f.ford();
    Dodge d = new Dodge();
    d.dodge();
    Car c = new Car();
    c.suzuki();
    c.ford();
    c.dodge();
   }
}
  