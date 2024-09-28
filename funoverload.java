class Emp
{
	int eid;
	String ename;
	float esal;
	void get()
	{
	  eid = 1;
	  ename = "abc";
	  esal = 50000f; 
	}
	void get(int eid, String ename, float esal )
	{
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	void show()
	{
		System.out.println(eid +"  " +ename+ "  " +esal);
	}
}
class funoverload
{
	public static void main(String args[])
	{
		Emp e1 = new Emp();
		e1.get();
		e1.show();
		e1.get(2, "pqr", 60000f);
		e1.show();
	}
}