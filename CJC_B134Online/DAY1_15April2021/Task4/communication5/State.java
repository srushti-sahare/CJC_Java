public class State
{
  public void maharashtra()
  {
    System.out.println("maharashtra for bollywood");
  }
  public void goa()
  {
    System.out.println("goa for beaches");
   }
  public void bihar()
  {
    System.out.println("bihar for monuments"); 
  }
  public static void main(String args[])
  {
    Maharashtra m = new Maharashtra();
    m.maharashtra();
    Goa g = new Goa();
    g.goa();
    Bihar b = new Bihar();
    b.bihar();
    State s = new State();
    s.maharashtra();
    s.goa();
    s.bihar();
  }
}
