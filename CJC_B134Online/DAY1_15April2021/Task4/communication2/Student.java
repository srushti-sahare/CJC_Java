public class Student
{
  public void name()
  {
    System.out.println("name is srushti");
  }
  
  public void rollno()
  {
    System.out.println("rollno is 13025");
  }
  public void address()
  {
    System.out.println("address is cjc");

  }
  public static void main(String args[])
  {
    Name n = new Name();
    n.name();
    Rollno r = new Rollno();
    r.rollno();
    Address a = new Address();
    a.address();
    Student s = new Student();
    s.name();
    s.rollno();
    s.address();
  }
}
 