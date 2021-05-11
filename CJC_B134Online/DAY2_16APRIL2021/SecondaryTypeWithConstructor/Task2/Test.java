public class Test
{
	public static void main(String args[])
	{
		Author a = new Author("shivaji","sawant","history");
		System.out.println(a);
		
		Book b = new Book("RAU","Historical fiction","hardcover",2000,a);
		
		System.out.println(b.au);
		
		System.out.println(b.name);
		System.out.println(b.category);
		System.out.println(b.format);
		System.out.println(b.price);
		System.out.println(b.au.firstname);
		System.out.println(b.au.lastname);
		System.out.println(b.au.interest);
	}
}
		
		
	