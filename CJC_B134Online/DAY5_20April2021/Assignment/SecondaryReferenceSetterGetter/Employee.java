public class Employee
{
	private int eid;
	private Ename en;
	private int esalary;
	private Emob em;
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public void setEn(Ename en)
	{
		this.en=en;
	}
	public void setEsalary(int esalary)
	{
		this.esalary=esalary;
	}
	public void setEm(Emob em)
	{
		this.em=em;
	}
	
	public int getEid()
	{
		return eid;
	}
	public Ename getEn()
	{
		return en;
	}
	public int getEsalary()
	{
		return esalary;
	}
	public Emob getEm()
	{
		return em;
	}
}
