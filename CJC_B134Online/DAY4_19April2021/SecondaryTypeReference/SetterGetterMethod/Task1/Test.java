public class Test{
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.setEid(13025);
		e.setEname("srushti");
		e.setEsalary(500000);
		e.setEmob(1234567890);
		e.setEcompanyname("CJC");
		e.setEsharevalue("50$");
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getEsalary());
		System.out.println(e.getEmob());
		System.out.println(e.getEcompanyname());
		System.out.println(e.getEsharevalue());
	}
}
