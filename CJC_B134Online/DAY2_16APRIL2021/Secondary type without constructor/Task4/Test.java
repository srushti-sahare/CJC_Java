public class Test
{
  public static void main(String args[])
  {
    
    Library l = new Library();
    l.name="Ramanuj";
    l.totalbooks=1000;
    l.totalseats=200;

    College c = new College();
    c.name="KITS"; 
    c.year=1994;
    c.lib=l;

    System.out.println(c.name);
    System.out.println(c.year);
    System.out.println(c.lib.name);
    System.out.println(c.lib.totalbooks);
    System.out.println(c.lib.totalseats);
  }
}
