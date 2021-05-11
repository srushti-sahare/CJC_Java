public class Test 
{
	public Student m1()
	{
		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("XYZ");
		return stu;
	}
	public static void main(String args[])
	{
		Test t = new Test();
		
		Student s = t.m1();
		
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
}
