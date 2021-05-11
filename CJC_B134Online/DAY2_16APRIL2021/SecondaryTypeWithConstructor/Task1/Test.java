public class Test
{
   public static void main(String args[])
   {
     
     Address ad = new Address("suncity",100);
     System.out.println(ad); 

     Employee e = new Employee(13025,"srushti",ad);
     System.out.println(e.addr);
	 
     System.out.println(e.idno);
     System.out.println(e.name);
     System.out.println(e.addr.apartmentname);
     System.out.println(e.addr.apartmentno);
   }
}


