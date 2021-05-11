public class Test 
{
	public static void main(String args[])
	{
		Ename e1 = new Ename("srushti","srusha");
		System.out.println(e1);
		
		Emob e2 = new Emob(1234567890l,1987654322l);
		System.out.println(e2);
		
		Employee e = new Employee(13025,e1,500000,e2);
		
		System.out.println(e.em);
		System.out.println(e.en);
		System.out.println(e.eid);
		System.out.println(e.en.name);
		System.out.println(e.en.nickname);
		System.out.println(e.esalary);
		System.out.println(e.em.firstMobNo);
		System.out.println(e.em.secondMobNo);
	}
}
