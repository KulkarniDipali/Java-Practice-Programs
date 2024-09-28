package pack1;
import pack1.pack2.Discount;
public class Sale extends Customer implements Discount
{
	int pid;
	String pname;
	int qty;
	float price;
	public void input(int pid, String pname, int qty, float price)
	{
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	} 
	public void show2() // because in customer file there is a Show function cant't access as same names..
	{
		float bill = qty * price;
		float damt = bill * drate / 100;
		float netbill = bill - damt;
		System.out.println("Product's Details:");
		System.out.println("Id:" + pid);
		System.out.println("Name:" + pname);
		System.out.println("Quantity:" + qty);
		System.out.println("price:" + price);		
		System.out.println("Bill:" + bill);
		System.out.println("Discount Amount:" + damt);
		System.out.println("Netbill:" + netbill);
	}
}