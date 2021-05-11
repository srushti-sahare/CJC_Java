public class Test
{
	public static void main(String args[])
	{
		Engine e = new Engine("Petrol/CNG","FWD","845KG","Manual");
		System.out.println(e);
		
		Car c = new Car("Alto","i10","Brown",2019,600000,e);
		System.out.println(c.eng);
		
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
