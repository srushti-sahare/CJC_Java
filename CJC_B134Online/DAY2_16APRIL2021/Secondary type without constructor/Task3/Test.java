public class Test
{
  public static void main(String args[])
  {
    Engine e = new Engine();
    e.fueltype="Petrol/CNG";
    e.drivetype="FWD";
    e.weight="845kg";
    e.transmission="Manual";

    
    Car c = new Car();
    c.name="Alto";
    c.model="i10";
    c.color="Brown";
    c.year=2019;
    c.price=600000; 
    c.eng=e;
    

    System.out.println(c.name);
    System.out.println(c.model);
    System.out.println(c.color);
    System.out.println(c.year);
    System.out.println(c.price);
    System.out.println(c.eng.fueltype);
    System.out.println(c.eng.drivetype);
    System.out.println(c.eng.weight);
    System.out.println(c.eng.transmission);
  }
}
