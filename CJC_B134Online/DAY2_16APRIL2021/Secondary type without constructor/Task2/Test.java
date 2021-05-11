public class Test
{
  public static void main(String args[])
  {
    Author a = new Author();
    a.firstname="shivaji";
    a.lastname="sawant";
    a.interest="history";

   Book b = new Book();
   b.name="RAU"; 
   b.category="Historical fiction";
   b.format="hardcover";
   b.price=2000;
   b.au=a;

   System.out.println(b.name);
   System.out.println(b.category);
   System.out.println(b.format);
   System.out.println(b.price);
   System.out.println(b.au.firstname);
   System.out.println(b.au.lastname);
   System.out.println(b.au.interest);
   
  }
}
