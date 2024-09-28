package pack1;
public class Customer
{
	int cid;
	String cname;
	public void get(int cid, String cname)
	{
		this.cid = cid;
		this.cname = cname;
	}
	public void show()
	{
		System.out.println("Customer's Details:");
		System.out.println("Id:" + cid);
		System.out.println("Name:" + cname);		
	}
}