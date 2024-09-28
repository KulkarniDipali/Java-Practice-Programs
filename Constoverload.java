import java.util.*;

class Emp
{
	int eid;
	String ename;
	float esal;
	Emp()
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter employee id:");
   	   eid = sc.nextInt();
	   System.out.print("Enter employee name:");
	   ename = sc.next();
	   System.out.print("Enter employee salary:");
	   esal = sc.nextFloat(); 
	}
	Emp(int eid, String ename, float esal )
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
class Constoverload
{
	public static void main(String args[])
	{
		Emp e1 = new Emp();
		Emp e2 = new Emp(2, "pqr", 60000f);
		e1.show();
		e2.show();
	}
}