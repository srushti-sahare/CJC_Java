public class Test 
{
	public static void main(String args[])
	{
		Ename e1 = new Ename();
		e1.name="srushti";
		e1.nickname="srusha";
		
		Emob e2 = new Emob();
		e2.firstMobNo=1234567890l;
		e2.secondMobNo=1987654322l;
		
		
		Employee e = new Employee();
		e.eid=13025;
		e.en=e1;
		e.esalary=500000;
		e.em=e2;
		
		System.out.println(e.eid);
		System.out.println(e.en.name);
		System.out.println(e.en.nickname);
		System.out.println(e.esalary);
		System.out.println(e.em.firstMobNo);
		System.out.println(e.em.secondMobNo);
	}
}
