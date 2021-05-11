public class Test 
{
	public static void main(String args[])
	{
		Ename e1 = new Ename();
		e1.setName("srushti");
		e1.setNickname("srusha");
		
		Emob e2 = new Emob();
		e2.setFirstMobNo(1234567890l);
		e2.setSecondMobNo(1987654322l);
		
		Employee e = new Employee();
		e.setEid(13025);
		e.setEn(e1);
		e.setEsalary(500000);
		e.setEm(e2);
		
		

		System.out.println(e.getEid());
		System.out.println(e.getEn().getName());
		System.out.println(e.getEn().getNickname());
		System.out.println(e.getEsalary());
		System.out.println(e.getEm().getFirstMobNo());
		System.out.println(e.getEm().getSecondMobNo());
	
	}
}
