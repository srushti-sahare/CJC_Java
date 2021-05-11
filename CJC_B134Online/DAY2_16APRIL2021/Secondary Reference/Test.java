public class Test
{
  public static void main(String args[])
  {
    Address adr = new Address("pune","karvenagar");
    System.out.println(adr);
    Student s1 = new Student(1,"xyz",adr);

    System.out.println(s1.addr);
    System.out.println(s1.rollno);
    System.out.println(s1.name);
    System.out.println(s1.addr.cityname);
    System.out.println(s1.addr.areaname);
  }
}

