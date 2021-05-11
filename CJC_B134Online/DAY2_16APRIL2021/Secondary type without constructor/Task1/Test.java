public class Test
{
  public static void main(String args[])
  {
    Address ad = new Address();
    ad.apartmentname="suncity";
    ad.apartmentno=100;

   Employee e = new Employee();
   e.idno=13025;
   e.name="srushti";
   e.addr=ad;

    System.out.println(e.idno);
    System.out.println(e.name);
    System.out.println(e.addr.apartmentname);
    System.out.println(e.addr.apartmentno);
  }
}

    
 