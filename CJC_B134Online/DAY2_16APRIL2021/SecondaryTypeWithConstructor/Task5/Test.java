public class Test
{
	public static void main(String args[])
	{
		Pancard p1 = new Pancard(1234,"xyz");
		System.out.println(p1);
		
		Person p2 = new Person(13025,"srushti",p1);
		System.out.println(p2.pan);
		
		System.out.println(p2.pid);
		System.out.println(p2.name);
		System.out.println(p2.pan.panid);
		System.out.println(p2.pan.panName);
	}
}
