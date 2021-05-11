public class Religion
{
  public void hindu()
  {
    System.out.println("hello hindu");
  }
  public void muslim()
  {
    System.out.println("hello muslim");
  }
  public void christian()
  {
    System.out.println("hello christian");
  }
  public static void main(String args[])
  {
   Hindu h = new Hindu();
   h.hindu();
   Muslim m = new Muslim();
   m.muslim();
   Christian c = new Christian();
   c.christian();
   Religion r = new Religion();
   r.hindu();
   r.muslim();
   r.christian();
  }
}
