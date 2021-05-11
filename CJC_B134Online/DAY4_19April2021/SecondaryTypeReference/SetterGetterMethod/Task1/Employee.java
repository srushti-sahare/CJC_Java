public class Employee
{
	private int eid;
	private String ename;
	private double esalary;
	private long emob;
	private String ecompanyname;
	private String esharevalue;
	
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	
	public void setEsalary(double esalary)
	{
		this.esalary=esalary;
	}
	
	public void setEmob(long emob)
	{
		this.emob=emob;
	}
	public void setEcompanyname(String ecompanyname)
	{
		this.ecompanyname=ecompanyname;
	}
	public void setEsharevalue(String esharevalue)
	{
		this.esharevalue=esharevalue;
	}
	
	
	public int getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return ename;
	}
	
	public double getEsalary()
	{
		return esalary;
	}
	
	public long getEmob()
	{
		return emob;
	}
	public String getEcompanyname()
	{
		return ecompanyname;
	}
	public String getEsharevalue()
	{
		return esharevalue;
	}
	
}
