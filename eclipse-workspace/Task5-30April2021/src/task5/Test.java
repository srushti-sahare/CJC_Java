package task5;

public class Test {
	
	public Employee setDev()
	{
		Developer d = new Developer();
		d.empid=13025;
		d.name="srushti";
		d.designation="software developer";
		d.nosprint=141195;
		return d;
		
	}
	
	public Employee setTest()
	{
		Tester t = new Tester();
		t.empid=145461;
		t.name="SrushtiSahare";
		t.designation="software tester";
		t.notestcases=121132;
		
		return t;
	}
	
	public static void main(String[] args) {
		
		
		Test t1 = new Test();
		Developer d = (Developer)t1.setDev();
		Tester t = (Tester)t1.setTest();
		System.out.println(d.empid);
		System.out.println(d.name);
		System.out.println(d.designation);
		System.out.println(d.nosprint);
		System.out.println(t.empid);
		System.out.println(t.name);
		System.out.println(t.designation);
		System.out.println(t.notestcases);
	}

}
