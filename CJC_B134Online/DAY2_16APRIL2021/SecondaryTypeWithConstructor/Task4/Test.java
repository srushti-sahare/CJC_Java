public class Test
{
	public static void main(String args[])
	{
		Library l = new Library("Ramanuj",1000,200);
		System.out.println(l);
		
		College c = new College("KITS",1994,l);
		System.out.println(c.lib);
		
		System.out.println(c.name);
		System.out.println(c.year);
		System.out.println(c.lib.name);
		System.out.println(c.lib.totalbooks);
		System.out.println(c.lib.totalseats);
	}
}
